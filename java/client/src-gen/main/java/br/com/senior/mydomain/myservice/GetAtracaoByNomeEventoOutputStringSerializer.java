package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetAtracaoByNomeEventoOutputStringSerializer {
    
	public static final GetAtracaoByNomeEventoOutputStringSerializer INSTANCE = new GetAtracaoByNomeEventoOutputStringSerializer();
    
    public void serialize(GetAtracaoByNomeEventoOutput getAtracaoByNomeEventoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(getAtracaoByNomeEventoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getAtracaoByNomeEventoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getAtracaoByNomeEventoOutput);
		serializeNomeAtracao(getAtracaoByNomeEventoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNomeAtracao(GetAtracaoByNomeEventoOutput getAtracaoByNomeEventoOutput, StringBuilder sb) {
		sb.append("nomeAtracao=").append(getAtracaoByNomeEventoOutput.nomeAtracao == null ? "null" : getAtracaoByNomeEventoOutput.nomeAtracao);
	}
}
