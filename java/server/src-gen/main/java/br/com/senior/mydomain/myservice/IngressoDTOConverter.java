/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component("my_domain.my_service.IngressoDTOConverter")
@Lazy
public class IngressoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(IngressoDTOConverter.class);
	
	private ConvidadoDTOConverter convidadoDTOConverter;
	private EventoDTOConverter eventoDTOConverter;
	
	@Inject
	public void setConvidadoDTOConverter(ConvidadoDTOConverter convidadoDTOConverter) {
		this.convidadoDTOConverter = convidadoDTOConverter;
	}
	
	@Inject
	public void setEventoDTOConverter(EventoDTOConverter eventoDTOConverter) {
		this.eventoDTOConverter = eventoDTOConverter;
	}
	
	public IngressoEntity toEntity(Ingresso dto, boolean createMethod) {
		IngressoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public IngressoEntity toEntity(Ingresso dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	IngressoEntity toEntity(Ingresso dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		IngressoEntity entity = (IngressoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new IngressoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public IngressoEntity mergeEntity(IngressoEntity entity, Ingresso dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	IngressoEntity mergeEntity(IngressoEntity entity, Ingresso dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.dataHora != null) {
			entity.setDataHora(dto.dataHora);
		}
		if (dto.convidado != null) {
			entity.setConvidado(convidadoDTOConverter.toEntity(dto.convidado, converted));
		}
		
		if (dto.quantidadeAcompanhantes != null) {
			entity.setQuantidadeAcompanhantes(dto.quantidadeAcompanhantes);
		}
		if (dto.evento != null) {
			entity.setEvento(eventoDTOConverter.toEntity(dto.evento, converted));
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public IngressoEntity updateEntity(IngressoEntity entity, Ingresso dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	IngressoEntity updateEntity(IngressoEntity entity, Ingresso dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setDataHora(dto.dataHora);
		entity.setConvidado(convidadoDTOConverter.toEntity(dto.convidado, converted));
		
		entity.setQuantidadeAcompanhantes(dto.quantidadeAcompanhantes);
		entity.setEvento(eventoDTOConverter.toEntity(dto.evento, converted));
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<IngressoEntity> toEntityList(java.util.List<Ingresso> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<IngressoEntity> toEntityList(java.util.List<Ingresso> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<IngressoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Ingresso toDTO(IngressoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Ingresso toDTO(IngressoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Ingresso dto = (Ingresso) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Ingresso();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.dataHora = entity.getDataHora();
		dto.convidado = convidadoDTOConverter.toDTO(entity.getConvidado(), converted);
		dto.quantidadeAcompanhantes = entity.getQuantidadeAcompanhantes();
		dto.evento = eventoDTOConverter.toDTO(entity.getEvento(), converted);
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Ingresso toDTO(IngressoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Ingresso toDTO(IngressoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Ingresso dto = new Ingresso();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		List<String> convidadoDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("convidado.")).map(f -> f.substring("convidado.".length() + f.indexOf("convidado.")).trim()).collect(Collectors.toList());
		if (!convidadoDisplayFields.isEmpty()) {
			dto.convidado = convidadoDTOConverter.toDTO(entity.getConvidado(), convidadoDisplayFields, new java.util.HashMap<Object, Object>());
		}
		
		if (displayFields.stream().anyMatch(displayField -> "quantidadeAcompanhantes".equals(displayField) || "*".equals(displayField))) {
			dto.quantidadeAcompanhantes = entity.getQuantidadeAcompanhantes();
		}
		
		List<String> eventoDisplayFields = displayFields.stream()
						.filter(displayField -> displayField.trim().startsWith("evento.")).map(f -> f.substring("evento.".length() + f.indexOf("evento.")).trim()).collect(Collectors.toList());
		if (!eventoDisplayFields.isEmpty()) {
			dto.evento = eventoDTOConverter.toDTO(entity.getEvento(), eventoDisplayFields, new java.util.HashMap<Object, Object>());
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Ingresso toDTOforRelation(IngressoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Ingresso dto = new Ingresso();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		
		if (displayFields.stream().anyMatch(displayField -> "quantidadeAcompanhantes".equals(displayField) || "*".equals(displayField))) {
			dto.quantidadeAcompanhantes = entity.getQuantidadeAcompanhantes();
		}
		
        return dto;
    }
    
    public java.util.List<Ingresso> toDTOList(java.util.List<IngressoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Ingresso> toDTOList(java.util.List<IngressoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Ingresso> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Ingresso> toDTOList(java.util.Set<IngressoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Ingresso> toDTOList(java.util.Set<IngressoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Ingresso> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
        
	private static Set<Field> findFields(Class<?> clazz, Class<? extends Annotation> ann) {
		Set<Field> set = new HashSet<>();
		Class<?> c = clazz;
		while (c != null) {
			for (Field field : c.getDeclaredFields()) {
				if (field.isAnnotationPresent(ann)) {
					set.add(field);
				}
			}
			c = c.getSuperclass();
		}
		return set;
	}
	
	private void treatJsonPath(IngressoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("dataHora".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataHora(null);
		}
		if("convidado".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setConvidado(null);
		}
		if("quantidadeAcompanhantes".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setQuantidadeAcompanhantes(null);
		}
		if("evento".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setEvento(null);
		}
	}
}
