package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindNomeByIdCustomOutputStringSerializer {
    
	public static final FindNomeByIdCustomOutputStringSerializer INSTANCE = new FindNomeByIdCustomOutputStringSerializer();
    
    public void serialize(FindNomeByIdCustomOutput findNomeByIdCustomOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findNomeByIdCustomOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findNomeByIdCustomOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findNomeByIdCustomOutput);
		serializeNome(findNomeByIdCustomOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNome(FindNomeByIdCustomOutput findNomeByIdCustomOutput, StringBuilder sb) {
		sb.append("nome=").append(findNomeByIdCustomOutput.nome == null ? "null" : findNomeByIdCustomOutput.nome);
	}
}
