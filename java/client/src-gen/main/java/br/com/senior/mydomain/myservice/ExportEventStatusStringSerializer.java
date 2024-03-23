package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportEventStatusStringSerializer {
    
	public static final ExportEventStatusStringSerializer INSTANCE = new ExportEventStatusStringSerializer();
    
    public void serialize(ExportEventStatus exportEventStatus, StringBuilder sb, List<Object> appended) {
		sb.append(exportEventStatus.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportEventStatus)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportEventStatus);
		serializeImporterId(exportEventStatus, sb);
		sb.append(", ");
		serializeEventType(exportEventStatus, sb);
		sb.append(", ");
		serializeRecordCount(exportEventStatus, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImporterId(ExportEventStatus exportEventStatus, StringBuilder sb) {
		sb.append("importerId=").append(exportEventStatus.importerId == null ? "null" : exportEventStatus.importerId);
	}
	
	protected void serializeEventType(ExportEventStatus exportEventStatus, StringBuilder sb) {
		sb.append("eventType=").append(exportEventStatus.eventType == null ? "null" : exportEventStatus.eventType);
	}
	
	protected void serializeRecordCount(ExportEventStatus exportEventStatus, StringBuilder sb) {
		sb.append("recordCount=").append(exportEventStatus.recordCount == null ? "null" : exportEventStatus.recordCount);
	}
}
