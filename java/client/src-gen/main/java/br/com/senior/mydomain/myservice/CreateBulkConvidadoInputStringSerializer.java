package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkConvidadoInputStringSerializer {
    
	public static final CreateBulkConvidadoInputStringSerializer INSTANCE = new CreateBulkConvidadoInputStringSerializer();
    
    public void serialize(CreateBulkConvidadoInput createBulkConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkConvidadoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkConvidadoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkConvidadoInput);
		serializeEntities(createBulkConvidadoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkConvidadoInput createBulkConvidadoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkConvidadoInput.entities == null ? "null" : createBulkConvidadoInput.entities);
	}
}
