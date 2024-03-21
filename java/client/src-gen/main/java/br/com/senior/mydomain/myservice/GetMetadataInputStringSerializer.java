package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetMetadataInputStringSerializer {
    
	public static final GetMetadataInputStringSerializer INSTANCE = new GetMetadataInputStringSerializer();
    
    public void serialize(GetMetadataInput getMetadataInput, StringBuilder sb, List<Object> appended) {
		sb.append(getMetadataInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getMetadataInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getMetadataInput);
		serializeMetadataFormat(getMetadataInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMetadataFormat(GetMetadataInput getMetadataInput, StringBuilder sb) {
		sb.append("metadataFormat=").append(getMetadataInput.metadataFormat == null ? "null" : getMetadataInput.metadataFormat);
	}
}
