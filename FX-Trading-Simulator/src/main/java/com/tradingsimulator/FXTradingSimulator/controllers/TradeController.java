package com.tradingsimulator.FXTradingSimulator.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradingsimulator.FXTradingSimulator.models.Trade;
import com.tradingsimulator.FXTradingSimulator.repositories.TradeRepository;

@RestController
@RequestMapping("/trade")
public class TradeController {

	private TradeRepository tradeRepository;
	
	public TradeController(TradeRepository tradeRepository ) {
		this.tradeRepository = tradeRepository;
	}
	
	@GetMapping("/add/buy/{BaseCurr}/{TradeCurr}/{Quantity}/{Price}/{flag}")
	public Trade addbuy(@PathVariable("BaseCurr") String BaseCurr,
					@PathVariable("TradeCurr") String TradeCurr,
					@PathVariable("Quantity") String quantity,
					@PathVariable("Price") String Price,
					@PathVariable("flag") String id) {
		
		tradeRepository.saveBuy(new Trade(BaseCurr, TradeCurr, quantity, Price, id));
		
		return tradeRepository.findOne("BUY", id);
	}
	
	@GetMapping("/add/sell/{BaseCurr}/{TradeCurr}/{Quantity}/{Price}/{flag}")
	public Trade addsell(@PathVariable("BaseCurr") String BaseCurr,
					@PathVariable("TradeCurr") String TradeCurr,
					@PathVariable("Quantity") String quantity,
					@PathVariable("Price") String Price,
					@PathVariable("flag") String id) {
		
		tradeRepository.saveSell(new Trade(BaseCurr, TradeCurr, quantity, Price, id));
		
		return tradeRepository.findOne("SELL", id);
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
