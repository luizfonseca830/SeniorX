package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class ComprarIngressoOutput {
    
    @NotNull(message = "codigoIngresso is required")
    public String codigoIngresso;
    
    
    public ComprarIngressoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ComprarIngressoOutput(String codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
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
        if (codigoIngresso != null) {
            ret = 31 * ret + codigoIngresso.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComprarIngressoOutput)) {
            return false;
        }
        ComprarIngressoOutput other = (ComprarIngressoOutput) obj;
        if ((codigoIngresso == null) != (other.codigoIngresso == null)) {
            return false;
        }
        if ((codigoIngresso != null) && !codigoIngresso.equals(other.codigoIngresso)) {
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
    	ComprarIngressoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
