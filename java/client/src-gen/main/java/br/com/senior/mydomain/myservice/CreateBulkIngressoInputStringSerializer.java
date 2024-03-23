package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkIngressoInputStringSerializer {
    
	public static final CreateBulkIngressoInputStringSerializer INSTANCE = new CreateBulkIngressoInputStringSerializer();
    
    public void serialize(CreateBulkIngressoInput createBulkIngressoInput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkIngressoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkIngressoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkIngressoInput);
		serializeEntities(createBulkIngressoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeEntities(CreateBulkIngressoInput createBulkIngressoInput, StringBuilder sb) {
		sb.append("entities=").append(createBulkIngressoInput.entities == null ? "null" : createBulkIngressoInput.entities);
	}
}
