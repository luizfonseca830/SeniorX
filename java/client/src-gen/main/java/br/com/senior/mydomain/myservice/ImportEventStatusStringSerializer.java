package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportEventStatusStringSerializer {
    
	public static final ImportEventStatusStringSerializer INSTANCE = new ImportEventStatusStringSerializer();
    
    public void serialize(ImportEventStatus importEventStatus, StringBuilder sb, List<Object> appended) {
		sb.append(importEventStatus.getClass().getSimpleName()).append(" [");
		if (appended.contains(importEventStatus)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importEventStatus);
		serializeImporterId(importEventStatus, sb);
		sb.append(", ");
		serializeEventType(importEventStatus, sb);
		sb.append(", ");
		serializeStatus(importEventStatus, sb);
		sb.append(", ");
		serializeErrorMessage(importEventStatus, sb);
		sb.append(", ");
		serializeRecordCount(importEventStatus, sb);
		sb.append(", ");
		serializeImportReport(importEventStatus, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeImporterId(ImportEventStatus importEventStatus, StringBuilder sb) {
		sb.append("importerId=").append(importEventStatus.importerId == null ? "null" : importEventStatus.importerId);
	}
	
	protected void serializeEventType(ImportEventStatus importEventStatus, StringBuilder sb) {
		sb.append("eventType=").append(importEventStatus.eventType == null ? "null" : importEventStatus.eventType);
	}
	
	protected void serializeStatus(ImportEventStatus importEventStatus, StringBuilder sb) {
		sb.append("status=").append(importEventStatus.status == null ? "null" : importEventStatus.status);
	}
	
	protected void serializeErrorMessage(ImportEventStatus importEventStatus, StringBuilder sb) {
		sb.append("errorMessage=").append(importEventStatus.errorMessage == null ? "null" : importEventStatus.errorMessage);
	}
	
	protected void serializeRecordCount(ImportEventStatus importEventStatus, StringBuilder sb) {
		sb.append("recordCount=").append(importEventStatus.recordCount == null ? "null" : importEventStatus.recordCount);
	}
	
	protected void serializeImportReport(ImportEventStatus importEventStatus, StringBuilder sb, List<Object> appended) {
		sb.append("importReport=<");
		if (importEventStatus.importReport == null) {
			sb.append("null");
		} else {
			importEventStatus.importReport.toString(sb, appended);
		}
		sb.append('>');
	}
}
