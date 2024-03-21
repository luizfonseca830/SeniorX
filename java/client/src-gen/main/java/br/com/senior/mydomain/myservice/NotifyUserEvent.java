/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Default 'notifyUser' event.
 */
@SubscriptionDescription(domain="my_domain", service="my_service", event="notifyUserEvent")
public interface NotifyUserEvent extends MessageHandler {
    public void notifyUserEvent(NotifyUserEventPayload payload);
    
}
