/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class IngressoEntityStringSerializer {
	
	public static final IngressoEntityStringSerializer INSTANCE = new IngressoEntityStringSerializer();
    
    public void serialize(IngressoEntity ingresso, StringBuilder sb, List<Object> appended) {
		sb.append(ingresso.getClass().getSimpleName()).append(" [");
		if (appended.contains(ingresso)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(ingresso);
		serializeId(ingresso, sb);
		sb.append(", ");
		serializeDataHora(ingresso, sb);
		sb.append(", ");
		serializeConvidado(ingresso, sb, appended);
		sb.append(", ");
		serializeQuantidadeAcompanhantes(ingresso, sb);
		sb.append(", ");
		serializeEvento(ingresso, sb, appended);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(IngressoEntity ingresso, StringBuilder sb) {
		sb.append("id=").append(ingresso.getId() == null ? "null" : ingresso.getId());
	}
	
	protected void serializeDataHora(IngressoEntity ingresso, StringBuilder sb) {
		sb.append("dataHora=").append(ingresso.getDataHora() == null ? "null" : ingresso.getDataHora());
	}
	
	protected void serializeConvidado(IngressoEntity ingresso, StringBuilder sb, List<Object> appended) {
		sb.append("convidado=<");
		if (ingresso.getConvidado() == null) {
			sb.append("null");
		} else {
			ingresso.getConvidado().toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeQuantidadeAcompanhantes(IngressoEntity ingresso, StringBuilder sb) {
		sb.append("quantidadeAcompanhantes=").append(ingresso.getQuantidadeAcompanhantes() == null ? "null" : ingresso.getQuantidadeAcompanhantes());
	}
	
	protected void serializeEvento(IngressoEntity ingresso, StringBuilder sb, List<Object> appended) {
		sb.append("evento=<");
		if (ingresso.getEvento() == null) {
			sb.append("null");
		} else {
			ingresso.getEvento().toString(sb, appended);
		}
		sb.append('>');
	}
}
