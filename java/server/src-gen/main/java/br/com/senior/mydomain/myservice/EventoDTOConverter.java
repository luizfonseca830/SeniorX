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
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component("my_domain.my_service.EventoDTOConverter")
@Lazy
public class EventoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(EventoDTOConverter.class);
	
	
	public EventoEntity toEntity(Evento dto, boolean createMethod) {
		EventoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public EventoEntity toEntity(Evento dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	EventoEntity toEntity(Evento dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		EventoEntity entity = (EventoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new EventoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public EventoEntity mergeEntity(EventoEntity entity, Evento dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	EventoEntity mergeEntity(EventoEntity entity, Evento dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.nome != null) {
			entity.setNome(dto.nome);
		}
		if (dto.lotacaoMaxima != null) {
			entity.setLotacaoMaxima(dto.lotacaoMaxima);
		}
		if (dto.dataHora != null) {
			entity.setDataHora(dto.dataHora);
		}
		if (dto.endereco != null) {
			entity.setEndereco(dto.endereco);
		}
		if (dto.tipoEntradaEvento != null) {
			entity.setTipoEntradaEvento(new java.util.HashSet<>(dto.tipoEntradaEvento));
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public EventoEntity updateEntity(EventoEntity entity, Evento dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	EventoEntity updateEntity(EventoEntity entity, Evento dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setNome(dto.nome);
		entity.setLotacaoMaxima(dto.lotacaoMaxima);
		entity.setDataHora(dto.dataHora);
		entity.setEndereco(dto.endereco);
		entity.setTipoEntradaEvento(dto.tipoEntradaEvento == null ? null : new java.util.HashSet<>(dto.tipoEntradaEvento));
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<EventoEntity> toEntityList(java.util.List<Evento> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<EventoEntity> toEntityList(java.util.List<Evento> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<EventoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Evento toDTO(EventoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Evento toDTO(EventoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Evento dto = (Evento) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Evento();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.nome = entity.getNome();
		dto.lotacaoMaxima = entity.getLotacaoMaxima();
		dto.dataHora = entity.getDataHora();
		dto.endereco = entity.getEndereco();
		dto.tipoEntradaEvento = entity.getTipoEntradaEvento() == null ? null : new java.util.ArrayList<>(entity.getTipoEntradaEvento());
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Evento toDTO(EventoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Evento toDTO(EventoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Evento dto = new Evento();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "lotacaoMaxima".equals(displayField) || "*".equals(displayField))) {
			dto.lotacaoMaxima = entity.getLotacaoMaxima();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "endereco".equals(displayField) || "*".equals(displayField))) {
			dto.endereco = entity.getEndereco();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoEntradaEvento".equals(displayField) || "*".equals(displayField))) {
			dto.tipoEntradaEvento = entity.getTipoEntradaEvento() == null ? null : new java.util.ArrayList<>(entity.getTipoEntradaEvento());
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Evento toDTOforRelation(EventoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Evento dto = new Evento();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "lotacaoMaxima".equals(displayField) || "*".equals(displayField))) {
			dto.lotacaoMaxima = entity.getLotacaoMaxima();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataHora".equals(displayField) || "*".equals(displayField))) {
			dto.dataHora = entity.getDataHora();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "endereco".equals(displayField) || "*".equals(displayField))) {
			dto.endereco = entity.getEndereco();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "tipoEntradaEvento".equals(displayField) || "*".equals(displayField))) {
			dto.tipoEntradaEvento = entity.getTipoEntradaEvento() == null ? null : new java.util.ArrayList<>(entity.getTipoEntradaEvento());
		}
        return dto;
    }
    
    public java.util.List<Evento> toDTOList(java.util.List<EventoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Evento> toDTOList(java.util.List<EventoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Evento> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Evento> toDTOList(java.util.Set<EventoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Evento> toDTOList(java.util.Set<EventoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Evento> dtos = null;
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
	
	private void treatJsonPath(EventoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("nome".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNome(null);
		}
		if("lotacaoMaxima".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setLotacaoMaxima(null);
		}
		if("dataHora".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataHora(null);
		}
		if("endereco".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setEndereco(null);
		}
		if("tipoEntradaEvento".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setTipoEntradaEvento(null);
		}
	}
}
