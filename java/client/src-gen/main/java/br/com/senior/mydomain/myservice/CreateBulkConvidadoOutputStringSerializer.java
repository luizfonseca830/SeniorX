package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkConvidadoOutputStringSerializer {
    
	public static final CreateBulkConvidadoOutputStringSerializer INSTANCE = new CreateBulkConvidadoOutputStringSerializer();
    
    public void serialize(CreateBulkConvidadoOutput createBulkConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkConvidadoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkConvidadoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkConvidadoOutput);
		sb.append(']');
	}
	
}
