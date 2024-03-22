package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class RetornoCadastroConvidado {
    
    @NotNull(message = "mensagem is required")
    @Valid
    public MensagemRetornoComCodigo mensagem;
    
    @NotNull(message = "nome is required")
    public String nome;
    
    @NotNull(message = "quantidadeAcompanhantes is required")
    public Long quantidadeAcompanhantes;
    
    public String nomeSocial;
    
    
    public RetornoCadastroConvidado() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornoCadastroConvidado(MensagemRetornoComCodigo mensagem, String nome, Long quantidadeAcompanhantes, String nomeSocial) {
        this.mensagem = mensagem;
        this.nome = nome;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
        this.nomeSocial = nomeSocial;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public RetornoCadastroConvidado(MensagemRetornoComCodigo mensagem, String nome, Long quantidadeAcompanhantes) {
        this.mensagem = mensagem;
        this.nome = nome;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
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
        if (nome != null) {
            ret = 31 * ret + nome.hashCode();
        }
        if (quantidadeAcompanhantes != null) {
            ret = 31 * ret + quantidadeAcompanhantes.hashCode();
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
        if (!(obj instanceof RetornoCadastroConvidado)) {
            return false;
        }
        RetornoCadastroConvidado other = (RetornoCadastroConvidado) obj;
        if ((mensagem == null) != (other.mensagem == null)) {
            return false;
        }
        if ((mensagem != null) && !mensagem.equals(other.mensagem)) {
            return false;
        }
        if ((nome == null) != (other.nome == null)) {
            return false;
        }
        if ((nome != null) && !nome.equals(other.nome)) {
            return false;
        }
        if ((quantidadeAcompanhantes == null) != (other.quantidadeAcompanhantes == null)) {
            return false;
        }
        if ((quantidadeAcompanhantes != null) && !quantidadeAcompanhantes.equals(other.quantidadeAcompanhantes)) {
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
    	RetornoCadastroConvidadoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
