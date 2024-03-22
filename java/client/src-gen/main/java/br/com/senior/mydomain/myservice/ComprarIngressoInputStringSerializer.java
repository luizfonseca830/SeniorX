package br.com.senior.mydomain.myservice;

import java.util.List;

public class ComprarIngressoInputStringSerializer {
    
	public static final ComprarIngressoInputStringSerializer INSTANCE = new ComprarIngressoInputStringSerializer();
    
    public void serialize(ComprarIngressoInput comprarIngressoInput, StringBuilder sb, List<Object> appended) {
		sb.append(comprarIngressoInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(comprarIngressoInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(comprarIngressoInput);
		serializeNomeComprador(comprarIngressoInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNomeComprador(ComprarIngressoInput comprarIngressoInput, StringBuilder sb) {
		sb.append("nomeComprador=").append(comprarIngressoInput.nomeComprador == null ? "null" : comprarIngressoInput.nomeComprador);
	}
}
