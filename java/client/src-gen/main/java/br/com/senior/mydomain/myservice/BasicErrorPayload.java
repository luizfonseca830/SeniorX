package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



/**
 * Default error payload type. Every service defines its own.
 */
public class BasicErrorPayload {
    
    /**
     * The user-facing error message, if any.
     */
    public String message;
    
    /**
     * The program-accessible (and service-specific) error code.
     */
    public String errorCode;
    
    
    public BasicErrorPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public BasicErrorPayload(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    public void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (message != null) {
            ret = 31 * ret + message.hashCode();
        }
        if (errorCode != null) {
            ret = 31 * ret + errorCode.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicErrorPayload)) {
            return false;
        }
        BasicErrorPayload other = (BasicErrorPayload) obj;
        if ((message == null) != (other.message == null)) {
            return false;
        }
        if ((message != null) && !message.equals(other.message)) {
            return false;
        }
        if ((errorCode == null) != (other.errorCode == null)) {
            return false;
        }
        if ((errorCode != null) && !errorCode.equals(other.errorCode)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	BasicErrorPayloadStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
