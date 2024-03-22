package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class ComprarIngressoInput {
    
    @NotNull(message = "nomeComprador is required")
    public String nomeComprador;
    
    
    public ComprarIngressoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ComprarIngressoInput(String nomeComprador) {
        this.nomeComprador = nomeComprador;
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
        if (nomeComprador != null) {
            ret = 31 * ret + nomeComprador.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComprarIngressoInput)) {
            return false;
        }
        ComprarIngressoInput other = (ComprarIngressoInput) obj;
        if ((nomeComprador == null) != (other.nomeComprador == null)) {
            return false;
        }
        if ((nomeComprador != null) && !nomeComprador.equals(other.nomeComprador)) {
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
    	ComprarIngressoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
