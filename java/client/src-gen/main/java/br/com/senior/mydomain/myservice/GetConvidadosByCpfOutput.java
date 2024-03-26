package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;


public class GetConvidadosByCpfOutput {
    
    @NotEmpty(message = "nomeConvidado is required, at least one value must be present")
    public java.util.List<String> nomeConvidado;
    
    
    public GetConvidadosByCpfOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetConvidadosByCpfOutput(java.util.List<String> nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
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
        if (nomeConvidado != null) {
            ret = 31 * ret + nomeConvidado.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConvidadosByCpfOutput)) {
            return false;
        }
        GetConvidadosByCpfOutput other = (GetConvidadosByCpfOutput) obj;
        if ((nomeConvidado == null) != (other.nomeConvidado == null)) {
            return false;
        }
        if ((nomeConvidado != null) && !nomeConvidado.equals(other.nomeConvidado)) {
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
    	GetConvidadosByCpfOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
