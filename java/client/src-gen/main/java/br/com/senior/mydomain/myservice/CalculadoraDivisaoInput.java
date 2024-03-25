package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class CalculadoraDivisaoInput {
    
    @NotNull(message = "numero1 is required")
    public Double numero1;
    
    @NotNull(message = "numero2 is required")
    public Double numero2;
    
    
    public CalculadoraDivisaoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CalculadoraDivisaoInput(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
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
        if (numero1 != null) {
            ret = 31 * ret + numero1.hashCode();
        }
        if (numero2 != null) {
            ret = 31 * ret + numero2.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculadoraDivisaoInput)) {
            return false;
        }
        CalculadoraDivisaoInput other = (CalculadoraDivisaoInput) obj;
        if ((numero1 == null) != (other.numero1 == null)) {
            return false;
        }
        if ((numero1 != null) && !numero1.equals(other.numero1)) {
            return false;
        }
        if ((numero2 == null) != (other.numero2 == null)) {
            return false;
        }
        if ((numero2 != null) && !numero2.equals(other.numero2)) {
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
    	CalculadoraDivisaoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
