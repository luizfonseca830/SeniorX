package br.com.senior;

public class EventPayload {
	
	private String eventName;
	private Object payload;
	
	public EventPayload(String eventName, Object payload) {
		this.eventName = eventName;
		this.payload = payload;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
}
