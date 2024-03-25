package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class CalculadoraOutput {
    
    @NotNull(message = "calculadoraMessage is required")
    public String calculadoraMessage;
    
    
    public CalculadoraOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CalculadoraOutput(String calculadoraMessage) {
        this.calculadoraMessage = calculadoraMessage;
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
        if (calculadoraMessage != null) {
            ret = 31 * ret + calculadoraMessage.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculadoraOutput)) {
            return false;
        }
        CalculadoraOutput other = (CalculadoraOutput) obj;
        if ((calculadoraMessage == null) != (other.calculadoraMessage == null)) {
            return false;
        }
        if ((calculadoraMessage != null) && !calculadoraMessage.equals(other.calculadoraMessage)) {
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
    	CalculadoraOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
