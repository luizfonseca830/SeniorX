package br.com.senior.mydomain.myservice;

import java.util.List;

public class AtracaoStringSerializer {
    
	public static final AtracaoStringSerializer INSTANCE = new AtracaoStringSerializer();
    
    public void serialize(Atracao atracao, StringBuilder sb, List<Object> appended) {
		sb.append(atracao.getClass().getSimpleName()).append(" [");
		if (appended.contains(atracao)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(atracao);
		serializeId(atracao, sb);
		sb.append(", ");
		serializeNome(atracao, sb);
		sb.append(", ");
		serializeDataHora(atracao, sb);
		sb.append(", ");
		serializeLocal(atracao, sb);
		sb.append(", ");
		serializeEvento(atracao, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Atracao atracao, StringBuilder sb) {
		sb.append("id=").append(atracao.id == null ? "null" : atracao.id);
	}
	
	protected void serializeNome(Atracao atracao, StringBuilder sb) {
		sb.append("nome=").append(atracao.nome == null ? "null" : atracao.nome);
	}
	
	protected void serializeDataHora(Atracao atracao, StringBuilder sb) {
		sb.append("dataHora=").append(atracao.dataHora == null ? "null" : atracao.dataHora);
	}
	
	protected void serializeLocal(Atracao atracao, StringBuilder sb) {
		sb.append("local=").append(atracao.local == null ? "null" : atracao.local);
	}
	
	protected void serializeEvento(Atracao atracao, StringBuilder sb, List<Object> appended) {
		sb.append("evento=<");
		if (atracao.evento == null) {
			sb.append("null");
		} else {
			atracao.evento.toString(sb, appended);
		}
		sb.append('>');
	}
}
