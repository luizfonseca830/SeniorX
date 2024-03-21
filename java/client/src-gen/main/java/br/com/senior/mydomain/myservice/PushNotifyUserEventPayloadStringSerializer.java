package br.com.senior.mydomain.myservice;

import java.util.List;

public class PushNotifyUserEventPayloadStringSerializer {
    
	public static final PushNotifyUserEventPayloadStringSerializer INSTANCE = new PushNotifyUserEventPayloadStringSerializer();
    
    public void serialize(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(pushNotifyUserEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(pushNotifyUserEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(pushNotifyUserEventPayload);
		serializeNotificationClass(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationOrigin(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationKind(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationPriority(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationSubject(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationContent(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeSourceDomain(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeSourceService(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeDestinationUser(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeLink(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeApplicationId(pushNotifyUserEventPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNotificationClass(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationClass=").append(pushNotifyUserEventPayload.notificationClass == null ? "null" : pushNotifyUserEventPayload.notificationClass);
	}
	
	protected void serializeNotificationOrigin(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationOrigin=").append(pushNotifyUserEventPayload.notificationOrigin == null ? "null" : pushNotifyUserEventPayload.notificationOrigin);
	}
	
	protected void serializeNotificationKind(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationKind=").append(pushNotifyUserEventPayload.notificationKind == null ? "null" : pushNotifyUserEventPayload.notificationKind);
	}
	
	protected void serializeNotificationPriority(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationPriority=").append(pushNotifyUserEventPayload.notificationPriority == null ? "null" : pushNotifyUserEventPayload.notificationPriority);
	}
	
	protected void serializeNotificationSubject(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationSubject=").append(pushNotifyUserEventPayload.notificationSubject == null ? "null" : pushNotifyUserEventPayload.notificationSubject);
	}
	
	protected void serializeNotificationContent(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationContent=").append(pushNotifyUserEventPayload.notificationContent == null ? "null" : pushNotifyUserEventPayload.notificationContent);
	}
	
	protected void serializeSourceDomain(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("sourceDomain=").append(pushNotifyUserEventPayload.sourceDomain == null ? "null" : pushNotifyUserEventPayload.sourceDomain);
	}
	
	protected void serializeSourceService(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("sourceService=").append(pushNotifyUserEventPayload.sourceService == null ? "null" : pushNotifyUserEventPayload.sourceService);
	}
	
	protected void serializeDestinationUser(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("destinationUser=").append(pushNotifyUserEventPayload.destinationUser == null ? "null" : pushNotifyUserEventPayload.destinationUser);
	}
	
	protected void serializeLink(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("link=").append(pushNotifyUserEventPayload.link == null ? "null" : pushNotifyUserEventPayload.link);
	}
	
	protected void serializeApplicationId(PushNotifyUserEventPayload pushNotifyUserEventPayload, StringBuilder sb) {
		sb.append("applicationId=").append(pushNotifyUserEventPayload.applicationId == null ? "null" : pushNotifyUserEventPayload.applicationId);
	}
}
