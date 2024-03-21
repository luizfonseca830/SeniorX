package br.com.senior;

import br.com.senior.messaging.model.Server;
import br.com.senior.messaging.model.ServiceDescription;
import br.com.senior.mydomain.myservice.MyServiceConstants;

@ServiceDescription(domain=MyServiceConstants.DOMAIN, name=MyServiceConstants.SERVICE, packages={
	"br.com.senior.mydomain.myservice", "br.com.senior.custom.fieldcustomization.event.handler"})
public class HelloWorldServer extends Server {

	public static void main(String[] args) {
		bootstrap(new HelloWorldServer());
	}
}
