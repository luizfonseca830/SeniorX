package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraInputStringSerializer {
    
	public static final CalculadoraInputStringSerializer INSTANCE = new CalculadoraInputStringSerializer();
    
    public void serialize(CalculadoraInput calculadoraInput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraInput);
		serializeNumero1(calculadoraInput, sb);
		sb.append(", ");
		serializeNumero2(calculadoraInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNumero1(CalculadoraInput calculadoraInput, StringBuilder sb) {
		sb.append("numero1=").append(calculadoraInput.numero1 == null ? "null" : calculadoraInput.numero1);
	}
	
	protected void serializeNumero2(CalculadoraInput calculadoraInput, StringBuilder sb) {
		sb.append("numero2=").append(calculadoraInput.numero2 == null ? "null" : calculadoraInput.numero2);
	}
}
