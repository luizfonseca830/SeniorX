package br.com.senior.mydomain.myservice;

import java.util.List;

public class CadastrarEventoInputStringSerializer {
    
	public static final CadastrarEventoInputStringSerializer INSTANCE = new CadastrarEventoInputStringSerializer();
    
    public void serialize(CadastrarEventoInput cadastrarEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append(cadastrarEventoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cadastrarEventoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cadastrarEventoInput);
		serializeNome(cadastrarEventoInput, sb);
		sb.append(", ");
		serializeApenasColaboradores(cadastrarEventoInput, sb);
		sb.append(", ");
		serializeLotacaoMaxima(cadastrarEventoInput, sb);
		sb.append(", ");
		serializeData(cadastrarEventoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(CadastrarEventoInput cadastrarEventoInput, StringBuilder sb) {
		sb.append("nome=").append(cadastrarEventoInput.nome == null ? "null" : cadastrarEventoInput.nome);
	}
	
	protected void serializeApenasColaboradores(CadastrarEventoInput cadastrarEventoInput, StringBuilder sb) {
		sb.append("apenasColaboradores=").append(cadastrarEventoInput.apenasColaboradores == null ? "null" : cadastrarEventoInput.apenasColaboradores);
	}
	
	protected void serializeLotacaoMaxima(CadastrarEventoInput cadastrarEventoInput, StringBuilder sb) {
		sb.append("lotacaoMaxima=").append(cadastrarEventoInput.lotacaoMaxima == null ? "null" : cadastrarEventoInput.lotacaoMaxima);
	}
	
	protected void serializeData(CadastrarEventoInput cadastrarEventoInput, StringBuilder sb) {
		sb.append("data=").append(cadastrarEventoInput.data == null ? "null" : cadastrarEventoInput.data);
	}
}
