package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HelloWorldImpl implements HelloWorld {

    @Override
    public HelloWorldOutput helloWorld(HelloWorldInput request) {
        HelloWorldOutput ret = new HelloWorldOutput();
        ret.helloWorldMessage = String.format("Hello World, %s!", request.who);
        return ret;
    }
}
