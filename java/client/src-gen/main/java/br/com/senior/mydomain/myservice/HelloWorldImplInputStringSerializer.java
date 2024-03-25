package br.com.senior.mydomain.myservice;

import java.util.List;

public class HelloWorldImplInputStringSerializer {
    
	public static final HelloWorldImplInputStringSerializer INSTANCE = new HelloWorldImplInputStringSerializer();
    
    public void serialize(HelloWorldImplInput helloWorldImplInput, StringBuilder sb, List<Object> appended) {
		sb.append(helloWorldImplInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(helloWorldImplInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(helloWorldImplInput);
		serializeWho(helloWorldImplInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeWho(HelloWorldImplInput helloWorldImplInput, StringBuilder sb) {
		sb.append("who=").append(helloWorldImplInput.who == null ? "null" : helloWorldImplInput.who);
	}
}
