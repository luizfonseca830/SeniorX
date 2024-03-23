/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class EventoEntityStringSerializer {
	
	public static final EventoEntityStringSerializer INSTANCE = new EventoEntityStringSerializer();
    
    public void serialize(EventoEntity evento, StringBuilder sb, List<Object> appended) {
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
		serializeTipoEntradaEvento(evento, sb);
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(EventoEntity evento, StringBuilder sb) {
		sb.append("id=").append(evento.getId() == null ? "null" : evento.getId());
	}
	
	protected void serializeNome(EventoEntity evento, StringBuilder sb) {
		sb.append("nome=").append(evento.getNome() == null ? "null" : evento.getNome());
	}
	
	protected void serializeLotacaoMaxima(EventoEntity evento, StringBuilder sb) {
		sb.append("lotacaoMaxima=").append(evento.getLotacaoMaxima() == null ? "null" : evento.getLotacaoMaxima());
	}
	
	protected void serializeDataHora(EventoEntity evento, StringBuilder sb) {
		sb.append("dataHora=").append(evento.getDataHora() == null ? "null" : evento.getDataHora());
	}
	
	protected void serializeEndereco(EventoEntity evento, StringBuilder sb) {
		sb.append("endereco=").append(evento.getEndereco() == null ? "null" : evento.getEndereco());
	}
	
	protected void serializeTipoEntradaEvento(EventoEntity evento, StringBuilder sb) {
		sb.append("tipoEntradaEvento=").append(evento.getTipoEntradaEvento() == null ? "null" : evento.getTipoEntradaEvento());
	}
}
