package com.tradingsimulator.FXTradingSimulator.repositories;

import java.util.Map;

import com.tradingsimulator.FXTradingSimulator.models.Rate;

public interface RateRepository {

	void save (Rate rate);
	Map<String, Rate> findAll();
	Rate findByBase(String base);
}
