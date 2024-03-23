/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="my_domain", service="my_service", event="importEventoEvent")
public interface ImportEventoEvent extends MessageHandler {
    public void importEventoEvent(ImportEventoEventPayload payload);
    
}
