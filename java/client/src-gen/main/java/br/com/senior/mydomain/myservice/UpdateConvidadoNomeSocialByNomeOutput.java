package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;


public class UpdateConvidadoNomeSocialByNomeOutput {
    
    @NotEmpty(message = "id is required, at least one value must be present")
    public java.util.List<String> id;
    
    
    public UpdateConvidadoNomeSocialByNomeOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public UpdateConvidadoNomeSocialByNomeOutput(java.util.List<String> id) {
        this.id = id;
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
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateConvidadoNomeSocialByNomeOutput)) {
            return false;
        }
        UpdateConvidadoNomeSocialByNomeOutput other = (UpdateConvidadoNomeSocialByNomeOutput) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
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
    	UpdateConvidadoNomeSocialByNomeOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
