package br.com.senior.mydomain.myservice;

import java.util.List;

public class IngressoStringSerializer {
    
	public static final IngressoStringSerializer INSTANCE = new IngressoStringSerializer();
    
    public void serialize(Ingresso ingresso, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Ingresso ingresso, StringBuilder sb) {
		sb.append("id=").append(ingresso.id == null ? "null" : ingresso.id);
	}
	
	protected void serializeDataHora(Ingresso ingresso, StringBuilder sb) {
		sb.append("dataHora=").append(ingresso.dataHora == null ? "null" : ingresso.dataHora);
	}
	
	protected void serializeConvidado(Ingresso ingresso, StringBuilder sb, List<Object> appended) {
		sb.append("convidado=<");
		if (ingresso.convidado == null) {
			sb.append("null");
		} else {
			ingresso.convidado.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeQuantidadeAcompanhantes(Ingresso ingresso, StringBuilder sb) {
		sb.append("quantidadeAcompanhantes=").append(ingresso.quantidadeAcompanhantes == null ? "null" : ingresso.quantidadeAcompanhantes);
	}
	
	protected void serializeEvento(Ingresso ingresso, StringBuilder sb, List<Object> appended) {
		sb.append("evento=<");
		if (ingresso.evento == null) {
			sb.append("null");
		} else {
			ingresso.evento.toString(sb, appended);
		}
		sb.append('>');
	}
}
