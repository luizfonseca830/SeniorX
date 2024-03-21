package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


/**
 * Represents an email notification payload
 */
public class EmailNotifyUserEventPayload extends NotifyUserEventPayload {
    
    /**
     * Email sender address
     */
    @NotNull(message = "from is required")
    public String from;
    
    /**
     * Additional recipients to send the email to
     */
    public java.util.List<String> sendTo;
    
    /**
     * Email format
     */
    public EventEmailFormat format;
    
    
    public EmailNotifyUserEventPayload() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public EmailNotifyUserEventPayload(String notificationClass, String notificationOrigin, UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String link, String from, java.util.List<String> sendTo, EventEmailFormat format) {
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
        this.from = from;
        this.sendTo = sendTo;
        this.format = format;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public EmailNotifyUserEventPayload(UserNotificationKind notificationKind, UserNotificationPriority notificationPriority, String notificationSubject, String notificationContent, String sourceDomain, String sourceService, String destinationUser, String from) {
        this.notificationKind = notificationKind;
        this.notificationPriority = notificationPriority;
        this.notificationSubject = notificationSubject;
        this.notificationContent = notificationContent;
        this.sourceDomain = sourceDomain;
        this.sourceService = sourceService;
        this.destinationUser = destinationUser;
        this.from = from;
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
        if (from != null) {
            ret = 31 * ret + from.hashCode();
        }
        if (sendTo != null) {
            ret = 31 * ret + sendTo.hashCode();
        }
        if (format != null) {
            ret = 31 * ret + format.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailNotifyUserEventPayload)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        EmailNotifyUserEventPayload other = (EmailNotifyUserEventPayload) obj;
        if ((from == null) != (other.from == null)) {
            return false;
        }
        if ((from != null) && !from.equals(other.from)) {
            return false;
        }
        if ((sendTo == null) != (other.sendTo == null)) {
            return false;
        }
        if ((sendTo != null) && !sendTo.equals(other.sendTo)) {
            return false;
        }
        if ((format == null) != (other.format == null)) {
            return false;
        }
        if ((format != null) && !format.equals(other.format)) {
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
    	EmailNotifyUserEventPayloadStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
