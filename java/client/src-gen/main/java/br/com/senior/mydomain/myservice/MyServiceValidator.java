/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;

import org.hibernate.validator.HibernateValidator;
import org.springframework.stereotype.Component;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.messaging.model.ServiceException;

/**
 * Validators for payloads accepted/produced by endpoints in my_service.
 */

@Component("my_domain.my_service.myServiceValidator")
public class MyServiceValidator {
	
	private static volatile Validator VALIDATOR;
					
	
	private static ValidatorCheck validatorCheck;
	
	@Inject
	public void setValidatorCheck(ValidatorCheck validatorCheck){
		MyServiceValidator.validatorCheck = validatorCheck;
	}
	
    public static Validator getBeanValidator() {
		if (VALIDATOR == null) {
			synchronized (MyServiceValidator.class) {
				if (VALIDATOR == null) { // Double check approach.
					try {
						VALIDATOR = Validation.byProvider(HibernateValidator.class) //
								.configure() //
								.buildValidatorFactory() //
								.getValidator();
					} catch (Exception e) {
						throw new ServiceException(ErrorCategory.BAD_REQUEST, "Validation error", "Error initializing bean validation", e);
					}
				}
			}
		}
		
		return VALIDATOR;
	}
    	
	public static void validateWithBeanValidation(Object dto) {
		if (dto == null)
			return;
		
	    Set<ConstraintViolation<Object>> violations = getBeanValidator().validate(dto);
	    if (violations.isEmpty())
	    	return;
	    
	    if (violations.size() == 1)
	    	throw new IllegalArgumentException(violations.iterator().next().getMessage());
	    
	   // Needed to obtain the fields constraint messages in the same order of the declared fields.
	   // Bean Validation return in a random order due to the Set.
	   Map<String, String> messages = violations.stream() //
	    		.collect(Collectors.toMap( //
	    				cv -> cv.getPropertyPath().toString().replaceAll("\\[.*?\\]", ""), // Remove all occurrences of "[*]" due list/array fields.
	    				ConstraintViolation::getMessage));
	    
	   String message = findFirstMessage(dto, messages, null, new ArrayList<Object>());
	   if (message == null)
		   message = violations.iterator().next().getMessage();
	   
	    if (message != null) 
	    	throw new IllegalArgumentException(message);
	}
	
	private static String findFirstMessage(Object dto, Map<String, String> messages, String path, ArrayList<Object> visited) {
		
		if (dto == null || visited.contains(dto))
			return null;
		
		visited.add(dto);
		
		Field[] fields = dto.getClass().getDeclaredFields();
		String message = null;
	    int index = 0;
	    while (index < fields.length) {
	    	Field field = fields[index++];
	    	String fieldPath = path != null ? path.concat(".").concat(field.getName()) : field.getName();
	    	message = messages.get(fieldPath);
	    	if (message != null) {
	    		return message;
	    	}
	    	
	    	if (field.isAnnotationPresent(Valid.class)) {
	    		field.setAccessible(true);
				try {
					message = findFirstMessage(field.get(dto), messages, fieldPath, visited);
					if (message != null)
						return message;
				} catch (Exception e) {
					throw new IllegalArgumentException("Error reading Payload field: " + e.getMessage());
				}
	    	}
	    }
		
	    return null;
	}
	
	/**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(Object toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(Object toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(Object toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(Object toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
		if (validated.contains(toValidate)) {
			return;
		}
		
		validated.add(toValidate);
		
		if(!validatorCheck.mustValidate()){
			return;
		}
		
		checkHeaders(toValidate, headers);
		
		if (required) {
			validateWithBeanValidation(toValidate);
		}
	}
	
	private static void checkHeaders(Object toValidate, Map<String, Object> headers) {
		if (headers != null) {
			String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
			if (entityId != null && toValidate != null) {
				Field[] fields = toValidate.getClass().getDeclaredFields();
				if (fields.length > 0) {
					Field fieldId = fields[0];
					if (fieldId.isAnnotationPresent(EntityId.class)) {
						fieldId.setAccessible(true);
						Object idValue = null;
						try {
							idValue = fieldId.get(toValidate);
						} catch (Exception e) {
							throw new IllegalArgumentException("Error reading Payload id field: " + e.getMessage());
						}
						if (idValue != null && !idValue.toString().equals(entityId)) {
							throw new IllegalArgumentException("Payload id '" + idValue + "' differs from header id '" + entityId + "'.");
						}
					}
				}
			}
		}
	}
}
