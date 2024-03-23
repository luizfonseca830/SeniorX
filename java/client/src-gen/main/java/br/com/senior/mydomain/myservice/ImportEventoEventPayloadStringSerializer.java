package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEventoEventPayloadStringSerializer {
    
	public static final ImportEventoEventPayloadStringSerializer INSTANCE = new ImportEventoEventPayloadStringSerializer();
    
    public void serialize(ImportEventoEventPayload importEventoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importEventoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEventoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEventoEventPayload);
		serializeEventpl(importEventoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportEventoEventPayload importEventoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importEventoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importEventoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
