package br.com.senior.mydomain.myservice;

import java.util.List;

public class EventoStringSerializer {
    
	public static final EventoStringSerializer INSTANCE = new EventoStringSerializer();
    
    public void serialize(Evento evento, StringBuilder sb, List<Object> appended) {
		sb.append(evento.getClass().getSimpleName()).append(" [");
		if (appended.contains(evento)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(evento);
		serializeId(evento, sb);
		sb.append(", ");
		serializeNome(evento, sb);
		sb.append(", ");
		serializeLotacaoMaxima(evento, sb);
		sb.append(", ");
		serializeDataHora(evento, sb);
		sb.append(", ");
		serializeEndereco(evento, sb);
		sb.append(", ");
		serializeTipoentradaevento(evento, sb);
		sb.append(", ");
		serializeIngressos(evento, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Evento evento, StringBuilder sb) {
		sb.append("id=").append(evento.id == null ? "null" : evento.id);
	}
	
	protected void serializeNome(Evento evento, StringBuilder sb) {
		sb.append("nome=").append(evento.nome == null ? "null" : evento.nome);
	}
	
	protected void serializeLotacaoMaxima(Evento evento, StringBuilder sb) {
		sb.append("lotacaoMaxima=").append(evento.lotacaoMaxima == null ? "null" : evento.lotacaoMaxima);
	}
	
	protected void serializeDataHora(Evento evento, StringBuilder sb) {
		sb.append("dataHora=").append(evento.dataHora == null ? "null" : evento.dataHora);
	}
	
	protected void serializeEndereco(Evento evento, StringBuilder sb) {
		sb.append("endereco=").append(evento.endereco == null ? "null" : evento.endereco);
	}
	
	protected void serializeTipoentradaevento(Evento evento, StringBuilder sb) {
		sb.append("tipoentradaevento=").append(evento.tipoentradaevento == null ? "null" : evento.tipoentradaevento);
	}
	
	protected void serializeIngressos(Evento evento, StringBuilder sb, List<Object> appended) {
		sb.append("ingressos=<");
		if (evento.ingressos == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = evento.ingressos.size() - 1;
			for (int i = 0; i <= last; i++) {
				evento.ingressos.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
