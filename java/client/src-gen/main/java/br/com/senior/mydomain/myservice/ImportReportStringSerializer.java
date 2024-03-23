package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportReportStringSerializer {
    
	public static final ImportReportStringSerializer INSTANCE = new ImportReportStringSerializer();
    
    public void serialize(ImportReport importReport, StringBuilder sb, List<Object> appended) {
		sb.append(importReport.getClass().getSimpleName()).append(" [");
		if (appended.contains(importReport)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importReport);
		serializeId(importReport, sb);
		sb.append(", ");
		serializeStartTime(importReport, sb);
		sb.append(", ");
		serializeEndTime(importReport, sb);
		sb.append(", ");
		serializeUri(importReport, sb);
		sb.append(", ");
		serializeBeanClass(importReport, sb);
		sb.append(", ");
		serializeServiceClass(importReport, sb);
		sb.append(", ");
		serializeLayout(importReport, sb, appended);
		sb.append(", ");
		serializeSucessCount(importReport, sb);
		sb.append(", ");
		serializeErrorsCount(importReport, sb);
		sb.append(", ");
		serializeFilteredCount(importReport, sb);
		sb.append(", ");
		serializeSkippedCount(importReport, sb);
		sb.append(", ");
		serializeImportErrors(importReport, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(ImportReport importReport, StringBuilder sb) {
		sb.append("id=").append(importReport.id == null ? "null" : importReport.id);
	}
	
	protected void serializeStartTime(ImportReport importReport, StringBuilder sb) {
		sb.append("startTime=").append(importReport.startTime == null ? "null" : importReport.startTime);
	}
	
	protected void serializeEndTime(ImportReport importReport, StringBuilder sb) {
		sb.append("endTime=").append(importReport.endTime == null ? "null" : importReport.endTime);
	}
	
	protected void serializeUri(ImportReport importReport, StringBuilder sb) {
		sb.append("uri=").append(importReport.uri == null ? "null" : importReport.uri);
	}
	
	protected void serializeBeanClass(ImportReport importReport, StringBuilder sb) {
		sb.append("beanClass=").append(importReport.beanClass == null ? "null" : importReport.beanClass);
	}
	
	protected void serializeServiceClass(ImportReport importReport, StringBuilder sb) {
		sb.append("serviceClass=").append(importReport.serviceClass == null ? "null" : importReport.serviceClass);
	}
	
	protected void serializeLayout(ImportReport importReport, StringBuilder sb, List<Object> appended) {
		sb.append("layout=<");
		if (importReport.layout == null) {
			sb.append("null");
		} else {
			importReport.layout.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeSucessCount(ImportReport importReport, StringBuilder sb) {
		sb.append("sucessCount=").append(importReport.sucessCount == null ? "null" : importReport.sucessCount);
	}
	
	protected void serializeErrorsCount(ImportReport importReport, StringBuilder sb) {
		sb.append("errorsCount=").append(importReport.errorsCount == null ? "null" : importReport.errorsCount);
	}
	
	protected void serializeFilteredCount(ImportReport importReport, StringBuilder sb) {
		sb.append("filteredCount=").append(importReport.filteredCount == null ? "null" : importReport.filteredCount);
	}
	
	protected void serializeSkippedCount(ImportReport importReport, StringBuilder sb) {
		sb.append("skippedCount=").append(importReport.skippedCount == null ? "null" : importReport.skippedCount);
	}
	
	protected void serializeImportErrors(ImportReport importReport, StringBuilder sb, List<Object> appended) {
		sb.append("importErrors=<");
		if (importReport.importErrors == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = importReport.importErrors.size() - 1;
			for (int i = 0; i <= last; i++) {
				importReport.importErrors.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
