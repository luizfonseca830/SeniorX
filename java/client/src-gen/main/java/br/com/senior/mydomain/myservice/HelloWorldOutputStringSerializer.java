package br.com.senior.mydomain.myservice;

import java.util.List;

public class HelloWorldOutputStringSerializer {
    
	public static final HelloWorldOutputStringSerializer INSTANCE = new HelloWorldOutputStringSerializer();
    
    public void serialize(HelloWorldOutput helloWorldOutput, StringBuilder sb, List<Object> appended) {
		sb.append(helloWorldOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(helloWorldOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(helloWorldOutput);
		serializeHelloWorldMessage(helloWorldOutput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeHelloWorldMessage(HelloWorldOutput helloWorldOutput, StringBuilder sb) {
		sb.append("helloWorldMessage=").append(helloWorldOutput.helloWorldMessage == null ? "null" : helloWorldOutput.helloWorldMessage);
	}
}
