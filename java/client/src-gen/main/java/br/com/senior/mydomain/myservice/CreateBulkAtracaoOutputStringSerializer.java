package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkAtracaoOutputStringSerializer {
    
	public static final CreateBulkAtracaoOutputStringSerializer INSTANCE = new CreateBulkAtracaoOutputStringSerializer();
    
    public void serialize(CreateBulkAtracaoOutput createBulkAtracaoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkAtracaoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkAtracaoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkAtracaoOutput);
		sb.append(']');
	}
	
}
