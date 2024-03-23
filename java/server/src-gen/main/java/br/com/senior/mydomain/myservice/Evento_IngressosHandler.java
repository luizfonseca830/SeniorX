/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.mydomain.myservice.IngressoEntity.SECURITY_RESOURCE;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.senior.messaging.customspringdata.EntityInfo;

import javax.inject.Inject;
import org.springframework.dao.DataIntegrityViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.mydomain.myservice.Ingresso.PagedResults;

@HandlerImpl(serviceClass = MyServiceConstants.class)
public class Evento_IngressosHandler implements CreateEvento_Ingressos, CreateMergeEvento_Ingressos, UpdateEvento_Ingressos,
		UpdateMergeEvento_Ingressos, DeleteEvento_Ingressos, RetrieveEvento_Ingressos, ListEvento_Ingressos {
	
	static final Logger logger = LoggerFactory.getLogger(Evento_IngressosHandler.class);
	
	private static final String ID_FIELD_NAME = Arrays.stream(IngressoEntity.class.getDeclaredFields())
            .filter(field -> field.isAnnotationPresent(javax.persistence.Id.class))
            .map(Field::getName)
            .findFirst()
            .orElseGet(() -> "id");
	
	@Inject
	IngressoCrudService service;
	
	@Inject
	EventoCrudService masterService;
	
	
	@Inject
	IngressoDTOConverter dtoConverter;
	
	@Inject
	TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Ingresso createEvento_Ingressos(Ingresso toCreate) {
		try {
			IngressoEntity entity = dtoConverter.toEntity(toCreate);
			entity.setEvento(getParentEntity());
			return dtoConverter.toDTO(service.createIngresso(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Ingresso createMergeEvento_Ingressos(Ingresso toCreateMerge) {
		try {
			IngressoEntity entity = dtoConverter.toEntity(toCreateMerge);
			entity.setEvento(getParentEntity());
			return dtoConverter.toDTO(service.createIngresso(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Ingresso updateEvento_Ingressos(Ingresso toUpdate) {
		try {
			IngressoEntity entity = service.retrieveIngresso(new Ingresso.Id(toUpdate.id));
			EventoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getEvento() == null || !entity.getEvento().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.ingresso_notFound", "Evento.ingressos not found with id " + toUpdate.id));
			}
			dtoConverter.updateEntity(entity, toUpdate);
			entity.setEvento(masterEntity);
			return dtoConverter.toDTO(service.updateIngresso(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public Ingresso updateMergeEvento_Ingressos(Ingresso toUpdateMerge) {
		try {
			//The entity id is required and need to be validated accordly.
			if (toUpdateMerge.id == null) {
				throw new IllegalArgumentException("Ingressos.id is required");
			}
			
			IngressoEntity entity = service.retrieveIngresso(new Ingresso.Id(toUpdateMerge.id));
			EventoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getEvento() == null || !entity.getEvento().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.ingresso_notFound", "Evento.ingressos not found with id " + toUpdateMerge.id));
			}
			dtoConverter.mergeEntity(entity, toUpdateMerge);
			return dtoConverter.toDTO(service.updateIngresso(entity));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Transactional
	@Override
	public void deleteEvento_Ingressos(Ingresso.Id id) {
		try {
			IngressoEntity entity = service.retrieveIngresso(id);
			EventoEntity masterEntity = getParentEntity();
			if (entity == null || entity.getEvento() == null || !entity.getEvento().getId().equals(masterEntity.getId())) {
				throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.ingresso_notFound", "Evento.ingressos not found with id " + id));
			}
			service.deleteIngresso(id);
		} catch (org.hibernate.exception.ConstraintViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.ingresso_constraintViolation", "Constraint Violation " + ex.getClass().getSimpleName()), ex);
		} catch(DataIntegrityViolationException ex) {
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.ingresso_dataIntegrityViolation", "Data integrity violation to Update Ingresso. Error: "
				+ ex.getMessage()), ex);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Ingresso retrieveEvento_Ingressos(Ingresso.GetRequest request) {
		try {
			IngressoEntity entity = service.retrieveIngresso(new Ingresso.Id(request.id));
			EventoEntity masterEntity = getParentEntity();
			if (entity.getEvento() == null || !entity.getEvento().getId().equals(masterEntity.getId())) {
				entity = null;
			}
			List<String> displayFields = request.displayFields == null ? getDefaultDisplayFields() : request.displayFields;
			return dtoConverter.toDTO(entity, displayFields);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listEvento_Ingressos(Ingresso.PageRequest pageRequest) {
		try {
			int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
			int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
			String orderBy = pageRequest.orderBy == null ? ID_FIELD_NAME + " asc" : pageRequest.orderBy;
			String filter = pageRequest.filter != null ? String.format("(%s)", pageRequest.filter) : null;
			EntityInfo parentEntityInfo = new EntityInfo(EventoEntity.class, java.util.UUID.fromString(getParentId().id), "ingressos");
			Page<IngressoEntity> pages = service.listIngressoPageable(skip, top, orderBy, filter, parentEntityInfo);
			List<IngressoEntity> entities = pages.getContent();
			List<String> displayFields = pageRequest.displayFields == null ? getDefaultDisplayFields() : pageRequest.displayFields;
			List<Ingresso> dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, displayFields)).collect(Collectors.toList()) : null;
			return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			throw e;
		}catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_illegalArgument", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, translationHubApi.getMessage("my_domain.my_service.ingresso_internalError", "An internal error occurred: "
				+ e.getClass().getSimpleName() + ". Please check the request parameters and try again."), e);
		}
	}
	
	
	public static List<String> getDefaultDisplayFields(){
		List<String> displayFields = new ArrayList<String>();
		displayFields.add("*");
		return displayFields;
	}
	
	private String getParentIdHeader() {
		Message message = getMessage();
		return message.containsHeader(Message.ENTITY_PARENT_ID_HEADER) ? message.getHeader(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
	}
	
	private Evento.Id getParentId() {
		String parentId = getParentIdHeader();
		if (parentId == null) {
			throw new IllegalArgumentException("Header '" + Message.ENTITY_PARENT_ID_HEADER + "' is required");
		}
		return new Evento.Id(java.util.UUID.fromString(parentId).toString());
	}
	
	private EventoEntity getParentEntity() {
		Evento.Id parentId = getParentId();
		EventoEntity entity = masterService.retrieveEvento(parentId);
		if (entity == null) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getMessage("my_domain.my_service.evento_notFound", "Evento not found with id " + parentId.id));
		}
		return entity;
	}
}
