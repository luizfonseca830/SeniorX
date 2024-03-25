package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindBynomeInputStringSerializer {
    
	public static final FindBynomeInputStringSerializer INSTANCE = new FindBynomeInputStringSerializer();
    
    public void serialize(FindBynomeInput findBynomeInput, StringBuilder sb, List<Object> appended) {
		sb.append(findBynomeInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findBynomeInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findBynomeInput);
		serializeNome(findBynomeInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(FindBynomeInput findBynomeInput, StringBuilder sb) {
		sb.append("nome=").append(findBynomeInput.nome == null ? "null" : findBynomeInput.nome);
	}
}
