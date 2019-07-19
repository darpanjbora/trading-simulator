package com.tradingsimulator.FXTradingSimulator.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.tradingsimulator.FXTradingSimulator.models.Trade;

@Component
public class JmsProducer {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${activemq.queue.sell}")
	String queue_sell;
	
	@Value("${activemq.queue.buy}")
	String queue_buy;
	
	public void send_sell(Trade trade) {
		jmsTemplate.convertAndSend(queue_sell, trade);
	}
	
	public void send_buy(Trade trade) {
		jmsTemplate.convertAndSend(queue_buy, trade);
	}
}
