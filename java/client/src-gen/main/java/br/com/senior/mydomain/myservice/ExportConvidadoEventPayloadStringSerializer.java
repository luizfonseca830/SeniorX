package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportConvidadoEventPayloadStringSerializer {
    
	public static final ExportConvidadoEventPayloadStringSerializer INSTANCE = new ExportConvidadoEventPayloadStringSerializer();
    
    public void serialize(ExportConvidadoEventPayload exportConvidadoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportConvidadoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportConvidadoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportConvidadoEventPayload);
		serializeEventpl(exportConvidadoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportConvidadoEventPayload exportConvidadoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportConvidadoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportConvidadoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
