package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindIngressoBynomeConvidadoOutputStringSerializer {
    
	public static final FindIngressoBynomeConvidadoOutputStringSerializer INSTANCE = new FindIngressoBynomeConvidadoOutputStringSerializer();
    
    public void serialize(FindIngressoBynomeConvidadoOutput findIngressoBynomeConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(findIngressoBynomeConvidadoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findIngressoBynomeConvidadoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findIngressoBynomeConvidadoOutput);
		serializeResultado(findIngressoBynomeConvidadoOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeResultado(FindIngressoBynomeConvidadoOutput findIngressoBynomeConvidadoOutput, StringBuilder sb, List<Object> appended) {
		sb.append("resultado=<");
		if (findIngressoBynomeConvidadoOutput.resultado == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = findIngressoBynomeConvidadoOutput.resultado.size() - 1;
			for (int i = 0; i <= last; i++) {
				findIngressoBynomeConvidadoOutput.resultado.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}
