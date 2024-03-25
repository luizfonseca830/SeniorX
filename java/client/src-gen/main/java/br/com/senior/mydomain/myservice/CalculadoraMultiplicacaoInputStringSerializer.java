package br.com.senior.mydomain.myservice;

import java.util.List;

public class CalculadoraMultiplicacaoInputStringSerializer {
    
	public static final CalculadoraMultiplicacaoInputStringSerializer INSTANCE = new CalculadoraMultiplicacaoInputStringSerializer();
    
    public void serialize(CalculadoraMultiplicacaoInput calculadoraMultiplicacaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(calculadoraMultiplicacaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(calculadoraMultiplicacaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(calculadoraMultiplicacaoInput);
		serializeNumero1(calculadoraMultiplicacaoInput, sb);
		sb.append(", ");
		serializeNumero2(calculadoraMultiplicacaoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNumero1(CalculadoraMultiplicacaoInput calculadoraMultiplicacaoInput, StringBuilder sb) {
		sb.append("numero1=").append(calculadoraMultiplicacaoInput.numero1 == null ? "null" : calculadoraMultiplicacaoInput.numero1);
	}
	
	protected void serializeNumero2(CalculadoraMultiplicacaoInput calculadoraMultiplicacaoInput, StringBuilder sb) {
		sb.append("numero2=").append(calculadoraMultiplicacaoInput.numero2 == null ? "null" : calculadoraMultiplicacaoInput.numero2);
	}
}
