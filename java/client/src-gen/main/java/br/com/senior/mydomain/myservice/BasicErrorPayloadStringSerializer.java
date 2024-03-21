package br.com.senior.mydomain.myservice;

import java.util.List;

public class BasicErrorPayloadStringSerializer {
    
	public static final BasicErrorPayloadStringSerializer INSTANCE = new BasicErrorPayloadStringSerializer();
    
    public void serialize(BasicErrorPayload basicErrorPayload, StringBuilder sb, List<Object> appended) {
		sb.append(basicErrorPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(basicErrorPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(basicErrorPayload);
		serializeMessage(basicErrorPayload, sb);
		sb.append(", ");
		serializeErrorCode(basicErrorPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeMessage(BasicErrorPayload basicErrorPayload, StringBuilder sb) {
		sb.append("message=").append(basicErrorPayload.message == null ? "null" : basicErrorPayload.message);
	}
	
	protected void serializeErrorCode(BasicErrorPayload basicErrorPayload, StringBuilder sb) {
		sb.append("errorCode=").append(basicErrorPayload.errorCode == null ? "null" : basicErrorPayload.errorCode);
	}
}
