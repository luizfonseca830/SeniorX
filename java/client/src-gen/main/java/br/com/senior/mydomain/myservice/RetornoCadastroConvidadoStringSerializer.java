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
		serializeMensagem(retornoCadastroConvidado, sb, appended);
		sb.append(", ");
		serializeNome(retornoCadastroConvidado, sb);
		sb.append(", ");
		serializeQuantidadeAcompanhantes(retornoCadastroConvidado, sb);
		sb.append(", ");
		serializeNomeSocial(retornoCadastroConvidado, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMensagem(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb, List<Object> appended) {
		sb.append("mensagem=<");
		if (retornoCadastroConvidado.mensagem == null) {
			sb.append("null");
		} else {
			retornoCadastroConvidado.mensagem.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeNome(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("nome=").append(retornoCadastroConvidado.nome == null ? "null" : retornoCadastroConvidado.nome);
	}
	
	protected void serializeQuantidadeAcompanhantes(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("quantidadeAcompanhantes=").append(retornoCadastroConvidado.quantidadeAcompanhantes == null ? "null" : retornoCadastroConvidado.quantidadeAcompanhantes);
	}
	
	protected void serializeNomeSocial(RetornoCadastroConvidado retornoCadastroConvidado, StringBuilder sb) {
		sb.append("nomeSocial=").append(retornoCadastroConvidado.nomeSocial == null ? "null" : retornoCadastroConvidado.nomeSocial);
	}
}
