package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetConvidadosByCpfInputStringSerializer {
    
	public static final GetConvidadosByCpfInputStringSerializer INSTANCE = new GetConvidadosByCpfInputStringSerializer();
    
    public void serialize(GetConvidadosByCpfInput getConvidadosByCpfInput, StringBuilder sb, List<Object> appended) {
		sb.append(getConvidadosByCpfInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getConvidadosByCpfInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getConvidadosByCpfInput);
		serializeCpf(getConvidadosByCpfInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCpf(GetConvidadosByCpfInput getConvidadosByCpfInput, StringBuilder sb) {
		sb.append("cpf=").append(getConvidadosByCpfInput.cpf == null ? "null" : getConvidadosByCpfInput.cpf);
	}
}
