package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetIdsByNomeConvidadoInputStringSerializer {
    
	public static final GetIdsByNomeConvidadoInputStringSerializer INSTANCE = new GetIdsByNomeConvidadoInputStringSerializer();
    
    public void serialize(GetIdsByNomeConvidadoInput getIdsByNomeConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append(getIdsByNomeConvidadoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getIdsByNomeConvidadoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getIdsByNomeConvidadoInput);
		serializeNomeConvidado(getIdsByNomeConvidadoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNomeConvidado(GetIdsByNomeConvidadoInput getIdsByNomeConvidadoInput, StringBuilder sb) {
		sb.append("nomeConvidado=").append(getIdsByNomeConvidadoInput.nomeConvidado == null ? "null" : getIdsByNomeConvidadoInput.nomeConvidado);
	}
}
