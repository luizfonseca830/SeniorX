package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetAllConvidadosOutputStringSerializer {
    
	public static final GetAllConvidadosOutputStringSerializer INSTANCE = new GetAllConvidadosOutputStringSerializer();
    
    public void serialize(GetAllConvidadosOutput getAllConvidadosOutput, StringBuilder sb, List<Object> appended) {
		sb.append(getAllConvidadosOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getAllConvidadosOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getAllConvidadosOutput);
		serializeId(getAllConvidadosOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(GetAllConvidadosOutput getAllConvidadosOutput, StringBuilder sb) {
		sb.append("id=").append(getAllConvidadosOutput.id == null ? "null" : getAllConvidadosOutput.id);
	}
}
