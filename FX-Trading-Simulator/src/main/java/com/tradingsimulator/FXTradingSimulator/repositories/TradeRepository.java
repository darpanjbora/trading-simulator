package com.tradingsimulator.FXTradingSimulator.repositories;

import java.util.Map;

import com.tradingsimulator.FXTradingSimulator.models.Trade;

public interface TradeRepository {

	void saveBuy(Trade trade);
	void saveSell(Trade trade);
	Map<String, Trade> findAllSell();
	Map<String, Trade> findAllBuy();
	Trade findOne(String type, String id);
}
