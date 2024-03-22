package br.com.senior.mydomain.myservice;

import java.util.List;

public class PagamentoEstornadoPayloadStringSerializer {
    
	public static final PagamentoEstornadoPayloadStringSerializer INSTANCE = new PagamentoEstornadoPayloadStringSerializer();
    
    public void serialize(PagamentoEstornadoPayload pagamentoEstornadoPayload, StringBuilder sb, List<Object> appended) {
		sb.append(pagamentoEstornadoPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(pagamentoEstornadoPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(pagamentoEstornadoPayload);
		serializeCodigoIngresso(pagamentoEstornadoPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeCodigoIngresso(PagamentoEstornadoPayload pagamentoEstornadoPayload, StringBuilder sb) {
		sb.append("codigoIngresso=").append(pagamentoEstornadoPayload.codigoIngresso == null ? "null" : pagamentoEstornadoPayload.codigoIngresso);
	}
}
