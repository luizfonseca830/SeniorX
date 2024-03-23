package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportIngressoEventPayloadStringSerializer {
    
	public static final ImportIngressoEventPayloadStringSerializer INSTANCE = new ImportIngressoEventPayloadStringSerializer();
    
    public void serialize(ImportIngressoEventPayload importIngressoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importIngressoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importIngressoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importIngressoEventPayload);
		serializeEventpl(importIngressoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportIngressoEventPayload importIngressoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importIngressoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importIngressoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
