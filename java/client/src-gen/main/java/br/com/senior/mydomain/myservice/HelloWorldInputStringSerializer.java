package br.com.senior.mydomain.myservice;

import java.util.List;

public class HelloWorldInputStringSerializer {
    
	public static final HelloWorldInputStringSerializer INSTANCE = new HelloWorldInputStringSerializer();
    
    public void serialize(HelloWorldInput helloWorldInput, StringBuilder sb, List<Object> appended) {
		sb.append(helloWorldInput.getClass().getSimpleName()).append(" [");
		if (appended.contains(helloWorldInput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(helloWorldInput);
		serializeWho(helloWorldInput, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeWho(HelloWorldInput helloWorldInput, StringBuilder sb) {
		sb.append("who=").append(helloWorldInput.who == null ? "null" : helloWorldInput.who);
	}
}
