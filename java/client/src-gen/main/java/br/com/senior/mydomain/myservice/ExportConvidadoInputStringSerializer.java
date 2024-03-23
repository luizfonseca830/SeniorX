package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportConvidadoInputStringSerializer {
    
	public static final ExportConvidadoInputStringSerializer INSTANCE = new ExportConvidadoInputStringSerializer();
    
    public void serialize(ExportConvidadoInput exportConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportConvidadoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportConvidadoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportConvidadoInput);
		serializeConfig(exportConvidadoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportConvidadoInput exportConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportConvidadoInput.config == null) {
			sb.append("null");
		} else {
			exportConvidadoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
