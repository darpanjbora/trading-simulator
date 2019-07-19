package com.tradingsimulator.FXTradingSimulator.jms.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.tradingsimulator.FXTradingSimulator.models.Trade;
import com.tradingsimulator.FXTradingSimulator.repositories.TradeRepository;

@Component
public class JmsConsumer {
			
		@Autowired
		private TradeRepository tradeRepository;
		
		@JmsListener(destination= "${activemq.queue.sell}", containerFactory="jsaFactory")
		public void receiveSell(Trade trade) {
			System.out.println("Received Message: "+ trade);
			tradeRepository.saveSell(trade);
		}
		
		@JmsListener(destination= "${activemq.queue.buy}", containerFactory="jsaFactory")
		public void receiveBuy(Trade trade) {
			System.out.println("Received Message: "+ trade);
			tradeRepository.saveBuy(trade);
		}
}
		
