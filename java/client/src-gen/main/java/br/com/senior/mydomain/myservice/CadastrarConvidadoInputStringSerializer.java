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
		serializeNome(cadastrarConvidadoInput, sb);
		sb.append(", ");
		serializeQuantidadeAcompanhantes(cadastrarConvidadoInput, sb);
		sb.append(", ");
		serializeNomeSocial(cadastrarConvidadoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(CadastrarConvidadoInput cadastrarConvidadoInput, StringBuilder sb) {
		sb.append("nome=").append(cadastrarConvidadoInput.nome == null ? "null" : cadastrarConvidadoInput.nome);
	}
	
	protected void serializeQuantidadeAcompanhantes(CadastrarConvidadoInput cadastrarConvidadoInput, StringBuilder sb) {
		sb.append("quantidadeAcompanhantes=").append(cadastrarConvidadoInput.quantidadeAcompanhantes == null ? "null" : cadastrarConvidadoInput.quantidadeAcompanhantes);
	}
	
	protected void serializeNomeSocial(CadastrarConvidadoInput cadastrarConvidadoInput, StringBuilder sb) {
		sb.append("nomeSocial=").append(cadastrarConvidadoInput.nomeSocial == null ? "null" : cadastrarConvidadoInput.nomeSocial);
	}
}
