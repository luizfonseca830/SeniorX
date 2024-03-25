package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class CalculadoraDivisaoOutput {
    
    @NotNull(message = "resultado is required")
    public String resultado;
    
    
    public CalculadoraDivisaoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CalculadoraDivisaoOutput(String resultado) {
        this.resultado = resultado;
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
        if (resultado != null) {
            ret = 31 * ret + resultado.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculadoraDivisaoOutput)) {
            return false;
        }
        CalculadoraDivisaoOutput other = (CalculadoraDivisaoOutput) obj;
        if ((resultado == null) != (other.resultado == null)) {
            return false;
        }
        if ((resultado != null) && !resultado.equals(other.resultado)) {
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
    	CalculadoraDivisaoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
