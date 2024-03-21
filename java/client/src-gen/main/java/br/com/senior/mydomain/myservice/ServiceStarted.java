/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

/**
 * Default 'serviceStarted' event.
 */
@SubscriptionDescription(domain="my_domain", service="my_service", event="serviceStarted")
public interface ServiceStarted extends MessageHandler {
    public void serviceStarted(ServiceStartedPayload payload);
    
}
