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
		serializeMensagem(cadastrarConvidadoOutput, sb, appended);
		sb.append(", ");
		serializeConvidado(cadastrarConvidadoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMensagem(CadastrarConvidadoOutput cadastrarConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("mensagem=<");
		if (cadastrarConvidadoOutput.mensagem == null) {
			sb.append("null");
		} else {
			cadastrarConvidadoOutput.mensagem.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeConvidado(CadastrarConvidadoOutput cadastrarConvidadoOutput, StringBuilder sb) {
		sb.append("convidado=").append(cadastrarConvidadoOutput.convidado == null ? "null" : cadastrarConvidadoOutput.convidado);
	}
}
