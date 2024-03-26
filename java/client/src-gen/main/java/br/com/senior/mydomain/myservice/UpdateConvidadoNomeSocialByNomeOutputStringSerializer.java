package br.com.senior.mydomain.myservice;

import java.util.List;

public class UpdateConvidadoNomeSocialByNomeOutputStringSerializer {
    
	public static final UpdateConvidadoNomeSocialByNomeOutputStringSerializer INSTANCE = new UpdateConvidadoNomeSocialByNomeOutputStringSerializer();
    
    public void serialize(UpdateConvidadoNomeSocialByNomeOutput updateConvidadoNomeSocialByNomeOutput, StringBuilder sb, List<Object> appended) {
		sb.append(updateConvidadoNomeSocialByNomeOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(updateConvidadoNomeSocialByNomeOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(updateConvidadoNomeSocialByNomeOutput);
		serializeId(updateConvidadoNomeSocialByNomeOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(UpdateConvidadoNomeSocialByNomeOutput updateConvidadoNomeSocialByNomeOutput, StringBuilder sb) {
		sb.append("id=").append(updateConvidadoNomeSocialByNomeOutput.id == null ? "null" : updateConvidadoNomeSocialByNomeOutput.id);
	}
}
