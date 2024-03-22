package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;


public class EstornarPagamentosInput {
    
    @NotEmpty(message = "ingressos is required, at least one value must be present")
    public java.util.List<String> ingressos;
    
    
    public EstornarPagamentosInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public EstornarPagamentosInput(java.util.List<String> ingressos) {
        this.ingressos = ingressos;
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
        if (ingressos != null) {
            ret = 31 * ret + ingressos.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstornarPagamentosInput)) {
            return false;
        }
        EstornarPagamentosInput other = (EstornarPagamentosInput) obj;
        if ((ingressos == null) != (other.ingressos == null)) {
            return false;
        }
        if ((ingressos != null) && !ingressos.equals(other.ingressos)) {
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
    	EstornarPagamentosInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
