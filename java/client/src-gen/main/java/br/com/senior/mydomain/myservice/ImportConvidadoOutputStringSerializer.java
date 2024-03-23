package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportConvidadoOutputStringSerializer {
    
	public static final ImportConvidadoOutputStringSerializer INSTANCE = new ImportConvidadoOutputStringSerializer();
    
    public void serialize(ImportConvidadoOutput importConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importConvidadoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importConvidadoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importConvidadoOutput);
		serializeImportJobId(importConvidadoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportConvidadoOutput importConvidadoOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importConvidadoOutput.importJobId == null ? "null" : importConvidadoOutput.importJobId);
	}
}
