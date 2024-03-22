package br.com.senior.mydomain.myservice;

import java.util.List;

public class IngressoCompradoPayloadStringSerializer {
    
	public static final IngressoCompradoPayloadStringSerializer INSTANCE = new IngressoCompradoPayloadStringSerializer();
    
    public void serialize(IngressoCompradoPayload ingressoCompradoPayload, StringBuilder sb, List<Object> appended) {
		sb.append(ingressoCompradoPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(ingressoCompradoPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(ingressoCompradoPayload);
		serializeCodigoIngresso(ingressoCompradoPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCodigoIngresso(IngressoCompradoPayload ingressoCompradoPayload, StringBuilder sb) {
		sb.append("codigoIngresso=").append(ingressoCompradoPayload.codigoIngresso == null ? "null" : ingressoCompradoPayload.codigoIngresso);
	}
}
