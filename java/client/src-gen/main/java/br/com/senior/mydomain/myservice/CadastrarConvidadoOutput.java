package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class CadastrarConvidadoOutput {
    
    @NotNull(message = "mensagem is required")
    @Valid
    public MensagemRetornoComCodigo mensagem;
    
    @NotNull(message = "convidado is required")
    public String convidado;
    
    
    public CadastrarConvidadoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CadastrarConvidadoOutput(MensagemRetornoComCodigo mensagem, String convidado) {
        this.mensagem = mensagem;
        this.convidado = convidado;
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
        if (mensagem != null) {
            ret = 31 * ret + mensagem.hashCode();
        }
        if (convidado != null) {
            ret = 31 * ret + convidado.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CadastrarConvidadoOutput)) {
            return false;
        }
        CadastrarConvidadoOutput other = (CadastrarConvidadoOutput) obj;
        if ((mensagem == null) != (other.mensagem == null)) {
            return false;
        }
        if ((mensagem != null) && !mensagem.equals(other.mensagem)) {
            return false;
        }
        if ((convidado == null) != (other.convidado == null)) {
            return false;
        }
        if ((convidado != null) && !convidado.equals(other.convidado)) {
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
    	CadastrarConvidadoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
