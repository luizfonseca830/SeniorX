package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportConvidadoOutputStringSerializer {
    
	public static final ExportConvidadoOutputStringSerializer INSTANCE = new ExportConvidadoOutputStringSerializer();
    
    public void serialize(ExportConvidadoOutput exportConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportConvidadoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportConvidadoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportConvidadoOutput);
		serializeExportJobId(exportConvidadoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportConvidadoOutput exportConvidadoOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportConvidadoOutput.exportJobId == null ? "null" : exportConvidadoOutput.exportJobId);
	}
}
