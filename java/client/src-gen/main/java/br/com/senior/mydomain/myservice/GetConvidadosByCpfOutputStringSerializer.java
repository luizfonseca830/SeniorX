package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetConvidadosByCpfOutputStringSerializer {
    
	public static final GetConvidadosByCpfOutputStringSerializer INSTANCE = new GetConvidadosByCpfOutputStringSerializer();
    
    public void serialize(GetConvidadosByCpfOutput getConvidadosByCpfOutput, StringBuilder sb, List<Object> appended) {
		sb.append(getConvidadosByCpfOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getConvidadosByCpfOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getConvidadosByCpfOutput);
		serializeNomeConvidado(getConvidadosByCpfOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNomeConvidado(GetConvidadosByCpfOutput getConvidadosByCpfOutput, StringBuilder sb) {
		sb.append("nomeConvidado=").append(getConvidadosByCpfOutput.nomeConvidado == null ? "null" : getConvidadosByCpfOutput.nomeConvidado);
	}
}
