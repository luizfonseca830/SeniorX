package br.com.senior.mydomain.myservice;

import java.util.List;

public class FieldCadastroConvidadoStringSerializer {
    
	public static final FieldCadastroConvidadoStringSerializer INSTANCE = new FieldCadastroConvidadoStringSerializer();
    
    public void serialize(FieldCadastroConvidado fieldCadastroConvidado, StringBuilder sb, List<Object> appended) {
		sb.append(fieldCadastroConvidado.getClass().getSimpleName()).append(" [");
		if (appended.contains(fieldCadastroConvidado)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(fieldCadastroConvidado);
		serializeNome(fieldCadastroConvidado, sb);
		sb.append(", ");
		serializeNomeSocial(fieldCadastroConvidado, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(FieldCadastroConvidado fieldCadastroConvidado, StringBuilder sb) {
		sb.append("nome=").append(fieldCadastroConvidado.nome == null ? "null" : fieldCadastroConvidado.nome);
	}
	
	protected void serializeNomeSocial(FieldCadastroConvidado fieldCadastroConvidado, StringBuilder sb) {
		sb.append("nomeSocial=").append(fieldCadastroConvidado.nomeSocial == null ? "null" : fieldCadastroConvidado.nomeSocial);
	}
}
