package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEventoInputStringSerializer {
    
	public static final ImportEventoInputStringSerializer INSTANCE = new ImportEventoInputStringSerializer();
    
    public void serialize(ImportEventoInput importEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append(importEventoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEventoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEventoInput);
		serializeConfig(importEventoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportEventoInput importEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importEventoInput.config == null) {
			sb.append("null");
		} else {
			importEventoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
