package br.com.senior.mydomain.myservice;

import java.util.List;

public class ServiceStartedPayloadStringSerializer {
    
	public static final ServiceStartedPayloadStringSerializer INSTANCE = new ServiceStartedPayloadStringSerializer();
    
    public void serialize(ServiceStartedPayload serviceStartedPayload, StringBuilder sb, List<Object> appended) {
		sb.append(serviceStartedPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(serviceStartedPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(serviceStartedPayload);
		serializeDomain(serviceStartedPayload, sb);
		sb.append(", ");
		serializeService(serviceStartedPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDomain(ServiceStartedPayload serviceStartedPayload, StringBuilder sb) {
		sb.append("domain=").append(serviceStartedPayload.domain == null ? "null" : serviceStartedPayload.domain);
	}
	
	protected void serializeService(ServiceStartedPayload serviceStartedPayload, StringBuilder sb) {
		sb.append("service=").append(serviceStartedPayload.service == null ? "null" : serviceStartedPayload.service);
	}
}
