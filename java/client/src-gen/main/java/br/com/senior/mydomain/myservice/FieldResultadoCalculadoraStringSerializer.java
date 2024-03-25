package br.com.senior.mydomain.myservice;

import java.util.List;

public class FieldResultadoCalculadoraStringSerializer {
    
	public static final FieldResultadoCalculadoraStringSerializer INSTANCE = new FieldResultadoCalculadoraStringSerializer();
    
    public void serialize(FieldResultadoCalculadora fieldResultadoCalculadora, StringBuilder sb, List<Object> appended) {
		sb.append(fieldResultadoCalculadora.getClass().getSimpleName()).append(" [");
		if (appended.contains(fieldResultadoCalculadora)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(fieldResultadoCalculadora);
		serializeResultado(fieldResultadoCalculadora, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(FieldResultadoCalculadora fieldResultadoCalculadora, StringBuilder sb) {
		sb.append("resultado=").append(fieldResultadoCalculadora.resultado == null ? "null" : fieldResultadoCalculadora.resultado);
	}
}
