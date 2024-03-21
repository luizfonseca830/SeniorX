package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;


public class CadastrarEventoInput {
    
    @NotNull(message = "nome is required")
    @Size(max = 10, message = "nome max length is {max}")
    public String nome;
    
    /**
     * Caso o valor não seja informado, será false
     */
    public Boolean apenasColaboradores = false;
    
    @NotNull(message = "lotacaoMaxima is required")
    @Min(value = 1L, message = "lotacaoMaxima min value is {value}")
    @Max(value = 999L, message = "lotacaoMaxima max value is {value}")
    public Long lotacaoMaxima;
    
    @NotNull(message = "data is required")
    public java.time.LocalDate data;
    
    public TipoEntrada tipoEntradaEvento;
    
    
    public CadastrarEventoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CadastrarEventoInput(String nome, Boolean apenasColaboradores, Long lotacaoMaxima, java.time.LocalDate data, TipoEntrada tipoEntradaEvento) {
        this.nome = nome;
        this.apenasColaboradores = apenasColaboradores != null ? apenasColaboradores : false;
        this.lotacaoMaxima = lotacaoMaxima;
        this.data = data;
        this.tipoEntradaEvento = tipoEntradaEvento;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public CadastrarEventoInput(String nome, Long lotacaoMaxima, java.time.LocalDate data) {
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
        if (!(obj instanceof CadastrarEventoInput)) {
            return false;
        }
        CadastrarEventoInput other = (CadastrarEventoInput) obj;
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
    	CadastrarEventoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
