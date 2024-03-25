package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraAdicaoInputStringSerializer {
    
	public static final CalculadoraAdicaoInputStringSerializer INSTANCE = new CalculadoraAdicaoInputStringSerializer();
    
    public void serialize(CalculadoraAdicaoInput calculadoraAdicaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraAdicaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraAdicaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraAdicaoInput);
		serializeNumero1(calculadoraAdicaoInput, sb);
		sb.append(", ");
		serializeNumero2(calculadoraAdicaoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNumero1(CalculadoraAdicaoInput calculadoraAdicaoInput, StringBuilder sb) {
		sb.append("numero1=").append(calculadoraAdicaoInput.numero1 == null ? "null" : calculadoraAdicaoInput.numero1);
	}
	
	protected void serializeNumero2(CalculadoraAdicaoInput calculadoraAdicaoInput, StringBuilder sb) {
		sb.append("numero2=").append(calculadoraAdicaoInput.numero2 == null ? "null" : calculadoraAdicaoInput.numero2);
	}
}
