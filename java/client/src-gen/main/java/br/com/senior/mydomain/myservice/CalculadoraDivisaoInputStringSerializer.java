package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraDivisaoInputStringSerializer {
    
	public static final CalculadoraDivisaoInputStringSerializer INSTANCE = new CalculadoraDivisaoInputStringSerializer();
    
    public void serialize(CalculadoraDivisaoInput calculadoraDivisaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraDivisaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraDivisaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraDivisaoInput);
		serializeNumero1(calculadoraDivisaoInput, sb);
		sb.append(", ");
		serializeNumero2(calculadoraDivisaoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNumero1(CalculadoraDivisaoInput calculadoraDivisaoInput, StringBuilder sb) {
		sb.append("numero1=").append(calculadoraDivisaoInput.numero1 == null ? "null" : calculadoraDivisaoInput.numero1);
	}
	
	protected void serializeNumero2(CalculadoraDivisaoInput calculadoraDivisaoInput, StringBuilder sb) {
		sb.append("numero2=").append(calculadoraDivisaoInput.numero2 == null ? "null" : calculadoraDivisaoInput.numero2);
	}
}
