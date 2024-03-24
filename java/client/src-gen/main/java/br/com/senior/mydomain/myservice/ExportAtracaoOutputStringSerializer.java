package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportAtracaoOutputStringSerializer {
    
	public static final ExportAtracaoOutputStringSerializer INSTANCE = new ExportAtracaoOutputStringSerializer();
    
    public void serialize(ExportAtracaoOutput exportAtracaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportAtracaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportAtracaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportAtracaoOutput);
		serializeExportJobId(exportAtracaoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportAtracaoOutput exportAtracaoOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportAtracaoOutput.exportJobId == null ? "null" : exportAtracaoOutput.exportJobId);
	}
}
