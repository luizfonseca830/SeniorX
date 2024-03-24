/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class AtracaoEntityStringSerializer {
	
	public static final AtracaoEntityStringSerializer INSTANCE = new AtracaoEntityStringSerializer();
    
    public void serialize(AtracaoEntity atracao, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(AtracaoEntity atracao, StringBuilder sb) {
		sb.append("id=").append(atracao.getId() == null ? "null" : atracao.getId());
	}
	
	protected void serializeNome(AtracaoEntity atracao, StringBuilder sb) {
		sb.append("nome=").append(atracao.getNome() == null ? "null" : atracao.getNome());
	}
	
	protected void serializeDataHora(AtracaoEntity atracao, StringBuilder sb) {
		sb.append("dataHora=").append(atracao.getDataHora() == null ? "null" : atracao.getDataHora());
	}
	
	protected void serializeLocal(AtracaoEntity atracao, StringBuilder sb) {
		sb.append("local=").append(atracao.getLocal() == null ? "null" : atracao.getLocal());
	}
	
	protected void serializeEvento(AtracaoEntity atracao, StringBuilder sb, List<Object> appended) {
		sb.append("evento=<");
		if (atracao.getEvento() == null) {
			sb.append("null");
		} else {
			atracao.getEvento().toString(sb, appended);
		}
		sb.append('>');
	}
}
