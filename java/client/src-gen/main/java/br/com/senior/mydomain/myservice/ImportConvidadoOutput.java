package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class ImportConvidadoOutput {
    
    @NotNull(message = "importJobId is required")
    public String importJobId;
    
    
    public ImportConvidadoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportConvidadoOutput(String importJobId) {
        this.importJobId = importJobId;
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
        if (importJobId != null) {
            ret = 31 * ret + importJobId.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportConvidadoOutput)) {
            return false;
        }
        ImportConvidadoOutput other = (ImportConvidadoOutput) obj;
        if ((importJobId == null) != (other.importJobId == null)) {
            return false;
        }
        if ((importJobId != null) && !importJobId.equals(other.importJobId)) {
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
    	ImportConvidadoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
