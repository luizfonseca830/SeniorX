package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class RetornoCadastroConvidado extends MensagemRetornoComCodigo {
    
    @NotNull(message = "nome is required")
    public String nome;
    
    public String nomeSocial;
    
    @NotNull(message = "resultado is required")
    public ResultadoCadastradoConvidado resultado;
    
    
    public RetornoCadastroConvidado() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornoCadastroConvidado(String mensagemRetorno, String codigoCadastrado, Boolean contemErro, String nome, String nomeSocial, ResultadoCadastradoConvidado resultado) {
        this.mensagemRetorno = mensagemRetorno;
        this.codigoCadastrado = codigoCadastrado;
        this.contemErro = contemErro;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.resultado = resultado;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public RetornoCadastroConvidado(String mensagemRetorno, String codigoCadastrado, String nome, ResultadoCadastradoConvidado resultado) {
        this.mensagemRetorno = mensagemRetorno;
        this.codigoCadastrado = codigoCadastrado;
        this.nome = nome;
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
        int ret = super.hashCode();
        if (nome != null) {
            ret = 31 * ret + nome.hashCode();
        }
        if (nomeSocial != null) {
            ret = 31 * ret + nomeSocial.hashCode();
        }
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
        if (!(obj instanceof RetornoCadastroConvidado)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        RetornoCadastroConvidado other = (RetornoCadastroConvidado) obj;
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
    	RetornoCadastroConvidadoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
