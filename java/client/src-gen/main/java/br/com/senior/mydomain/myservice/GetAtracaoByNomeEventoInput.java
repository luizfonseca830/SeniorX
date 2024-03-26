package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class GetAtracaoByNomeEventoInput {
    
    @NotNull(message = "nomeEvento is required")
    public String nomeEvento;
    
    
    public GetAtracaoByNomeEventoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetAtracaoByNomeEventoInput(String nomeEvento) {
        this.nomeEvento = nomeEvento;
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
        if (nomeEvento != null) {
            ret = 31 * ret + nomeEvento.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAtracaoByNomeEventoInput)) {
            return false;
        }
        GetAtracaoByNomeEventoInput other = (GetAtracaoByNomeEventoInput) obj;
        if ((nomeEvento == null) != (other.nomeEvento == null)) {
            return false;
        }
        if ((nomeEvento != null) && !nomeEvento.equals(other.nomeEvento)) {
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
    	GetAtracaoByNomeEventoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
