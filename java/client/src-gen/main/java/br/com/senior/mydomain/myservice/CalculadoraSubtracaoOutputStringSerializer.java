package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraSubtracaoOutputStringSerializer {
    
	public static final CalculadoraSubtracaoOutputStringSerializer INSTANCE = new CalculadoraSubtracaoOutputStringSerializer();
    
    public void serialize(CalculadoraSubtracaoOutput calculadoraSubtracaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraSubtracaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraSubtracaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraSubtracaoOutput);
		serializeResultado(calculadoraSubtracaoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(CalculadoraSubtracaoOutput calculadoraSubtracaoOutput, StringBuilder sb) {
		sb.append("resultado=").append(calculadoraSubtracaoOutput.resultado == null ? "null" : calculadoraSubtracaoOutput.resultado);
	}
}
