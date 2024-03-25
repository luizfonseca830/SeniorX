package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraMultiplicacaoOutputStringSerializer {
    
	public static final CalculadoraMultiplicacaoOutputStringSerializer INSTANCE = new CalculadoraMultiplicacaoOutputStringSerializer();
    
    public void serialize(CalculadoraMultiplicacaoOutput calculadoraMultiplicacaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraMultiplicacaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraMultiplicacaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraMultiplicacaoOutput);
		serializeResultado(calculadoraMultiplicacaoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(CalculadoraMultiplicacaoOutput calculadoraMultiplicacaoOutput, StringBuilder sb) {
		sb.append("resultado=").append(calculadoraMultiplicacaoOutput.resultado == null ? "null" : calculadoraMultiplicacaoOutput.resultado);
	}
}
