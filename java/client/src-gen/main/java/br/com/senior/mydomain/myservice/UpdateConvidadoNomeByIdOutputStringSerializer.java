package br.com.senior.mydomain.myservice;

import java.util.List;

public class UpdateConvidadoNomeByIdOutputStringSerializer {
    
	public static final UpdateConvidadoNomeByIdOutputStringSerializer INSTANCE = new UpdateConvidadoNomeByIdOutputStringSerializer();
    
    public void serialize(UpdateConvidadoNomeByIdOutput updateConvidadoNomeByIdOutput, StringBuilder sb, List<Object> appended) {
		sb.append(updateConvidadoNomeByIdOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(updateConvidadoNomeByIdOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(updateConvidadoNomeByIdOutput);
		serializeId(updateConvidadoNomeByIdOutput, sb);
		sb.append(", ");
		serializeNome(updateConvidadoNomeByIdOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(UpdateConvidadoNomeByIdOutput updateConvidadoNomeByIdOutput, StringBuilder sb) {
		sb.append("id=").append(updateConvidadoNomeByIdOutput.id == null ? "null" : updateConvidadoNomeByIdOutput.id);
	}
	
	protected void serializeNome(UpdateConvidadoNomeByIdOutput updateConvidadoNomeByIdOutput, StringBuilder sb) {
		sb.append("nome=").append(updateConvidadoNomeByIdOutput.nome == null ? "null" : updateConvidadoNomeByIdOutput.nome);
	}
}
