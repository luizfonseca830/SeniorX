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

@Component("my_domain.my_service.AtracaoDTOConverter")
@Lazy
public class AtracaoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(AtracaoDTOConverter.class);
	
	private EventoDTOConverter eventoDTOConverter;
	
	@Inject
	public void setEventoDTOConverter(EventoDTOConverter eventoDTOConverter) {
		this.eventoDTOConverter = eventoDTOConverter;
	}
	
	public AtracaoEntity toEntity(Atracao dto, boolean createMethod) {
		AtracaoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public AtracaoEntity toEntity(Atracao dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	AtracaoEntity toEntity(Atracao dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		AtracaoEntity entity = (AtracaoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new AtracaoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public AtracaoEntity mergeEntity(AtracaoEntity entity, Atracao dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	AtracaoEntity mergeEntity(AtracaoEntity entity, Atracao dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.nome != null) {
			entity.setNome(dto.nome);
		}
		if (dto.dataHora != null) {
			entity.setDataHora(dto.dataHora);
		}
		if (dto.local != null) {
			entity.setLocal(dto.local);
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
	
	public AtracaoEntity updateEntity(AtracaoEntity entity, Atracao dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	AtracaoEntity updateEntity(AtracaoEntity entity, Atracao dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setNome(dto.nome);
		entity.setDataHora(dto.dataHora);
		entity.setLocal(dto.local);
		entity.setEvento(eventoDTOConverter.toEntity(dto.evento, converted));
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<AtracaoEntity> toEntityList(java.util.List<Atracao> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<AtracaoEntity> toEntityList(java.util.List<Atracao> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<AtracaoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Atracao toDTO(AtracaoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Atracao toDTO(AtracaoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Atracao dto = (Atracao) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Atracao();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.nome = entity.getNome();
		dto.dataHora = entity.getDataHora();
		dto.local = entity.getLocal();
		dto.evento = eventoDTOConverter.toDTO(entity.getEvento(), converted);
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Atracao toDTO(AtracaoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Atracao toDTO(AtracaoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Atracao dto = new Atracao();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "local".equals(displayField) || "*".equals(displayField))) {
			dto.local = entity.getLocal();
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
    
    Atracao toDTOforRelation(AtracaoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Atracao dto = new Atracao();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "local".equals(displayField) || "*".equals(displayField))) {
			dto.local = entity.getLocal();
		}
		
        return dto;
    }
    
    public java.util.List<Atracao> toDTOList(java.util.List<AtracaoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Atracao> toDTOList(java.util.List<AtracaoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Atracao> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Atracao> toDTOList(java.util.Set<AtracaoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Atracao> toDTOList(java.util.Set<AtracaoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Atracao> dtos = null;
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
	
	private void treatJsonPath(AtracaoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("nome".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNome(null);
		}
		if("dataHora".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataHora(null);
		}
		if("local".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setLocal(null);
		}
		if("evento".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setEvento(null);
		}
	}
}
