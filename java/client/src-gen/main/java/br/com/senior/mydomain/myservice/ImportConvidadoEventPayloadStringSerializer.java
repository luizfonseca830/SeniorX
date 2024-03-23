package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportConvidadoEventPayloadStringSerializer {
    
	public static final ImportConvidadoEventPayloadStringSerializer INSTANCE = new ImportConvidadoEventPayloadStringSerializer();
    
    public void serialize(ImportConvidadoEventPayload importConvidadoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importConvidadoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importConvidadoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importConvidadoEventPayload);
		serializeEventpl(importConvidadoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportConvidadoEventPayload importConvidadoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importConvidadoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importConvidadoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
