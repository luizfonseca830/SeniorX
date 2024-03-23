package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class ExportConvidadoEventPayload {
    
    @NotNull(message = "eventpl is required")
    @Valid
    public ExportEventStatus eventpl;
    
    
    public ExportConvidadoEventPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExportConvidadoEventPayload(ExportEventStatus eventpl) {
        this.eventpl = eventpl;
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
        if (eventpl != null) {
            ret = 31 * ret + eventpl.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportConvidadoEventPayload)) {
            return false;
        }
        ExportConvidadoEventPayload other = (ExportConvidadoEventPayload) obj;
        if ((eventpl == null) != (other.eventpl == null)) {
            return false;
        }
        if ((eventpl != null) && !eventpl.equals(other.eventpl)) {
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
    	ExportConvidadoEventPayloadStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
