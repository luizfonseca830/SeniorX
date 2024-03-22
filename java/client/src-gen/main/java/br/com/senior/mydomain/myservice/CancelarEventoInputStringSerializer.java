package br.com.senior.mydomain.myservice;

import java.util.List;

public class CancelarEventoInputStringSerializer {
    
	public static final CancelarEventoInputStringSerializer INSTANCE = new CancelarEventoInputStringSerializer();
    
    public void serialize(CancelarEventoInput cancelarEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append(cancelarEventoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(cancelarEventoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(cancelarEventoInput);
		serializeCodigoEvento(cancelarEventoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCodigoEvento(CancelarEventoInput cancelarEventoInput, StringBuilder sb) {
		sb.append("codigoEvento=").append(cancelarEventoInput.codigoEvento == null ? "null" : cancelarEventoInput.codigoEvento);
	}
}
