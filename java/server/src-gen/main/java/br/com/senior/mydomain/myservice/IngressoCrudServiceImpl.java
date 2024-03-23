/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Optional;

import javax.inject.Inject;

import org.apache.commons.collections.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import br.com.senior.custom.session.SessionInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.senior.mydomain.myservice.Ingresso.Id;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.customspringdata.CustomOrder;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.messaging.customspringdata.filter.FilterParser;
import br.com.senior.messaging.customspringdata.FilterParameters;
import br.com.senior.messaging.customspringdata.IntrospectorUtil;
import br.com.senior.messaging.customspringdata.Join;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@Service("my_domain.my_service.IngressoCrudServiceImpl")
public class IngressoCrudServiceImpl implements IngressoCrudService {
	
	private static final Logger logger = LoggerFactory.getLogger(IngressoCrudServiceImpl.class);
	
	@Inject
	protected IngressoBaseRepository repository;
	
	@Inject
	protected FilterParser filterParser;
	
	@Inject
	private TranslationHubApi translationHubApi;
	
	@Inject
	private ConvidadoCrudService convidadoCrudService;
	
	@Inject
	private EventoCrudService eventoCrudService;

	@Inject
	private SessionInitializer sessionInitializer;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public IngressoEntity create(IngressoEntity entity) {
		prepareSession();
		try {
			return this.repository.saveAndFlush(entity);
		} catch (DataIntegrityViolationException | org.springframework.dao.InvalidDataAccessApiUsageException ex) {
			if(ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				if(!("my_domain.my_service.create_entity_constraint_violation_" + cve.getConstraintName()).equals(translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_constraint_violation_" + cve.getConstraintName()))) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_constraint_violation_" + cve.getConstraintName()));						
				}
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_constraint_violation", cve.getConstraintName()));
			}
			
			if(ex.getCause() instanceof IllegalStateException) {
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.create_entity_transient", ex.getMessage()));
			}
			
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.ingressoEntity_dataIntegrityViolation", "Data integrity violation to Create IngressoEntity. Error: " + ex.getMessage()));
		}
	}
	
	@Override
	@Transactional
	public IngressoEntity createIngresso(IngressoEntity entity) {
		return create(entity);
	}
	
	@Override
	@Deprecated
	@Transactional
	public IngressoEntity createMergeIngresso(IngressoEntity entity) {
		return create(entity);
	}
	
	@Override
	@Transactional
	public IngressoEntity updateIngresso(IngressoEntity entity) {
		prepareSession();
		try {
			return repository.saveAndFlush(entity);
		} catch (DataIntegrityViolationException | org.springframework.dao.InvalidDataAccessApiUsageException ex) {
			if (ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				if(!("my_domain.my_service.update_entity_constraint_violation_" + cve.getConstraintName()).equals(translationHubApi.getFormattedMessage("my_domain.my_service.update_entity_constraint_violation_" + cve.getConstraintName()))) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.update_entity_constraint_violation_" + cve.getConstraintName()));						
				}
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.update_entity_constraint_violation", cve.getConstraintName()));
			}
			
			if (ex.getCause() instanceof IllegalStateException) {
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("my_domain.my_service.update_entity_transient", ex.getMessage()));
			}
			
			throw new ServiceException(ErrorCategory.CONFLICT, translationHubApi.getMessage("my_domain.my_service.ingressoEntity_dataIntegrityViolation", "Data integrity violation to Update IngressoEntity. Error: " + ex.getMessage()));
		}
	}
	
	@Override
	@Deprecated
	@Transactional
	public IngressoEntity updateMergeIngresso(IngressoEntity entity) {
		return updateIngresso(entity);
	}
	
	@Override
	@Transactional
	public void deleteIngresso(Id id) {
		prepareSession();
		try {
			IngressoEntity entity = retrieveIngresso(id);
			EventoEntity masterEntity = entity.getEvento();
			masterEntity.getIngressos().remove((Object) entity);
			repository.delete(entity);
			repository.flush();
	    } catch  (EmptyResultDataAccessException ex) {
	    	throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getExternalMessage("my_domain", "my_service", "my_domain.my_service.ingresso_notFound", "Ingresso not found with id " + id.id));
	    } catch (DataIntegrityViolationException ex) {
			if (ex.getCause() instanceof org.hibernate.exception.ConstraintViolationException) {
				org.hibernate.exception.ConstraintViolationException cve = (org.hibernate.exception.ConstraintViolationException) ex.getCause();
				throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getFormattedMessage("my_domain.my_service.delete_entity_constraint_violation_" + cve.getConstraintName()));
			}
		}
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IngressoEntity retrieveIngresso(Id id) {
		prepareSession();
		Optional<IngressoEntity> optionalEntity = this.repository.findById(java.util.UUID.fromString(id.id));
		if (optionalEntity.isEmpty()) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getExternalMessage("my_domain", "my_service", "my_domain.my_service.ingresso_notFound", "Ingresso not found with id " + id.id));
		}
		return optionalEntity.get();
	}
	
	@Override
	@Deprecated
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<IngressoEntity> listIngresso(int skip, int top) {
		prepareSession();
		List<IngressoEntity> entities = this.repository.findAll(null, null, null, skip, top);
		return entities;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<IngressoEntity> listIngressoPageable(int skip, int top) {
		return listIngressoPageable(skip, top, null, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<IngressoEntity> listIngressoPageable(int skip, int top, String orderBy) {
		return listIngressoPageable(skip, top, orderBy, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<IngressoEntity> listIngressoPageable(int skip, int top, String orderBy, String filter) {
		prepareSession();
		int page = skip * top; //zero-based page index.
		int size = top > 0 ? top : 10; //the size of the page to be returned.
		List<CustomOrder> customOrder = new ArrayList<>();
		if (orderBy != null && !orderBy.trim().isEmpty()) {
			String[] ordersby = orderBy.split(",");
			for (String orderby : ordersby) {
				String[] orderparts = orderby.trim().split("\\s+");
				boolean desc = orderparts.length > 1 && orderparts[1].toUpperCase().equals("DESC");
				CustomOrder co = new CustomOrder(orderparts[0]);
				co.setDesc(desc);
				customOrder.add(co);
			}
		}
		filter = replaceFilterEscapedChars(filter);
		FilterParameters filterParameters = null;
		try {
			filterParameters = filterParser.parseFilter(filter, IngressoEntity.class);
			filterParameters.setValues(getFixedValuesToFilter(filterParameters));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("my_domain.my_service.ingressoEntity_invalidFilter", "Invalid filter."));	
		}
		
		// Throws an exception if find a custom field in the filter expression or order by expression.
		Set<String> columns = filterParameters == null ? null : filterParameters.getColumns().stream().filter(f -> f.split("\\.").length == 1).collect(Collectors.toSet());
		if(filterParameters != null){
			validateFilterColumns(columns, filterParameters.getJoins(), null);
		}
		validateCustomOrders(customOrder);
		
		
		Page<IngressoEntity> requestedPage = this.repository.findAllPageable(filterParameters, customOrder, page, size, true);
		return requestedPage;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<IngressoEntity> listIngressoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity) {
		prepareSession();
		int page = skip * top; //zero-based page index.
		int size = top > 0 ? top : 10; //the size of the page to be returned.
		List<CustomOrder> customOrder = new ArrayList<>();
		if (orderBy != null && !orderBy.trim().isEmpty()) {
			String[] ordersby = orderBy.split(",");
			for (String orderby : ordersby) {
				String[] orderparts = orderby.trim().split("\\s+");
				boolean desc = orderparts.length > 1 && orderparts[1].toUpperCase().equals("DESC");
				CustomOrder co = new CustomOrder(orderparts[0]);
				co.setDesc(desc);
				customOrder.add(co);
			}
		}
		filter = replaceFilterEscapedChars(filter);
		FilterParameters filterParameters = null;
		try {
			filterParameters = filterParser.parseFilter(filter, IngressoEntity.class);
			filterParameters.setValues(getFixedValuesToFilter(filterParameters));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("my_domain.my_service.ingressoEntity_invalidFilter", "Invalid filter."));	
		}
		
		// Throws an exception if find a custom field in the filter expression or order by expression.
		Set<String> columns = filterParameters == null ? null : filterParameters.getColumns().stream().filter(f -> f.split("\\.").length == 1).collect(Collectors.toSet());
		if(filterParameters != null){
			validateFilterColumns(columns, filterParameters.getJoins(), null);
		}
		validateCustomOrders(customOrder);
		
		
		Page<IngressoEntity> requestedPage = this.repository.findAllPageable(filterParameters, customOrder, page, size, parentEntity, true);
		return requestedPage;
	}
	
	
	protected List<Object> getFixedValuesToFilter(FilterParameters filterParameters){
		return filterParameters.getValues().stream().map(value-> {
			if( value instanceof java.lang.String )
				return ((String) value).replace("''", "'");
			
			return value;
		}).collect(Collectors.toList());
	}
	
	protected String replaceFilterEscapedChars(String filter){
		return filter == null ? null : filter.replace("\\'", "''");
	}
	
	@Override
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath) {
		validateChildJoinFields(joinFields, lastPath);
		if(lastPath != null && !lastPath.isEmpty()){
			return;
		}
		validateCurrentEntityFields(columns, lastPath);
	}
	
	@Override
	public void validateCustomOrders(List<CustomOrder> customOrders){
		if(customOrders.stream().filter(co -> co.getField().startsWith("convidado.")).count() > 0) {
			convidadoCrudService.validateCustomOrders(customOrders.stream().filter(co -> co.getField().startsWith("convidado.")).map(co -> {
				CustomOrder customOrder = new CustomOrder();
				customOrder.setField(co.getField().replace("convidado.", ""));
				return customOrder;
			}).collect(Collectors.toList()));
		}
		if(customOrders.stream().filter(co -> co.getField().startsWith("evento.")).count() > 0) {
			eventoCrudService.validateCustomOrders(customOrders.stream().filter(co -> co.getField().startsWith("evento.")).map(co -> {
				CustomOrder customOrder = new CustomOrder();
				customOrder.setField(co.getField().replace("evento.", ""));
				return customOrder;
			}).collect(Collectors.toList()));
		}
		Set<String> entityFieldNames = IntrospectorUtil.getAllEntityFieldNamesByClass(IngressoEntity.class);
		for(CustomOrder order : customOrders.stream().filter(c-> !c.getField().contains(".")).collect(Collectors.toList())) {
			// The orderby must not contain custom fields.
			if (!entityFieldNames.contains(order.getField())) {
				throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid orderby argument: " + order.getField());
			}
		}
	}
	
	private void validateCurrentEntityFields(Set<String> columns, String lastPath) {
		Set<String> entityFieldNames = IntrospectorUtil.getAllEntityFieldNamesByClass(IngressoEntity.class);
		// The filter must not contain custom fields.
		if (!CollectionUtils.isEmpty(columns)) {
			columns.forEach(filterFieldName -> {
				if (!entityFieldNames.contains(filterFieldName)) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid filter argument: " + filterFieldName);
				}
			});
		}
	}
	
	private void validateChildJoinFields(List<Join> joinFields, String lastPath){
		for(Join join : joinFields){
			String currentPath = lastPath == null ? join.getFullRelationshipName() : lastPath;
			if(currentPath.startsWith("convidado") && join.getFields().size() > 0){
				currentPath = currentPath.replace("convidado" + (currentPath.contains(".") ? "." : ""), "");
				convidadoCrudService.validateFilterColumns(join.getFields(), List.of(join), currentPath);
			}
			if(currentPath.startsWith("evento") && join.getFields().size() > 0){
				currentPath = currentPath.replace("evento" + (currentPath.contains(".") ? "." : ""), "");
				eventoCrudService.validateFilterColumns(join.getFields(), List.of(join), currentPath);
			}
		}
	}
	protected void prepareSession(){
		Session session = em.unwrap(Session.class);
		sessionInitializer.initialize(session, IngressoEntity.class);
	}
	
	@Override
	public void createBulk(List<IngressoEntity> entities) {
		prepareSession();
		if (entities != null && !entities.isEmpty()) {
			this.repository.saveAll(entities);
		}
	}
	
	@Override
	public void createBulkIngresso(List<IngressoEntity> entities) {
		this.createBulk(entities);
	}
	
	@Override
	public IngressoBaseRepository getRepository() {
		return repository;
	}
}
