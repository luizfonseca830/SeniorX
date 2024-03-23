/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.*;
import static br.com.senior.mydomain.myservice.IngressoEntity.SECURITY_RESOURCE;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.Ingresso.Id;
import br.com.senior.mydomain.myservice.Ingresso.PageRequest;
import br.com.senior.mydomain.myservice.Ingresso.PagedResults;
import org.springframework.stereotype.Component;

@HandlerImpl(serviceClass = MyServiceConstants.class)
@Component("my_domain.my_service.IngressoHandler")
public class IngressoHandler implements  RetrieveIngresso, ListIngresso {
	static final Logger logger = LoggerFactory.getLogger(IngressoHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(IngressoEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");

	@Inject
	IngressoCrudService service;
	
	@Inject
	IngressoDTOConverter dtoConverter;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Ingresso retrieveIngresso(Ingresso.GetRequest request) {
		IngressoEntity entity = service.retrieveIngresso(new Ingresso.Id(request.id));
		List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
		return dtoConverter.toDTO(entity, displayFields);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listIngresso(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<IngressoEntity> pages = this.service.listIngressoPageable(skip, top, orderBy, filter);
		List<IngressoEntity> entities = pages.getContent();
		List<Ingresso> dtos = null;
		List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	public static List<String> getDefaultDisplayFields(){
		List<String> displayFields = new ArrayList<String>();
		displayFields.add("*");
		return displayFields;
	}
}
