package com.tradingsimulator.FXTradingSimulator.repositories;

import java.util.Map;

import com.tradingsimulator.FXTradingSimulator.models.Trade;

public interface TradeRepository {

	void save(Trade trade);
	Map<String, Trade> findAll();
	Trade findByType(String flag);
}
