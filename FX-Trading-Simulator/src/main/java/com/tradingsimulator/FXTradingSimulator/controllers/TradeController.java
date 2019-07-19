package com.tradingsimulator.FXTradingSimulator.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradingsimulator.FXTradingSimulator.jms.producer.JmsProducer;
import com.tradingsimulator.FXTradingSimulator.models.Trade;
import com.tradingsimulator.FXTradingSimulator.repositories.TradeRepository;

@RestController
@RequestMapping("/trade")
public class TradeController {

	@Autowired
	JmsProducer jmsProducer;
	
	private TradeRepository tradeRepository;
	
	public TradeController(TradeRepository tradeRepository ) {
		this.tradeRepository = tradeRepository;
	}
	
	@PostMapping(value = "/add/sell")
	public Trade addSell(@RequestBody Trade trade) {
		jmsProducer.send_sell(trade);
		return trade;
	}
	
	@PostMapping(value = "/add/buy")
	public Trade addBuy(@RequestBody Trade trade) {
		jmsProducer.send_buy(trade);
		return trade;
	}
		
	@GetMapping("/findallsell")
	public Map<String, Trade> findAllSell(){
		return tradeRepository.findAllSell();
	}
	
	@GetMapping("/findallbuy")
	public Map<String, Trade> findAllBuy(){
		return tradeRepository.findAllBuy();
	}
	
	@GetMapping("/findOne/{type}/{id}")
	public Trade findOne(@PathVariable("type") String type,
						 @PathVariable("id") String id) {
		return tradeRepository.findOne(type, id);
	}
}
