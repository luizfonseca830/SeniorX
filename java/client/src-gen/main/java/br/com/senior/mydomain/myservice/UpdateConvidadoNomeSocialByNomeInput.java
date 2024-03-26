package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class UpdateConvidadoNomeSocialByNomeInput {
    
    @NotNull(message = "nome is required")
    public String nome;
    
    @NotNull(message = "nomeSocial is required")
    public String nomeSocial;
    
    
    public UpdateConvidadoNomeSocialByNomeInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public UpdateConvidadoNomeSocialByNomeInput(String nome, String nomeSocial) {
        this.nome = nome;
        this.nomeSocial = nomeSocial;
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
        if (nome != null) {
            ret = 31 * ret + nome.hashCode();
        }
        if (nomeSocial != null) {
            ret = 31 * ret + nomeSocial.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateConvidadoNomeSocialByNomeInput)) {
            return false;
        }
        UpdateConvidadoNomeSocialByNomeInput other = (UpdateConvidadoNomeSocialByNomeInput) obj;
        if ((nome == null) != (other.nome == null)) {
            return false;
        }
        if ((nome != null) && !nome.equals(other.nome)) {
            return false;
        }
        if ((nomeSocial == null) != (other.nomeSocial == null)) {
            return false;
        }
        if ((nomeSocial != null) && !nomeSocial.equals(other.nomeSocial)) {
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
    	UpdateConvidadoNomeSocialByNomeInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
