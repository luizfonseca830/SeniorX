/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;

public class ConvidadoEntityStringSerializer {
	
	public static final ConvidadoEntityStringSerializer INSTANCE = new ConvidadoEntityStringSerializer();
    
    public void serialize(ConvidadoEntity convidado, StringBuilder sb, List<Object> appended) {
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
		sb.append(", ").append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ConvidadoEntity convidado, StringBuilder sb) {
		sb.append("id=").append(convidado.getId() == null ? "null" : convidado.getId());
	}
	
	protected void serializeNome(ConvidadoEntity convidado, StringBuilder sb) {
		sb.append("nome=").append(convidado.getNome() == null ? "null" : convidado.getNome());
	}
	
	protected void serializeNomeSocial(ConvidadoEntity convidado, StringBuilder sb) {
		sb.append("nomeSocial=").append(convidado.getNomeSocial() == null ? "null" : convidado.getNomeSocial());
	}
	
	protected void serializeCpf(ConvidadoEntity convidado, StringBuilder sb) {
		sb.append("cpf=").append(convidado.getCpf() == null ? "null" : convidado.getCpf());
	}
	
	protected void serializeDataNascimneto(ConvidadoEntity convidado, StringBuilder sb) {
		sb.append("dataNascimneto=").append(convidado.getDataNascimneto() == null ? "null" : convidado.getDataNascimneto());
	}
}
