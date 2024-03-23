package br.com.senior.mydomain.myservice;

import java.util.List;

public class CreateBulkIngressoOutputStringSerializer {
    
	public static final CreateBulkIngressoOutputStringSerializer INSTANCE = new CreateBulkIngressoOutputStringSerializer();
    
    public void serialize(CreateBulkIngressoOutput createBulkIngressoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(createBulkIngressoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(createBulkIngressoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(createBulkIngressoOutput);
		sb.append(']');
	}
	
}
