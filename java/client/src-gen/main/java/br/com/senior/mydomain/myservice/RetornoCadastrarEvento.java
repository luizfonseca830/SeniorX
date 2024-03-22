package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class RetornoCadastrarEvento {
    
    @NotNull(message = "mensagem is required")
    @Valid
    public MensagemRetornoComCodigo mensagem;
    
    @NotNull(message = "nome is required")
    public String nome;
    
    public Boolean apenasColaboradores;
    
    @NotNull(message = "lotacaoMaxima is required")
    public Long lotacaoMaxima;
    
    @NotNull(message = "data is required")
    public java.time.LocalDate data;
    
    public java.util.List<TipoEntrada> tipoEntradaEvento;
    
    
    public RetornoCadastrarEvento() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornoCadastrarEvento(MensagemRetornoComCodigo mensagem, String nome, Boolean apenasColaboradores, Long lotacaoMaxima, java.time.LocalDate data, java.util.List<TipoEntrada> tipoEntradaEvento) {
        this.mensagem = mensagem;
        this.nome = nome;
        this.apenasColaboradores = apenasColaboradores;
        this.lotacaoMaxima = lotacaoMaxima;
        this.data = data;
        this.tipoEntradaEvento = tipoEntradaEvento;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public RetornoCadastrarEvento(MensagemRetornoComCodigo mensagem, String nome, Long lotacaoMaxima, java.time.LocalDate data) {
        this.mensagem = mensagem;
        this.nome = nome;
        this.lotacaoMaxima = lotacaoMaxima;
        this.data = data;
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
        if (apenasColaboradores != null) {
            ret = 31 * ret + apenasColaboradores.hashCode();
        }
        if (lotacaoMaxima != null) {
            ret = 31 * ret + lotacaoMaxima.hashCode();
        }
        if (data != null) {
            ret = 31 * ret + data.hashCode();
        }
        if (tipoEntradaEvento != null) {
            ret = 31 * ret + tipoEntradaEvento.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetornoCadastrarEvento)) {
            return false;
        }
        RetornoCadastrarEvento other = (RetornoCadastrarEvento) obj;
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
        if ((apenasColaboradores == null) != (other.apenasColaboradores == null)) {
            return false;
        }
        if ((apenasColaboradores != null) && !apenasColaboradores.equals(other.apenasColaboradores)) {
            return false;
        }
        if ((lotacaoMaxima == null) != (other.lotacaoMaxima == null)) {
            return false;
        }
        if ((lotacaoMaxima != null) && !lotacaoMaxima.equals(other.lotacaoMaxima)) {
            return false;
        }
        if ((data == null) != (other.data == null)) {
            return false;
        }
        if ((data != null) && !data.equals(other.data)) {
            return false;
        }
        if ((tipoEntradaEvento == null) != (other.tipoEntradaEvento == null)) {
            return false;
        }
        if ((tipoEntradaEvento != null) && !tipoEntradaEvento.equals(other.tipoEntradaEvento)) {
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
    	RetornoCadastrarEventoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
