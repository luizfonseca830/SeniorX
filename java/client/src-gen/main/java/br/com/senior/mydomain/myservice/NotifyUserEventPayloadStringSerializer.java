package br.com.senior.mydomain.myservice;

import java.util.List;

public class NotifyUserEventPayloadStringSerializer {
    
	public static final NotifyUserEventPayloadStringSerializer INSTANCE = new NotifyUserEventPayloadStringSerializer();
    
    public void serialize(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(notifyUserEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(notifyUserEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(notifyUserEventPayload);
		serializeNotificationClass(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationOrigin(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationKind(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationPriority(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationSubject(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationContent(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeSourceDomain(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeSourceService(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeDestinationUser(notifyUserEventPayload, sb);
		sb.append(", ");
		serializeLink(notifyUserEventPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNotificationClass(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationClass=").append(notifyUserEventPayload.notificationClass == null ? "null" : notifyUserEventPayload.notificationClass);
	}
	
	protected void serializeNotificationOrigin(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationOrigin=").append(notifyUserEventPayload.notificationOrigin == null ? "null" : notifyUserEventPayload.notificationOrigin);
	}
	
	protected void serializeNotificationKind(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationKind=").append(notifyUserEventPayload.notificationKind == null ? "null" : notifyUserEventPayload.notificationKind);
	}
	
	protected void serializeNotificationPriority(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationPriority=").append(notifyUserEventPayload.notificationPriority == null ? "null" : notifyUserEventPayload.notificationPriority);
	}
	
	protected void serializeNotificationSubject(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationSubject=").append(notifyUserEventPayload.notificationSubject == null ? "null" : notifyUserEventPayload.notificationSubject);
	}
	
	protected void serializeNotificationContent(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationContent=").append(notifyUserEventPayload.notificationContent == null ? "null" : notifyUserEventPayload.notificationContent);
	}
	
	protected void serializeSourceDomain(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("sourceDomain=").append(notifyUserEventPayload.sourceDomain == null ? "null" : notifyUserEventPayload.sourceDomain);
	}
	
	protected void serializeSourceService(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("sourceService=").append(notifyUserEventPayload.sourceService == null ? "null" : notifyUserEventPayload.sourceService);
	}
	
	protected void serializeDestinationUser(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("destinationUser=").append(notifyUserEventPayload.destinationUser == null ? "null" : notifyUserEventPayload.destinationUser);
	}
	
	protected void serializeLink(NotifyUserEventPayload notifyUserEventPayload, StringBuilder sb) {
		sb.append("link=").append(notifyUserEventPayload.link == null ? "null" : notifyUserEventPayload.link);
	}
}
