package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindBynomeOutputStringSerializer {
    
	public static final FindBynomeOutputStringSerializer INSTANCE = new FindBynomeOutputStringSerializer();
    
    public void serialize(FindBynomeOutput findBynomeOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findBynomeOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findBynomeOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findBynomeOutput);
		serializeResultado(findBynomeOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(FindBynomeOutput findBynomeOutput, StringBuilder sb, List<Object> appended) {
		sb.append("resultado=<");
		if (findBynomeOutput.resultado == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findBynomeOutput.resultado.size() - 1;
			for (int i = 0; i <= last; i++) {
				findBynomeOutput.resultado.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
