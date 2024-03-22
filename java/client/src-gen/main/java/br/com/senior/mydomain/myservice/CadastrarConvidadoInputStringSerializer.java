package br.com.senior.mydomain.myservice;

import java.util.List;

public class CadastrarConvidadoInputStringSerializer {
    
	public static final CadastrarConvidadoInputStringSerializer INSTANCE = new CadastrarConvidadoInputStringSerializer();
    
    public void serialize(CadastrarConvidadoInput cadastrarConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append(cadastrarConvidadoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cadastrarConvidadoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cadastrarConvidadoInput);
		serializeNome(cadastrarConvidadoInput, sb, appended);
		sb.append(", ");
		serializeQuantidadeAcompanhantes(cadastrarConvidadoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(CadastrarConvidadoInput cadastrarConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append("nome=<");
		if (cadastrarConvidadoInput.nome == null) {
			sb.append("null");
		} else {
			cadastrarConvidadoInput.nome.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeQuantidadeAcompanhantes(CadastrarConvidadoInput cadastrarConvidadoInput, StringBuilder sb) {
		sb.append("quantidadeAcompanhantes=").append(cadastrarConvidadoInput.quantidadeAcompanhantes == null ? "null" : cadastrarConvidadoInput.quantidadeAcompanhantes);
	}
}
