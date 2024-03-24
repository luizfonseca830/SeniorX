/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="my_domain", service="my_service", event="exportAtracaoEvent")
public interface ExportAtracaoEvent extends MessageHandler {
    public void exportAtracaoEvent(ExportAtracaoEventPayload payload);
    
}
