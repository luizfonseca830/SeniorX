package br.com.senior.mydomain.myservice;

import java.util.List;

public class FieldCalculadoraStringSerializer {
    
	public static final FieldCalculadoraStringSerializer INSTANCE = new FieldCalculadoraStringSerializer();
    
    public void serialize(FieldCalculadora fieldCalculadora, StringBuilder sb, List<Object> appended) {
		sb.append(fieldCalculadora.getClass().getSimpleName()).append(" [");
		if (appended.contains(fieldCalculadora)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(fieldCalculadora);
		serializeNumero1(fieldCalculadora, sb);
		sb.append(", ");
		serializeNumero2(fieldCalculadora, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNumero1(FieldCalculadora fieldCalculadora, StringBuilder sb) {
		sb.append("numero1=").append(fieldCalculadora.numero1 == null ? "null" : fieldCalculadora.numero1);
	}
	
	protected void serializeNumero2(FieldCalculadora fieldCalculadora, StringBuilder sb) {
		sb.append("numero2=").append(fieldCalculadora.numero2 == null ? "null" : fieldCalculadora.numero2);
	}
}
