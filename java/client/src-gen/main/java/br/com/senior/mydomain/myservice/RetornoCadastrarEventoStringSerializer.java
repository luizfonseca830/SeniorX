package br.com.senior.mydomain.myservice;

import java.util.List;

public class RetornoCadastrarEventoStringSerializer {
    
	public static final RetornoCadastrarEventoStringSerializer INSTANCE = new RetornoCadastrarEventoStringSerializer();
    
    public void serialize(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb, List<Object> appended) {
		sb.append(retornoCadastrarEvento.getClass().getSimpleName()).append(" [");
		if (appended.contains(retornoCadastrarEvento)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(retornoCadastrarEvento);
		serializeMensagem(retornoCadastrarEvento, sb, appended);
		sb.append(", ");
		serializeNome(retornoCadastrarEvento, sb);
		sb.append(", ");
		serializeApenasColaboradores(retornoCadastrarEvento, sb);
		sb.append(", ");
		serializeLotacaoMaxima(retornoCadastrarEvento, sb);
		sb.append(", ");
		serializeData(retornoCadastrarEvento, sb);
		sb.append(", ");
		serializeTipoEntradaEvento(retornoCadastrarEvento, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMensagem(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb, List<Object> appended) {
		sb.append("mensagem=<");
		if (retornoCadastrarEvento.mensagem == null) {
			sb.append("null");
		} else {
			retornoCadastrarEvento.mensagem.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeNome(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb) {
		sb.append("nome=").append(retornoCadastrarEvento.nome == null ? "null" : retornoCadastrarEvento.nome);
	}
	
	protected void serializeApenasColaboradores(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb) {
		sb.append("apenasColaboradores=").append(retornoCadastrarEvento.apenasColaboradores == null ? "null" : retornoCadastrarEvento.apenasColaboradores);
	}
	
	protected void serializeLotacaoMaxima(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb) {
		sb.append("lotacaoMaxima=").append(retornoCadastrarEvento.lotacaoMaxima == null ? "null" : retornoCadastrarEvento.lotacaoMaxima);
	}
	
	protected void serializeData(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb) {
		sb.append("data=").append(retornoCadastrarEvento.data == null ? "null" : retornoCadastrarEvento.data);
	}
	
	protected void serializeTipoEntradaEvento(RetornoCadastrarEvento retornoCadastrarEvento, StringBuilder sb) {
		sb.append("tipoEntradaEvento=").append(retornoCadastrarEvento.tipoEntradaEvento == null ? "null" : retornoCadastrarEvento.tipoEntradaEvento);
	}
}
