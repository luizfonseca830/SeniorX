package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetMetadataOutputStringSerializer {
    
	public static final GetMetadataOutputStringSerializer INSTANCE = new GetMetadataOutputStringSerializer();
    
    public void serialize(GetMetadataOutput getMetadataOutput, StringBuilder sb, List<Object> appended) {
		sb.append(getMetadataOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getMetadataOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getMetadataOutput);
		serializeMetadata(getMetadataOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMetadata(GetMetadataOutput getMetadataOutput, StringBuilder sb) {
		sb.append("metadata=").append(getMetadataOutput.metadata == null ? "null" : getMetadataOutput.metadata);
	}
}
