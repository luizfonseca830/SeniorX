package br.com.senior.mydomain.myservice;

import java.util.List;

public class ComprarIngressoOutputStringSerializer {
    
	public static final ComprarIngressoOutputStringSerializer INSTANCE = new ComprarIngressoOutputStringSerializer();
    
    public void serialize(ComprarIngressoOutput comprarIngressoOutput, StringBuilder sb, List<Object> appended) {
		sb.append(comprarIngressoOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(comprarIngressoOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(comprarIngressoOutput);
		serializeCodigoIngresso(comprarIngressoOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCodigoIngresso(ComprarIngressoOutput comprarIngressoOutput, StringBuilder sb) {
		sb.append("codigoIngresso=").append(comprarIngressoOutput.codigoIngresso == null ? "null" : comprarIngressoOutput.codigoIngresso);
	}
}
