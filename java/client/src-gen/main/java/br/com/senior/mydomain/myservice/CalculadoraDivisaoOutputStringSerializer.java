package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraDivisaoOutputStringSerializer {
    
	public static final CalculadoraDivisaoOutputStringSerializer INSTANCE = new CalculadoraDivisaoOutputStringSerializer();
    
    public void serialize(CalculadoraDivisaoOutput calculadoraDivisaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraDivisaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraDivisaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraDivisaoOutput);
		serializeResultado(calculadoraDivisaoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(CalculadoraDivisaoOutput calculadoraDivisaoOutput, StringBuilder sb) {
		sb.append("resultado=").append(calculadoraDivisaoOutput.resultado == null ? "null" : calculadoraDivisaoOutput.resultado);
	}
}
