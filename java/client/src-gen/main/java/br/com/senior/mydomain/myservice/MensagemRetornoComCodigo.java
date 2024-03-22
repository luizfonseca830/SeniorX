package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class MensagemRetornoComCodigo {
    
    @NotNull(message = "mensagemRetorno is required")
    public String mensagemRetorno;
    
    @NotNull(message = "codigoCadastrado is required")
    public String codigoCadastrado;
    
    public Boolean contemErro;
    
    
    public MensagemRetornoComCodigo() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public MensagemRetornoComCodigo(String mensagemRetorno, String codigoCadastrado, Boolean contemErro) {
        this.mensagemRetorno = mensagemRetorno;
        this.codigoCadastrado = codigoCadastrado;
        this.contemErro = contemErro;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public MensagemRetornoComCodigo(String mensagemRetorno, String codigoCadastrado) {
        this.mensagemRetorno = mensagemRetorno;
        this.codigoCadastrado = codigoCadastrado;
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
        if (mensagemRetorno != null) {
            ret = 31 * ret + mensagemRetorno.hashCode();
        }
        if (codigoCadastrado != null) {
            ret = 31 * ret + codigoCadastrado.hashCode();
        }
        if (contemErro != null) {
            ret = 31 * ret + contemErro.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MensagemRetornoComCodigo)) {
            return false;
        }
        MensagemRetornoComCodigo other = (MensagemRetornoComCodigo) obj;
        if ((mensagemRetorno == null) != (other.mensagemRetorno == null)) {
            return false;
        }
        if ((mensagemRetorno != null) && !mensagemRetorno.equals(other.mensagemRetorno)) {
            return false;
        }
        if ((codigoCadastrado == null) != (other.codigoCadastrado == null)) {
            return false;
        }
        if ((codigoCadastrado != null) && !codigoCadastrado.equals(other.codigoCadastrado)) {
            return false;
        }
        if ((contemErro == null) != (other.contemErro == null)) {
            return false;
        }
        if ((contemErro != null) && !contemErro.equals(other.contemErro)) {
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
    	MensagemRetornoComCodigoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
