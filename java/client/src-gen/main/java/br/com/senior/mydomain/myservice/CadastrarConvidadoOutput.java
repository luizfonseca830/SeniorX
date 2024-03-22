package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class CadastrarConvidadoOutput {
    
    @NotNull(message = "convidado is required")
    @Valid
    public FieldCadastroConvidado convidado;
    
    @NotNull(message = "resultado is required")
    public ResultadoCadastradoConvidado resultado;
    
    
    public CadastrarConvidadoOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public CadastrarConvidadoOutput(FieldCadastroConvidado convidado, ResultadoCadastradoConvidado resultado) {
        this.convidado = convidado;
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
        int ret = 1;
        if (convidado != null) {
            ret = 31 * ret + convidado.hashCode();
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
        if (!(obj instanceof CadastrarConvidadoOutput)) {
            return false;
        }
        CadastrarConvidadoOutput other = (CadastrarConvidadoOutput) obj;
        if ((convidado == null) != (other.convidado == null)) {
            return false;
        }
        if ((convidado != null) && !convidado.equals(other.convidado)) {
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
    	CadastrarConvidadoOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
