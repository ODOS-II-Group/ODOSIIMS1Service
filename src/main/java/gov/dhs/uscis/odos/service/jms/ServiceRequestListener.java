package gov.dhs.uscis.odos.service.jms;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;

@Named
public class ServiceRequestListener {
	
	private final Logger log = LoggerFactory.getLogger(ServiceRequestListener.class);
	
	@JmsListener(destination = "${activemq.queue.request}")
	public void handleRequest(String message) {
		
		log.info("message received" + message);
		
	}

}
