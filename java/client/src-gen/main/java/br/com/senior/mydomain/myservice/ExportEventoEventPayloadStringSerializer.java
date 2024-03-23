package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEventoEventPayloadStringSerializer {
    
	public static final ExportEventoEventPayloadStringSerializer INSTANCE = new ExportEventoEventPayloadStringSerializer();
    
    public void serialize(ExportEventoEventPayload exportEventoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportEventoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEventoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEventoEventPayload);
		serializeEventpl(exportEventoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportEventoEventPayload exportEventoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportEventoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportEventoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
