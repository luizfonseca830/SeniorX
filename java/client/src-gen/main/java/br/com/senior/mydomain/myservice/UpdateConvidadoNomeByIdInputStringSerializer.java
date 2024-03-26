package br.com.senior.mydomain.myservice;

import java.util.List;

public class UpdateConvidadoNomeByIdInputStringSerializer {
    
	public static final UpdateConvidadoNomeByIdInputStringSerializer INSTANCE = new UpdateConvidadoNomeByIdInputStringSerializer();
    
    public void serialize(UpdateConvidadoNomeByIdInput updateConvidadoNomeByIdInput, StringBuilder sb, List<Object> appended) {
		sb.append(updateConvidadoNomeByIdInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(updateConvidadoNomeByIdInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(updateConvidadoNomeByIdInput);
		serializeId(updateConvidadoNomeByIdInput, sb);
		sb.append(", ");
		serializeNome(updateConvidadoNomeByIdInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(UpdateConvidadoNomeByIdInput updateConvidadoNomeByIdInput, StringBuilder sb) {
		sb.append("id=").append(updateConvidadoNomeByIdInput.id == null ? "null" : updateConvidadoNomeByIdInput.id);
	}
	
	protected void serializeNome(UpdateConvidadoNomeByIdInput updateConvidadoNomeByIdInput, StringBuilder sb) {
		sb.append("nome=").append(updateConvidadoNomeByIdInput.nome == null ? "null" : updateConvidadoNomeByIdInput.nome);
	}
}
