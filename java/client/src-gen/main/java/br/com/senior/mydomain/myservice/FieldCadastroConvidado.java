package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class FieldCadastroConvidado {
    
    @NotNull(message = "nome is required")
    @Size(max = 20, message = "nome max length is {max}")
    public String nome;
    
    public String nomeSocial;
    
    
    public FieldCadastroConvidado() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FieldCadastroConvidado(String nome, String nomeSocial) {
        this.nome = nome;
        this.nomeSocial = nomeSocial;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public FieldCadastroConvidado(String nome) {
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
        if (!(obj instanceof FieldCadastroConvidado)) {
            return false;
        }
        FieldCadastroConvidado other = (FieldCadastroConvidado) obj;
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
    	FieldCadastroConvidadoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
