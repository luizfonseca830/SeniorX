package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportAtracaoEventPayloadStringSerializer {
    
	public static final ImportAtracaoEventPayloadStringSerializer INSTANCE = new ImportAtracaoEventPayloadStringSerializer();
    
    public void serialize(ImportAtracaoEventPayload importAtracaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(importAtracaoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(importAtracaoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importAtracaoEventPayload);
		serializeEventpl(importAtracaoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ImportAtracaoEventPayload importAtracaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (importAtracaoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			importAtracaoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
