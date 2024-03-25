package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraSubtracaoInputStringSerializer {
    
	public static final CalculadoraSubtracaoInputStringSerializer INSTANCE = new CalculadoraSubtracaoInputStringSerializer();
    
    public void serialize(CalculadoraSubtracaoInput calculadoraSubtracaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraSubtracaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraSubtracaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraSubtracaoInput);
		serializeNumero1(calculadoraSubtracaoInput, sb);
		sb.append(", ");
		serializeNumero2(calculadoraSubtracaoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNumero1(CalculadoraSubtracaoInput calculadoraSubtracaoInput, StringBuilder sb) {
		sb.append("numero1=").append(calculadoraSubtracaoInput.numero1 == null ? "null" : calculadoraSubtracaoInput.numero1);
	}
	
	protected void serializeNumero2(CalculadoraSubtracaoInput calculadoraSubtracaoInput, StringBuilder sb) {
		sb.append("numero2=").append(calculadoraSubtracaoInput.numero2 == null ? "null" : calculadoraSubtracaoInput.numero2);
	}
}
