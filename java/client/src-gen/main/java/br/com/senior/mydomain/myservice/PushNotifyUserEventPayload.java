package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


/**
 * Represents a push notification payload
 */
public class PushNotifyUserEventPayload extends NotifyUserEventPayload {
    
    /**
     * Apple/Google application id
     */
    @NotNull(message = "applicationId is required")
    public String applicationId;
    
    
    public PushNotifyUserEventPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public PushNotifyUserEventPayload(String notificationClass, String notificationOrigin, UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String link, String applicationId) {
        this.notificationClass = notificationClass;
        this.notificationOrigin = notificationOrigin;
        this.notificationKind = notificationKind;
        this.notificationPriority = notificationPriority;
        this.notificationSubject = notificationSubject;
        this.notificationContent = notificationContent;
        this.sourceDomain = sourceDomain;
        this.sourceService = sourceService;
        this.destinationUser = destinationUser;
        this.link = link;
        this.applicationId = applicationId;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public PushNotifyUserEventPayload(UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String applicationId) {
        this.notificationKind = notificationKind;
        this.notificationPriority = notificationPriority;
        this.notificationSubject = notificationSubject;
        this.notificationContent = notificationContent;
        this.sourceDomain = sourceDomain;
        this.sourceService = sourceService;
        this.destinationUser = destinationUser;
        this.applicationId = applicationId;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    public void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = super.hashCode();
        if (applicationId != null) {
            ret = 31 * ret + applicationId.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotifyUserEventPayload)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        PushNotifyUserEventPayload other = (PushNotifyUserEventPayload) obj;
        if ((applicationId == null) != (other.applicationId == null)) {
            return false;
        }
        if ((applicationId != null) && !applicationId.equals(other.applicationId)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	PushNotifyUserEventPayloadStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
