package br.com.senior;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class ApplicationEventListenerImpl implements ApplicationEventListener {
	
	@TransactionalEventListener
	@Override
	public void performTransactionalEventListener(EventPayload event) {
		EventPublisher.publish(event.getEventName(), event.getPayload());
	}
}
