package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportAtracaoEventPayloadStringSerializer {
    
	public static final ExportAtracaoEventPayloadStringSerializer INSTANCE = new ExportAtracaoEventPayloadStringSerializer();
    
    public void serialize(ExportAtracaoEventPayload exportAtracaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportAtracaoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportAtracaoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportAtracaoEventPayload);
		serializeEventpl(exportAtracaoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportAtracaoEventPayload exportAtracaoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportAtracaoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportAtracaoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
