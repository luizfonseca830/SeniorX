package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class CancelarEventoInput {
    
    @NotNull(message = "codigoEvento is required")
    public String codigoEvento;
    
    
    public CancelarEventoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CancelarEventoInput(String codigoEvento) {
        this.codigoEvento = codigoEvento;
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
        if (codigoEvento != null) {
            ret = 31 * ret + codigoEvento.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelarEventoInput)) {
            return false;
        }
        CancelarEventoInput other = (CancelarEventoInput) obj;
        if ((codigoEvento == null) != (other.codigoEvento == null)) {
            return false;
        }
        if ((codigoEvento != null) && !codigoEvento.equals(other.codigoEvento)) {
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
    	CancelarEventoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
