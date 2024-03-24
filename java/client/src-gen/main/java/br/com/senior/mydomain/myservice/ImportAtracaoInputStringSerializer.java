package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportAtracaoInputStringSerializer {
    
	public static final ImportAtracaoInputStringSerializer INSTANCE = new ImportAtracaoInputStringSerializer();
    
    public void serialize(ImportAtracaoInput importAtracaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(importAtracaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importAtracaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importAtracaoInput);
		serializeConfig(importAtracaoInput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeConfig(ImportAtracaoInput importAtracaoInput, StringBuilder sb, List<Object> appended) {
		sb.append("config=<");
		if (importAtracaoInput.config == null) {
			sb.append("null");
		} else {
			importAtracaoInput.config.toString(sb, appended);
		}
		sb.append('>');
	}
}
