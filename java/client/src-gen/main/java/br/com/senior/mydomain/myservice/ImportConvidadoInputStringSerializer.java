package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportConvidadoInputStringSerializer {
    
	public static final ImportConvidadoInputStringSerializer INSTANCE = new ImportConvidadoInputStringSerializer();
    
    public void serialize(ImportConvidadoInput importConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append(importConvidadoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importConvidadoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importConvidadoInput);
		serializeConfig(importConvidadoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportConvidadoInput importConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importConvidadoInput.config == null) {
			sb.append("null");
		} else {
			importConvidadoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
