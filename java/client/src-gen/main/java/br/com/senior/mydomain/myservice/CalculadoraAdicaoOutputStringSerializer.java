package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraAdicaoOutputStringSerializer {
    
	public static final CalculadoraAdicaoOutputStringSerializer INSTANCE = new CalculadoraAdicaoOutputStringSerializer();
    
    public void serialize(CalculadoraAdicaoOutput calculadoraAdicaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraAdicaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraAdicaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraAdicaoOutput);
		serializeResultado(calculadoraAdicaoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(CalculadoraAdicaoOutput calculadoraAdicaoOutput, StringBuilder sb) {
		sb.append("resultado=").append(calculadoraAdicaoOutput.resultado == null ? "null" : calculadoraAdicaoOutput.resultado);
	}
}
