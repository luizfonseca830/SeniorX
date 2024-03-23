package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportErrorStringSerializer {
    
	public static final ImportErrorStringSerializer INSTANCE = new ImportErrorStringSerializer();
    
    public void serialize(ImportError importError, StringBuilder sb, List<Object> appended) {
		sb.append(importError.getClass().getSimpleName()).append(" [");
		if (appended.contains(importError)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importError);
		serializeErrorType(importError, sb);
		sb.append(", ");
		serializeLineNumber(importError, sb);
		sb.append(", ");
		serializeBean(importError, sb);
		sb.append(", ");
		serializeMessage(importError, sb);
		sb.append(", ");
		serializeExceptionClass(importError, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeErrorType(ImportError importError, StringBuilder sb) {
		sb.append("errorType=").append(importError.errorType == null ? "null" : importError.errorType);
	}
	
	protected void serializeLineNumber(ImportError importError, StringBuilder sb) {
		sb.append("lineNumber=").append(importError.lineNumber == null ? "null" : importError.lineNumber);
	}
	
	protected void serializeBean(ImportError importError, StringBuilder sb) {
		sb.append("bean=").append(importError.bean == null ? "null" : importError.bean);
	}
	
	protected void serializeMessage(ImportError importError, StringBuilder sb) {
		sb.append("message=").append(importError.message == null ? "null" : importError.message);
	}
	
	protected void serializeExceptionClass(ImportError importError, StringBuilder sb) {
		sb.append("exceptionClass=").append(importError.exceptionClass == null ? "null" : importError.exceptionClass);
	}
}
