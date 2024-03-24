package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkAtracaoInputStringSerializer {
    
	public static final CreateBulkAtracaoInputStringSerializer INSTANCE = new CreateBulkAtracaoInputStringSerializer();
    
    public void serialize(CreateBulkAtracaoInput createBulkAtracaoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkAtracaoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkAtracaoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkAtracaoInput);
		serializeEntities(createBulkAtracaoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkAtracaoInput createBulkAtracaoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkAtracaoInput.entities == null ? "null" : createBulkAtracaoInput.entities);
	}
}
