package br.com.senior.mydomain.myservice;

import java.util.List;

public class HelloWorldImplOutputStringSerializer {
    
	public static final HelloWorldImplOutputStringSerializer INSTANCE = new HelloWorldImplOutputStringSerializer();
    
    public void serialize(HelloWorldImplOutput helloWorldImplOutput, StringBuilder sb, List<Object> appended) {
		sb.append(helloWorldImplOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(helloWorldImplOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(helloWorldImplOutput);
		serializeHelloWorldMessage(helloWorldImplOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeHelloWorldMessage(HelloWorldImplOutput helloWorldImplOutput, StringBuilder sb) {
		sb.append("helloWorldMessage=").append(helloWorldImplOutput.helloWorldMessage == null ? "null" : helloWorldImplOutput.helloWorldMessage);
	}
}
