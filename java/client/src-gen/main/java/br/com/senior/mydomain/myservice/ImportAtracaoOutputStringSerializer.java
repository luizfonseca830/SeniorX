package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportAtracaoOutputStringSerializer {
    
	public static final ImportAtracaoOutputStringSerializer INSTANCE = new ImportAtracaoOutputStringSerializer();
    
    public void serialize(ImportAtracaoOutput importAtracaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(importAtracaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(importAtracaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importAtracaoOutput);
		serializeImportJobId(importAtracaoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImportJobId(ImportAtracaoOutput importAtracaoOutput, StringBuilder sb) {
		sb.append("importJobId=").append(importAtracaoOutput.importJobId == null ? "null" : importAtracaoOutput.importJobId);
	}
}
