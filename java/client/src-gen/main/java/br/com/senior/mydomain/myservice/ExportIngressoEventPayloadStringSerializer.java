package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportIngressoEventPayloadStringSerializer {
    
	public static final ExportIngressoEventPayloadStringSerializer INSTANCE = new ExportIngressoEventPayloadStringSerializer();
    
    public void serialize(ExportIngressoEventPayload exportIngressoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(exportIngressoEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportIngressoEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportIngressoEventPayload);
		serializeEventpl(exportIngressoEventPayload, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEventpl(ExportIngressoEventPayload exportIngressoEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append("eventpl=<");
		if (exportIngressoEventPayload.eventpl == null) {
			sb.append("null");
		} else {
			exportIngressoEventPayload.eventpl.toString(sb, appended);
		}
		sb.append('>');
	}
}
