package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetAtracaoByNomeEventoInputStringSerializer {
    
	public static final GetAtracaoByNomeEventoInputStringSerializer INSTANCE = new GetAtracaoByNomeEventoInputStringSerializer();
    
    public void serialize(GetAtracaoByNomeEventoInput getAtracaoByNomeEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append(getAtracaoByNomeEventoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getAtracaoByNomeEventoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getAtracaoByNomeEventoInput);
		serializeNomeEvento(getAtracaoByNomeEventoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNomeEvento(GetAtracaoByNomeEventoInput getAtracaoByNomeEventoInput, StringBuilder sb) {
		sb.append("nomeEvento=").append(getAtracaoByNomeEventoInput.nomeEvento == null ? "null" : getAtracaoByNomeEventoInput.nomeEvento);
	}
}
