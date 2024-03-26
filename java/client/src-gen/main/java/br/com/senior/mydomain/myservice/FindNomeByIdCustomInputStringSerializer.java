package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindNomeByIdCustomInputStringSerializer {
    
	public static final FindNomeByIdCustomInputStringSerializer INSTANCE = new FindNomeByIdCustomInputStringSerializer();
    
    public void serialize(FindNomeByIdCustomInput findNomeByIdCustomInput, StringBuilder sb, List<Object> appended) {
		sb.append(findNomeByIdCustomInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findNomeByIdCustomInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findNomeByIdCustomInput);
		serializeId(findNomeByIdCustomInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(FindNomeByIdCustomInput findNomeByIdCustomInput, StringBuilder sb) {
		sb.append("id=").append(findNomeByIdCustomInput.id == null ? "null" : findNomeByIdCustomInput.id);
	}
}
