package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEventoOutputStringSerializer {
    
	public static final ExportEventoOutputStringSerializer INSTANCE = new ExportEventoOutputStringSerializer();
    
    public void serialize(ExportEventoOutput exportEventoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(exportEventoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEventoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEventoOutput);
		serializeExportJobId(exportEventoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeExportJobId(ExportEventoOutput exportEventoOutput, StringBuilder sb) {
		sb.append("exportJobId=").append(exportEventoOutput.exportJobId == null ? "null" : exportEventoOutput.exportJobId);
	}
}
