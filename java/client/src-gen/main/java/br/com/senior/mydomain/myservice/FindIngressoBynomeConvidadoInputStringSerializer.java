package br.com.senior.mydomain.myservice;

import java.util.List;

public class FindIngressoBynomeConvidadoInputStringSerializer {
    
	public static final FindIngressoBynomeConvidadoInputStringSerializer INSTANCE = new FindIngressoBynomeConvidadoInputStringSerializer();
    
    public void serialize(FindIngressoBynomeConvidadoInput findIngressoBynomeConvidadoInput, StringBuilder sb, List<Object> appended) {
		sb.append(findIngressoBynomeConvidadoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(findIngressoBynomeConvidadoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(findIngressoBynomeConvidadoInput);
		serializeNomeConvidado(findIngressoBynomeConvidadoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNomeConvidado(FindIngressoBynomeConvidadoInput findIngressoBynomeConvidadoInput, StringBuilder sb) {
		sb.append("nomeConvidado=").append(findIngressoBynomeConvidadoInput.nomeConvidado == null ? "null" : findIngressoBynomeConvidadoInput.nomeConvidado);
	}
}
