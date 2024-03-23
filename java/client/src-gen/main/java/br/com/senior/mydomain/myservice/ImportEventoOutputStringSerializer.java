package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEventoOutputStringSerializer {
    
	public static final ImportEventoOutputStringSerializer INSTANCE = new ImportEventoOutputStringSerializer();
    
    public void serialize(ImportEventoOutput importEventoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importEventoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEventoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEventoOutput);
		serializeImportJobId(importEventoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportEventoOutput importEventoOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importEventoOutput.importJobId == null ? "null" : importEventoOutput.importJobId);
	}
}
