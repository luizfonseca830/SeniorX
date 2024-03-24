package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportAtracaoInputStringSerializer {
    
	public static final ExportAtracaoInputStringSerializer INSTANCE = new ExportAtracaoInputStringSerializer();
    
    public void serialize(ExportAtracaoInput exportAtracaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(exportAtracaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportAtracaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportAtracaoInput);
		serializeConfig(exportAtracaoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ExportAtracaoInput exportAtracaoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (exportAtracaoInput.config == null) {
			sb.append("null");
		} else {
			exportAtracaoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
