/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.io.IOUtils;
import org.apache.olingo.commons.api.edmx.EdmxReference;
import org.apache.olingo.commons.api.http.HttpMethod;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataHandler;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.ODataResponse;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.processor.EntityCollectionProcessor;
import org.apache.olingo.server.api.processor.EntityProcessor;
import org.apache.olingo.server.api.processor.ErrorProcessor;
import org.apache.olingo.server.api.processor.PrimitiveProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.custom.odata.edm.CustomDataEdmProvider;

@Component("my_domain.my_service.ODataCustomHandler")
@HandlerImpl
public class ODataCustomHandler implements Odata {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ODataCustomHandler.class);
    
	public static final String ODATA_REQUEST_METHOD = "odata_request_method";
		public static final String ODATA_REQUEST_PROTOCOL = "odata_request_protocol";
		public static final String ODATA_REQUEST_HEADERS_COUNT = "odata_request_headers_count";
		public static final String ODATA_REQUEST_HEADERS = "odata_request_headers";
		public static final String ODATA_REQUEST_RAWREQUESTURI = "odata_request_rawrequesturi";
		public static final String ODATA_REQUEST_RAWBASEURI = "odata_request_rawbaseuri";
		public static final String ODATA_REQUEST_RAWODATAPATH = "odata_request_rawodatapath";
		public static final String ODATA_REQUEST_RAWQUERYPATH = "odata_request_rawquerypath";
	
		public static final String ODATA_RESPONSE_STATUSCODE = "odata_response_statuscode";
		public static final String ODATA_RESPONSE_HEADERS = "odata_response_headers";
		private static final String ODATA_PRIMITIVE_RESPONSE_NAME = "odataResponse";
	
		@Inject
	    private EntityCollectionProcessor entityCollectionProcessor;
	
		@Inject
		private EntityProcessor entityProcessor;
	
		@Inject
		private PrimitiveProcessor primitiveProcessor;
	
		@Inject
		private ErrorProcessor errorProcessor;
	
		@Inject
		private CustomDataEdmProvider edmProvider;
	
		@PersistenceContext
	    private EntityManager entityManager;
	
		@Override
		public void odata() {
			OData odata = OData.newInstance();
			ServiceMetadata edm = odata.createServiceMetadata(edmProvider, new ArrayList<EdmxReference>());
			ODataHandler handler = odata.createRawHandler(edm);
	
			Message message = ServiceContext.get().getCurrentMessage();
			try {
				ODataRequest oDataRequest = getODataRequest(message);
	
				handler.register(entityCollectionProcessor);
				handler.register(entityProcessor);
				handler.register(primitiveProcessor);
				handler.register(errorProcessor);
	
				ODataResponse oDataResponse = handler.process(oDataRequest);
	
				String content = "";
			    if (oDataResponse.getContent() != null) {
			        content = IOUtils.toString(oDataResponse.getContent(), StandardCharsets.UTF_8);
			    }
	
				Message response = message.reply(ODATA_PRIMITIVE_RESPONSE_NAME, content.getBytes(StandardCharsets.UTF_8));
				addODataResponseHeaders(response, oDataResponse);
				getServiceRunner().send(response);
			} catch (Exception e) {
				LOGGER.error("Error processing OData request", e);
			}
		}
	
		private void addODataResponseHeaders(Message response, ODataResponse oDataResponse) {
			response.addHeader(ODATA_RESPONSE_STATUSCODE, oDataResponse.getStatusCode());
		    Map<String, List<String>> headers =  oDataResponse.getAllHeaders();
		    response.addHeader(ODATA_RESPONSE_HEADERS, headers);
		}
	
		private ODataRequest getODataRequest(Message message) {
			ODataRequest request = new ODataRequest();
	
			String content = new String(message.getContent(), StandardCharsets.UTF_8);
	        request.setBody(new ByteArrayInputStream(content.getBytes()));
	
			//Get the OData parameters from message headers
			request.setMethod(HttpMethod.valueOf(getMessageHeader(message, ODATA_REQUEST_METHOD, HttpMethod.GET.name())));
			request.setProtocol(getMessageHeader(message, ODATA_REQUEST_PROTOCOL, ""));
	
			if (message.containsHeader(ODATA_REQUEST_HEADERS)) {
	    		@SuppressWarnings("unchecked")
				Map<String, List<Object>> headers = (Map<String, List<Object>>) message.getHeader(ODATA_REQUEST_HEADERS);
	    		headers.forEach((k, v) -> {
	    			List<String> values = new ArrayList<>();
	    			v.forEach(i -> values.add(i.toString()));
	    			request.addHeader(k, values);
	    		});
	    	}
	
			request.setRawRequestUri(getMessageHeader(message, ODATA_REQUEST_RAWREQUESTURI, null));
			request.setRawBaseUri(getMessageHeader(message, ODATA_REQUEST_RAWBASEURI, null));
			request.setRawODataPath(getMessageHeader(message, ODATA_REQUEST_RAWODATAPATH, null));
			request.setRawQueryPath(getMessageHeader(message, ODATA_REQUEST_RAWQUERYPATH, null));
	
			return request;
		}
	
		private String getMessageHeader(Message message, String name, String defaultValue) {
			String value = defaultValue;
			if (message.containsHeader(name)){
				value = message.getHeader(name).toString();
				if (value.isEmpty()) {
	                value = null;
	            }
			}
			return value;
		}
	}
