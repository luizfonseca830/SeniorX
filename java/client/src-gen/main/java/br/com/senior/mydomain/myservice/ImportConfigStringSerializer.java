package br.com.senior.mydomain.myservice;

import java.util.List;

public class ImportConfigStringSerializer {
    
	public static final ImportConfigStringSerializer INSTANCE = new ImportConfigStringSerializer();
    
    public void serialize(ImportConfig importConfig, StringBuilder sb, List<Object> appended) {
		sb.append(importConfig.getClass().getSimpleName()).append(" [");
		if (appended.contains(importConfig)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(importConfig);
		serializeUri(importConfig, sb);
		sb.append(", ");
		serializeLayout(importConfig, sb, appended);
		sb.append(", ");
		serializeAsync(importConfig, sb);
		sb.append(", ");
		serializeBatchSize(importConfig, sb);
		sb.append(", ");
		serializeErrorStrategy(importConfig, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeUri(ImportConfig importConfig, StringBuilder sb) {
		sb.append("uri=").append(importConfig.uri == null ? "null" : importConfig.uri);
	}
	
	protected void serializeLayout(ImportConfig importConfig, StringBuilder sb, List<Object> appended) {
		sb.append("layout=<");
		if (importConfig.layout == null) {
			sb.append("null");
		} else {
			importConfig.layout.toString(sb, appended);
		}
		sb.append('>');
	}
	
	protected void serializeAsync(ImportConfig importConfig, StringBuilder sb) {
		sb.append("async=").append(importConfig.async == null ? "null" : importConfig.async);
	}
	
	protected void serializeBatchSize(ImportConfig importConfig, StringBuilder sb) {
		sb.append("batchSize=").append(importConfig.batchSize == null ? "null" : importConfig.batchSize);
	}
	
	protected void serializeErrorStrategy(ImportConfig importConfig, StringBuilder sb) {
		sb.append("errorStrategy=").append(importConfig.errorStrategy == null ? "null" : importConfig.errorStrategy);
	}
}
