package br.com.senior.mydomain.myservice;

import java.util.List;

public class EmailNotifyUserEventPayloadStringSerializer {
    
	public static final EmailNotifyUserEventPayloadStringSerializer INSTANCE = new EmailNotifyUserEventPayloadStringSerializer();
    
    public void serialize(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb, List<Object> appended) {
		sb.append(emailNotifyUserEventPayload.getClass().getSimpleName()).append(" [");
		if (appended.contains(emailNotifyUserEventPayload)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(emailNotifyUserEventPayload);
		serializeNotificationClass(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationOrigin(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationKind(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationPriority(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationSubject(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeNotificationContent(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeSourceDomain(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeSourceService(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeDestinationUser(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeLink(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeFrom(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeSendTo(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		serializeFormat(emailNotifyUserEventPayload, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeNotificationClass(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationClass=").append(emailNotifyUserEventPayload.notificationClass == null ? "null" : emailNotifyUserEventPayload.notificationClass);
	}
	
	protected void serializeNotificationOrigin(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationOrigin=").append(emailNotifyUserEventPayload.notificationOrigin == null ? "null" : emailNotifyUserEventPayload.notificationOrigin);
	}
	
	protected void serializeNotificationKind(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationKind=").append(emailNotifyUserEventPayload.notificationKind == null ? "null" : emailNotifyUserEventPayload.notificationKind);
	}
	
	protected void serializeNotificationPriority(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationPriority=").append(emailNotifyUserEventPayload.notificationPriority == null ? "null" : emailNotifyUserEventPayload.notificationPriority);
	}
	
	protected void serializeNotificationSubject(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationSubject=").append(emailNotifyUserEventPayload.notificationSubject == null ? "null" : emailNotifyUserEventPayload.notificationSubject);
	}
	
	protected void serializeNotificationContent(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("notificationContent=").append(emailNotifyUserEventPayload.notificationContent == null ? "null" : emailNotifyUserEventPayload.notificationContent);
	}
	
	protected void serializeSourceDomain(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("sourceDomain=").append(emailNotifyUserEventPayload.sourceDomain == null ? "null" : emailNotifyUserEventPayload.sourceDomain);
	}
	
	protected void serializeSourceService(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("sourceService=").append(emailNotifyUserEventPayload.sourceService == null ? "null" : emailNotifyUserEventPayload.sourceService);
	}
	
	protected void serializeDestinationUser(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("destinationUser=").append(emailNotifyUserEventPayload.destinationUser == null ? "null" : emailNotifyUserEventPayload.destinationUser);
	}
	
	protected void serializeLink(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("link=").append(emailNotifyUserEventPayload.link == null ? "null" : emailNotifyUserEventPayload.link);
	}
	
	protected void serializeFrom(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("from=").append(emailNotifyUserEventPayload.from == null ? "null" : emailNotifyUserEventPayload.from);
	}
	
	protected void serializeSendTo(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("sendTo=").append(emailNotifyUserEventPayload.sendTo == null ? "null" : emailNotifyUserEventPayload.sendTo);
	}
	
	protected void serializeFormat(EmailNotifyUserEventPayload emailNotifyUserEventPayload, StringBuilder sb) {
		sb.append("format=").append(emailNotifyUserEventPayload.format == null ? "null" : emailNotifyUserEventPayload.format);
	}
}
