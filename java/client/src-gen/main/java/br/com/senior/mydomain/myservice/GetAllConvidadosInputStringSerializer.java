package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetAllConvidadosInputStringSerializer {
    
	public static final GetAllConvidadosInputStringSerializer INSTANCE = new GetAllConvidadosInputStringSerializer();
    
    public void serialize(GetAllConvidadosInput getAllConvidadosInput, StringBuilder sb, List<Object> appended) {
		sb.append(getAllConvidadosInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getAllConvidadosInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getAllConvidadosInput);
		sb.append(']');
	}
	
}
