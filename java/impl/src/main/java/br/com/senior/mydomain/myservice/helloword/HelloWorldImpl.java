package br.com.senior.mydomain.myservice.helloword;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.HelloWorld;
import br.com.senior.mydomain.myservice.HelloWorldInput;
import br.com.senior.mydomain.myservice.HelloWorldOutput;

import javax.inject.Inject;

@HandlerImpl
public class HelloWorldImpl implements HelloWorld {
    @Inject
    private HelloWorldService helloWorldService;

    @Override
    public HelloWorldOutput helloWorld(HelloWorldInput request) {
        HelloWorldOutput ret = new HelloWorldOutput();
        ret.helloWorldMessage = helloWorldService.getHelloWorldMessage(request.who);
        return ret;
    }
}
