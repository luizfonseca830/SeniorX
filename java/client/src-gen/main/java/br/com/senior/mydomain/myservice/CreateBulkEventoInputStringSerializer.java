package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkEventoInputStringSerializer {
    
	public static final CreateBulkEventoInputStringSerializer INSTANCE = new CreateBulkEventoInputStringSerializer();
    
    public void serialize(CreateBulkEventoInput createBulkEventoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkEventoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkEventoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkEventoInput);
		serializeEntities(createBulkEventoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkEventoInput createBulkEventoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkEventoInput.entities == null ? "null" : createBulkEventoInput.entities);
	}
}
