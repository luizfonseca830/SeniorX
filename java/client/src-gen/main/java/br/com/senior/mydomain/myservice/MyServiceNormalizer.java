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
    /**
     * Normalizes the Ingresso payload.
     */
    public static void normalize(Ingresso toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    		String entityParentId = headers.containsKey(Message.ENTITY_PARENT_ID_HEADER) ? headers.get(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
    		if (entityParentId != null && toNormalize != null && toNormalize.evento == null) {
    		    toNormalize.evento = new Evento();
    		    toNormalize.evento.id = entityParentId;
    		}
    	}
    }
    /**
     * Normalizes the Ingresso.Id payload.
     */
    public static void normalize(Ingresso.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Atracao payload.
     */
    public static void normalize(Atracao toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Atracao.Id payload.
     */
    public static void normalize(Atracao.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    
}
