package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class ImportAtracaoInput {
    
    @NotNull(message = "config is required")
    @Valid
    public ImportConfig config;
    
    
    public ImportAtracaoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportAtracaoInput(ImportConfig config) {
        this.config = config;
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
        if (config != null) {
            ret = 31 * ret + config.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportAtracaoInput)) {
            return false;
        }
        ImportAtracaoInput other = (ImportAtracaoInput) obj;
        if ((config == null) != (other.config == null)) {
            return false;
        }
        if ((config != null) && !config.equals(other.config)) {
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
    	ImportAtracaoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
