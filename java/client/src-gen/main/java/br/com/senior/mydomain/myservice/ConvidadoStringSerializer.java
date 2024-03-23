package br.com.senior.mydomain.myservice;

import java.util.List;

public class ConvidadoStringSerializer {
    
	public static final ConvidadoStringSerializer INSTANCE = new ConvidadoStringSerializer();
    
    public void serialize(Convidado convidado, StringBuilder sb, List<Object> appended) {
		sb.append(convidado.getClass().getSimpleName()).append(" [");
		if (appended.contains(convidado)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(convidado);
		serializeId(convidado, sb);
		sb.append(", ");
		serializeNome(convidado, sb);
		sb.append(", ");
		serializeNomeSocial(convidado, sb);
		sb.append(", ");
		serializeCpf(convidado, sb);
		sb.append(", ");
		serializeDataNascimneto(convidado, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Convidado convidado, StringBuilder sb) {
		sb.append("id=").append(convidado.id == null ? "null" : convidado.id);
	}
	
	protected void serializeNome(Convidado convidado, StringBuilder sb) {
		sb.append("nome=").append(convidado.nome == null ? "null" : convidado.nome);
	}
	
	protected void serializeNomeSocial(Convidado convidado, StringBuilder sb) {
		sb.append("nomeSocial=").append(convidado.nomeSocial == null ? "null" : convidado.nomeSocial);
	}
	
	protected void serializeCpf(Convidado convidado, StringBuilder sb) {
		sb.append("cpf=").append(convidado.cpf == null ? "null" : convidado.cpf);
	}
	
	protected void serializeDataNascimneto(Convidado convidado, StringBuilder sb) {
		sb.append("dataNascimneto=").append(convidado.dataNascimneto == null ? "null" : convidado.dataNascimneto);
	}
}
