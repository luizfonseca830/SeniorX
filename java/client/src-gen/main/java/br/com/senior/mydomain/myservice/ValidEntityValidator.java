/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */

package br.com.senior.mydomain.myservice;

import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.senior.messaging.model.EntityId;

public class ValidEntityValidator implements ConstraintValidator<ValidEntity, Object> {

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
	
			if (value == null) {
				return true;
			}
	
			Field[] fields;
			Object object;
	
			if (value instanceof ArrayList) {
				object = ((ArrayList<?>) value).get(0);
				fields = object.getClass().getDeclaredFields();
			} else {
				object = value;
				fields = value.getClass().getDeclaredFields();
			}
	
			if (fields.length > 0) {
				Field fieldId = fields[0]; // First field should be the entity id.
	
				if (fieldId.isAnnotationPresent(EntityId.class)) { // Identify the field as the id of the entity.
					fieldId.setAccessible(true);
					Object idValue = null;
					try {
						idValue = fieldId.get(object);
					} catch (Exception e) {
						throw new IllegalArgumentException("Error reading Payload id field: " + e.getMessage());
					}
	
					return idValue != null;
				}
			}
	
			return false;
		}

}

