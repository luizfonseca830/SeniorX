package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkEventoOutputStringSerializer {
    
	public static final CreateBulkEventoOutputStringSerializer INSTANCE = new CreateBulkEventoOutputStringSerializer();
    
    public void serialize(CreateBulkEventoOutput createBulkEventoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkEventoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkEventoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkEventoOutput);
		sb.append(']');
	}
	
}
