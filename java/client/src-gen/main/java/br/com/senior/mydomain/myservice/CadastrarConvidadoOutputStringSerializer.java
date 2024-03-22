package br.com.senior.mydomain.myservice;

import java.util.List;

public class CadastrarConvidadoOutputStringSerializer {
    
	public static final CadastrarConvidadoOutputStringSerializer INSTANCE = new CadastrarConvidadoOutputStringSerializer();
    
    public void serialize(CadastrarConvidadoOutput cadastrarConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(cadastrarConvidadoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cadastrarConvidadoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cadastrarConvidadoOutput);
		serializeConvidado(cadastrarConvidadoOutput, sb, appended);
		sb.append(", ");
		serializeResultado(cadastrarConvidadoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConvidado(CadastrarConvidadoOutput cadastrarConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("convidado=<");
		if (cadastrarConvidadoOutput.convidado == null) {
			sb.append("null");
		} else {
			cadastrarConvidadoOutput.convidado.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeResultado(CadastrarConvidadoOutput cadastrarConvidadoOutput, StringBuilder sb) {
		sb.append("resultado=").append(cadastrarConvidadoOutput.resultado == null ? "null" : cadastrarConvidadoOutput.resultado);
	}
}
