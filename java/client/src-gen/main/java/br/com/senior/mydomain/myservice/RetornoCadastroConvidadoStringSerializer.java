package br.com.senior.mydomain.myservice;

import java.util.List;

public class RetornoCadastroConvidadoStringSerializer {
    
	public static final RetornoCadastroConvidadoStringSerializer INSTANCE = new RetornoCadastroConvidadoStringSerializer();
    
    public void serialize(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb, List<Object> appended) {
		sb.append(retornoCadastroConvidado.getClass().getSimpleName()).append(" [");
		if (appended.contains(retornoCadastroConvidado)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(retornoCadastroConvidado);
		serializeMensagemRetorno(retornoCadastroConvidado, sb);
		sb.append(", ");
		serializeCodigoCadastrado(retornoCadastroConvidado, sb);
		sb.append(", ");
		serializeContemErro(retornoCadastroConvidado, sb);
		sb.append(", ");
		serializeNome(retornoCadastroConvidado, sb);
		sb.append(", ");
		serializeNomeSocial(retornoCadastroConvidado, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMensagemRetorno(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("mensagemRetorno=").append(retornoCadastroConvidado.mensagemRetorno == null ? "null" : retornoCadastroConvidado.mensagemRetorno);
	}
	
	protected void serializeCodigoCadastrado(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("codigoCadastrado=").append(retornoCadastroConvidado.codigoCadastrado == null ? "null" : retornoCadastroConvidado.codigoCadastrado);
	}
	
	protected void serializeContemErro(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("contemErro=").append(retornoCadastroConvidado.contemErro == null ? "null" : retornoCadastroConvidado.contemErro);
	}
	
	protected void serializeNome(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("nome=").append(retornoCadastroConvidado.nome == null ? "null" : retornoCadastroConvidado.nome);
	}
	
	protected void serializeNomeSocial(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("nomeSocial=").append(retornoCadastroConvidado.nomeSocial == null ? "null" : retornoCadastroConvidado.nomeSocial);
	}
}
