package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEventoInputStringSerializer {
    
	public static final ExportEventoInputStringSerializer INSTANCE = new ExportEventoInputStringSerializer();
    
    public void serialize(ExportEventoInput exportEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportEventoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEventoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEventoInput);
		serializeConfig(exportEventoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportEventoInput exportEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportEventoInput.config == null) {
			sb.append("null");
		} else {
			exportEventoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
