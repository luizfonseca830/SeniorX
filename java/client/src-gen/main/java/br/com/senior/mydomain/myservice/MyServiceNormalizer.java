/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.Map;

import br.com.senior.messaging.Message;

/**
 * Normalizers for payloads accepted/produced by endpoints in my_service.
 */
public class MyServiceNormalizer {
    
    /**
     * Normalizes the Convidado payload.
     */
    public static void normalize(Convidado toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Convidado.Id payload.
     */
    public static void normalize(Convidado.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Evento payload.
     */
    public static void normalize(Evento toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Evento.Id payload.
     */
    public static void normalize(Evento.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    
}
