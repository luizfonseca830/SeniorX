package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class ExportConvidadoOutput {
    
    @NotNull(message = "exportJobId is required")
    public String exportJobId;
    
    
    public ExportConvidadoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExportConvidadoOutput(String exportJobId) {
        this.exportJobId = exportJobId;
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
        if (exportJobId != null) {
            ret = 31 * ret + exportJobId.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportConvidadoOutput)) {
            return false;
        }
        ExportConvidadoOutput other = (ExportConvidadoOutput) obj;
        if ((exportJobId == null) != (other.exportJobId == null)) {
            return false;
        }
        if ((exportJobId != null) && !exportJobId.equals(other.exportJobId)) {
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
    	ExportConvidadoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
