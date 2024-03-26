package br.com.senior.mydomain.myservice;

import java.util.List;

public class UpdateConvidadoNomeSocialByNomeInputStringSerializer {
    
	public static final UpdateConvidadoNomeSocialByNomeInputStringSerializer INSTANCE = new UpdateConvidadoNomeSocialByNomeInputStringSerializer();
    
    public void serialize(UpdateConvidadoNomeSocialByNomeInput updateConvidadoNomeSocialByNomeInput, StringBuilder sb, List<Object> appended) {
		sb.append(updateConvidadoNomeSocialByNomeInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(updateConvidadoNomeSocialByNomeInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(updateConvidadoNomeSocialByNomeInput);
		serializeNome(updateConvidadoNomeSocialByNomeInput, sb);
		sb.append(", ");
		serializeNomeSocial(updateConvidadoNomeSocialByNomeInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(UpdateConvidadoNomeSocialByNomeInput updateConvidadoNomeSocialByNomeInput, StringBuilder sb) {
		sb.append("nome=").append(updateConvidadoNomeSocialByNomeInput.nome == null ? "null" : updateConvidadoNomeSocialByNomeInput.nome);
	}
	
	protected void serializeNomeSocial(UpdateConvidadoNomeSocialByNomeInput updateConvidadoNomeSocialByNomeInput, StringBuilder sb) {
		sb.append("nomeSocial=").append(updateConvidadoNomeSocialByNomeInput.nomeSocial == null ? "null" : updateConvidadoNomeSocialByNomeInput.nomeSocial);
	}
}
