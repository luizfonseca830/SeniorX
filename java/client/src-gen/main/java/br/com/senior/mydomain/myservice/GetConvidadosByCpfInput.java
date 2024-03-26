package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class GetConvidadosByCpfInput {
    
    @NotNull(message = "cpf is required")
    public String cpf;
    
    
    public GetConvidadosByCpfInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetConvidadosByCpfInput(String cpf) {
        this.cpf = cpf;
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
        if (cpf != null) {
            ret = 31 * ret + cpf.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConvidadosByCpfInput)) {
            return false;
        }
        GetConvidadosByCpfInput other = (GetConvidadosByCpfInput) obj;
        if ((cpf == null) != (other.cpf == null)) {
            return false;
        }
        if ((cpf != null) && !cpf.equals(other.cpf)) {
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
    	GetConvidadosByCpfInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
