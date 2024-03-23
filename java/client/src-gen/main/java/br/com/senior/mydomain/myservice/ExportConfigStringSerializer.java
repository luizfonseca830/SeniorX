package br.com.senior.mydomain.myservice;

import java.util.List;

public class ExportConfigStringSerializer {
    
	public static final ExportConfigStringSerializer INSTANCE = new ExportConfigStringSerializer();
    
    public void serialize(ExportConfig exportConfig, StringBuilder sb, List<Object> appended) {
		sb.append(exportConfig.getClass().getSimpleName()).append(" [");
		if (appended.contains(exportConfig)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(exportConfig);
		serializeUri(exportConfig, sb);
		sb.append(", ");
		serializeLayout(exportConfig, sb, appended);
		sb.append(", ");
		serializeAsync(exportConfig, sb);
		sb.append(", ");
		serializeErrorStrategy(exportConfig, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUri(ExportConfig exportConfig, StringBuilder sb) {
		sb.append("uri=").append(exportConfig.uri == null ? "null" : exportConfig.uri);
	}
	
	protected void serializeLayout(ExportConfig exportConfig, StringBuilder sb, List<Object> appended) {
		sb.append("layout=<");
		if (exportConfig.layout == null) {
			sb.append("null");
		} else {
			exportConfig.layout.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAsync(ExportConfig exportConfig, StringBuilder sb) {
		sb.append("async=").append(exportConfig.async == null ? "null" : exportConfig.async);
	}
	
	protected void serializeErrorStrategy(ExportConfig exportConfig, StringBuilder sb) {
		sb.append("errorStrategy=").append(exportConfig.errorStrategy == null ? "null" : exportConfig.errorStrategy);
	}
}
