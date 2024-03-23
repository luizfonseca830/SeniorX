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

@Component("my_domain.my_service.ConvidadoDTOConverter")
@Lazy
public class ConvidadoDTOConverter {
	
	static final Logger logger = LoggerFactory.getLogger(ConvidadoDTOConverter.class);
	
	
	public ConvidadoEntity toEntity(Convidado dto, boolean createMethod) {
		ConvidadoEntity ret = toEntity(dto, new HashMap<>());
		if(createMethod){
			ret.defineAsNewEntity();
		}
		return ret;
	}

	public ConvidadoEntity toEntity(Convidado dto) {
		return toEntity(dto, new HashMap<>());
	}
	
	ConvidadoEntity toEntity(Convidado dto, java.util.Map<Object, Object> converted) {
		if (dto == null) {
			return null;
		}
		ConvidadoEntity entity = (ConvidadoEntity) converted.get(dto);
		if (entity != null) {
			return entity;
		}
		entity = new ConvidadoEntity();
		converted.put(dto, entity);
		return mergeEntity(entity, dto, converted);
	}
	
	public ConvidadoEntity mergeEntity(ConvidadoEntity entity, Convidado dto) {
		return mergeEntity(entity, dto, new HashMap<>());
	}
	
	ConvidadoEntity mergeEntity(ConvidadoEntity entity, Convidado dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		if (dto.nome != null) {
			entity.setNome(dto.nome);
		}
		if (dto.nomeSocial != null) {
			entity.setNomeSocial(dto.nomeSocial);
		}
		if (dto.cpf != null) {
			entity.setCpf(dto.cpf);
		}
		if (dto.dataNascimneto != null) {
			entity.setDataNascimneto(dto.dataNascimneto);
		}
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		
        for (JsonPatch jsonPatch : dto.getJsonPatches()) {
            treatJsonPath(entity, jsonPatch);
        }
		
		return entity;
	}
	
	public ConvidadoEntity updateEntity(ConvidadoEntity entity, Convidado dto) {
		return updateEntity(entity, dto, new HashMap<>());
	}

	ConvidadoEntity updateEntity(ConvidadoEntity entity, Convidado dto, java.util.Map<Object, Object> converted) {
		if (dto.id != null) {
			entity.setId(java.util.UUID.fromString(dto.id));
		}
		entity.setNome(dto.nome);
		entity.setNomeSocial(dto.nomeSocial);
		entity.setCpf(dto.cpf);
		entity.setDataNascimneto(dto.dataNascimneto);
		for (Map.Entry<String, Object> entry : dto.getCustom().entrySet()) {
			entity.setCustom(entry.getKey(), entry.getValue());
		}
		return entity;
	}
	
	public java.util.List<ConvidadoEntity> toEntityList(java.util.List<Convidado> dtos) {
		return toEntityList(dtos, new HashMap<>());
	}
	
	java.util.List<ConvidadoEntity> toEntityList(java.util.List<Convidado> dtos, java.util.Map<Object, Object> converted) {
		java.util.List<ConvidadoEntity> entities = null;
		if (dtos != null) {
			entities = dtos.stream().map(dto -> toEntity(dto, converted)).collect(Collectors.toList());
		}	
		return entities;
	}
	
	public Convidado toDTO(ConvidadoEntity entity) {
		return toDTO(entity, new HashMap<>());
	}
	
	Convidado toDTO(ConvidadoEntity entity, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		Convidado dto = (Convidado) converted.get(entity);
		if (dto != null) {
			return dto;
		}
        dto = new Convidado();
        converted.put(entity, dto);

		dto.id = entity.getId() != null ? entity.getId().toString() : null;
		dto.nome = entity.getNome();
		dto.nomeSocial = entity.getNomeSocial();
		dto.cpf = entity.getCpf();
		dto.dataNascimneto = entity.getDataNascimneto();
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
	
	public Convidado toDTO(ConvidadoEntity entity, List<String> displayFields) {
		return toDTO(entity, displayFields, new HashMap<>());
	}
	
	Convidado toDTO(ConvidadoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}
		
		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));
		
        Convidado dto = new Convidado();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nomeSocial".equals(displayField) || "*".equals(displayField))) {
			dto.nomeSocial = entity.getNomeSocial();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cpf".equals(displayField) || "*".equals(displayField))) {
			dto.cpf = entity.getCpf();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataNascimneto".equals(displayField) || "*".equals(displayField))) {
			dto.dataNascimneto = entity.getDataNascimneto();
		}
		for(String customField : entity.getCustomFields()) {
			dto.setCustom(customField, entity.getCustom(customField));
		}
        return dto;
    }
    
    Convidado toDTOforRelation(ConvidadoEntity entity, List<String> displayFields, java.util.Map<Object, Object> converted) {
		if (entity == null) {
			return null;
		}
		if (displayFields == null) {
			return toDTO(entity, converted);
		}

		Set<Field> ids = findFields(entity.getClass(), Id.class);
		displayFields.addAll(ids.stream().map(field -> field.getName()).collect(Collectors.toList()));

        Convidado dto = new Convidado();
		if (displayFields.stream().anyMatch(displayField -> "id".equals(displayField) || "*".equals(displayField))) {
			dto.id = entity.getId() != null ? entity.getId().toString() : null;
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nome".equals(displayField) || "*".equals(displayField))) {
			dto.nome = entity.getNome();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "nomeSocial".equals(displayField) || "*".equals(displayField))) {
			dto.nomeSocial = entity.getNomeSocial();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "cpf".equals(displayField) || "*".equals(displayField))) {
			dto.cpf = entity.getCpf();
		}
		
		if (displayFields.stream().anyMatch(displayField -> "dataNascimneto".equals(displayField) || "*".equals(displayField))) {
			dto.dataNascimneto = entity.getDataNascimneto();
		}
        return dto;
    }
    
    public java.util.List<Convidado> toDTOList(java.util.List<ConvidadoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Convidado> toDTOList(java.util.List<ConvidadoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Convidado> dtos = null;
    	if (entities != null) {
    		dtos = entities.stream().map(entity -> toDTO(entity, converted)).collect(Collectors.toList());
    	}
    	return dtos;
    }
    
    public java.util.List<Convidado> toDTOList(java.util.Set<ConvidadoEntity> entities) {
    	return toDTOList(entities, new HashMap<>());
    }
    
    java.util.List<Convidado> toDTOList(java.util.Set<ConvidadoEntity> entities, java.util.Map<Object, Object> converted) {
    	java.util.List<Convidado> dtos = null;
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
	
	private void treatJsonPath(ConvidadoEntity entity, JsonPatch jsonPatch) {
		if (!JsonPatch.REMOVE_OPERATION.equals(jsonPatch.getOp())){
			return;
		}
		
		if("id".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setId(null);
		}
		if("nome".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNome(null);
		}
		if("nomeSocial".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setNomeSocial(null);
		}
		if("cpf".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setCpf(null);
		}
		if("dataNascimneto".equals(jsonPatch.getPath().replace("/", ""))) {
			entity.setDataNascimneto(null);
		}
	}
}
