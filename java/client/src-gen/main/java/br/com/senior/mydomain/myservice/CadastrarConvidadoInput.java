package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.Valid;


public class CadastrarConvidadoInput {
    
    @NotNull(message = "nome is required")
    @Valid
    public FieldCadastroConvidado nome;
    
    @NotNull(message = "quantidadeAcompanhantes is required")
    @Min(value = 0L, message = "quantidadeAcompanhantes min value is {value}")
    @Max(value = 9L, message = "quantidadeAcompanhantes max value is {value}")
    public Long quantidadeAcompanhantes;
    
    
    public CadastrarConvidadoInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CadastrarConvidadoInput(FieldCadastroConvidado nome, Long quantidadeAcompanhantes) {
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
        if (nome != null) {
            ret = 31 * ret + nome.hashCode();
        }
        if (quantidadeAcompanhantes != null) {
            ret = 31 * ret + quantidadeAcompanhantes.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CadastrarConvidadoInput)) {
            return false;
        }
        CadastrarConvidadoInput other = (CadastrarConvidadoInput) obj;
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
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	CadastrarConvidadoInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
