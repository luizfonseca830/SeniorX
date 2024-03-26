package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetIdsByNomeConvidadoOutputStringSerializer {
    
	public static final GetIdsByNomeConvidadoOutputStringSerializer INSTANCE = new GetIdsByNomeConvidadoOutputStringSerializer();
    
    public void serialize(GetIdsByNomeConvidadoOutput getIdsByNomeConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(getIdsByNomeConvidadoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getIdsByNomeConvidadoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getIdsByNomeConvidadoOutput);
		serializeId(getIdsByNomeConvidadoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(GetIdsByNomeConvidadoOutput getIdsByNomeConvidadoOutput, StringBuilder sb) {
		sb.append("id=").append(getIdsByNomeConvidadoOutput.id == null ? "null" : getIdsByNomeConvidadoOutput.id);
	}
}
