package br.com.senior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.utils.DtoJsonConverter;

public class EventPublisher {
	
	private static final Logger logger = LoggerFactory.getLogger(EventPublisher.class);
	
	private static void publish(String eventName, byte[] payload) {
		final ServiceContext serviceContext = ServiceContext.get();
			
		final String tenant = serviceContext.getCurrentTenant();
			
		try {
			String domain =  serviceContext.getCurrentService().getDomain();
			String  service = serviceContext.getCurrentService().getName();
			Message message = serviceContext.getCurrentMessage().followUp(tenant, domain, service, eventName, payload);
			message.setUsername(serviceContext.getCurrentUsername());
			serviceContext.getCurrentMessenger().publish(message);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	public static <T> void publish(String eventName, T dto) {
		publish(eventName, DtoJsonConverter.toJSON(dto));
	}
}
