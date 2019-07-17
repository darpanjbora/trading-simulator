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
	
	@GetMapping("/add/{BaseCurr}/{TradeCurr}/{Quantity}/{Price}/{flag}")
	public Trade add(@PathVariable("BaseCurr") String BaseCurr,
					@PathVariable("TradeCurr") String TradeCurr,
					@PathVariable("Quantity") String quantity,
					@PathVariable("Price") String Price,
					@PathVariable("flag") String flag) {
		
		tradeRepository.save(new Trade(BaseCurr, TradeCurr, quantity, Price, flag));
		
		return tradeRepository.findByType(flag);
	}
	
	@GetMapping("/findall")
	public Map<String, Trade> findAll(){
		return tradeRepository.findAll();
	}
	
	@GetMapping("/findbytype/{flag}")
	public Trade findByType(@PathVariable("flag") String flag) {
		return tradeRepository.findByType(flag);
	}
}
