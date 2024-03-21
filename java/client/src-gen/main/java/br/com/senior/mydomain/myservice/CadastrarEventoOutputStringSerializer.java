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
		serializeRetorno(cadastrarEventoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeRetorno(CadastrarEventoOutput cadastrarEventoOutput, StringBuilder sb) {
		sb.append("retorno=").append(cadastrarEventoOutput.retorno == null ? "null" : cadastrarEventoOutput.retorno);
	}
}
