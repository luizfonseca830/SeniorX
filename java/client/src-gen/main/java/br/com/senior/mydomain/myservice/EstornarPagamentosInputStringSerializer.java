package br.com.senior.mydomain.myservice;

import java.util.List;

public class EstornarPagamentosInputStringSerializer {
    
	public static final EstornarPagamentosInputStringSerializer INSTANCE = new EstornarPagamentosInputStringSerializer();
    
    public void serialize(EstornarPagamentosInput estornarPagamentosInput, StringBuilder sb, List<Object> appended) {
		sb.append(estornarPagamentosInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(estornarPagamentosInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(estornarPagamentosInput);
		serializeIngressos(estornarPagamentosInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeIngressos(EstornarPagamentosInput estornarPagamentosInput, StringBuilder sb) {
		sb.append("ingressos=").append(estornarPagamentosInput.ingressos == null ? "null" : estornarPagamentosInput.ingressos);
	}
}
