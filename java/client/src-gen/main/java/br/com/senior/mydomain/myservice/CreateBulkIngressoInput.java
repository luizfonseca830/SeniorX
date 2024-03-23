package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;


public class CreateBulkIngressoInput {
    
    /**
     * Entities for bulk creation
     */
    @NotEmpty(message = "entities is required, at least one value must be present")
    public java.util.List<Ingresso> entities;
    
    
    public CreateBulkIngressoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CreateBulkIngressoInput(java.util.List<Ingresso> entities) {
        this.entities = entities;
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
        if (entities != null) {
            ret = 31 * ret + entities.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateBulkIngressoInput)) {
            return false;
        }
        CreateBulkIngressoInput other = (CreateBulkIngressoInput) obj;
        if ((entities == null) != (other.entities == null)) {
            return false;
        }
        if ((entities != null) && !entities.equals(other.entities)) {
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
    	CreateBulkIngressoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
