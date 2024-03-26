package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class UpdateConvidadoNomeByIdOutput {
    
    @NotNull(message = "id is required")
    public String id;
    
    @NotNull(message = "nome is required")
    public String nome;
    
    
    public UpdateConvidadoNomeByIdOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public UpdateConvidadoNomeByIdOutput(String id, String nome) {
        this.id = id;
        this.nome = nome;
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
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        if (nome != null) {
            ret = 31 * ret + nome.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateConvidadoNomeByIdOutput)) {
            return false;
        }
        UpdateConvidadoNomeByIdOutput other = (UpdateConvidadoNomeByIdOutput) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((nome == null) != (other.nome == null)) {
            return false;
        }
        if ((nome != null) && !nome.equals(other.nome)) {
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
    	UpdateConvidadoNomeByIdOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
