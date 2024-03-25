package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraOutputStringSerializer {
    
	public static final CalculadoraOutputStringSerializer INSTANCE = new CalculadoraOutputStringSerializer();
    
    public void serialize(CalculadoraOutput calculadoraOutput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraOutput);
		serializeCalculadoraMessage(calculadoraOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCalculadoraMessage(CalculadoraOutput calculadoraOutput, StringBuilder sb) {
		sb.append("calculadoraMessage=").append(calculadoraOutput.calculadoraMessage == null ? "null" : calculadoraOutput.calculadoraMessage);
	}
}
