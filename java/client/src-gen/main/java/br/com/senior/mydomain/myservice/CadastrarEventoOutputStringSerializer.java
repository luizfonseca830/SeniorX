package br.com.senior.mydomain.myservice;

import java.util.List;

public class CadastrarEventoOutputStringSerializer {
    
	public static final CadastrarEventoOutputStringSerializer INSTANCE = new CadastrarEventoOutputStringSerializer();
    
    public void serialize(CadastrarEventoOutput cadastrarEventoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(cadastrarEventoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cadastrarEventoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cadastrarEventoOutput);
		serializeRetorno(cadastrarEventoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(CadastrarEventoOutput cadastrarEventoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("retorno=<");
		if (cadastrarEventoOutput.retorno == null) {
			sb.append("null");
		} else {
			cadastrarEventoOutput.retorno.toString(sb, appended);
		}
		sb.append('>');
	}
}
