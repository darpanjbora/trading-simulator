package com.tradingsimulator.FXTradingSimulator.services;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.tradingsimulator.FXTradingSimulator.models.Trade;
import com.tradingsimulator.FXTradingSimulator.repositories.TradeRepository;

@Repository
public class TradeRepositoryImpl implements TradeRepository {

	private RedisTemplate<String, Trade> redisTemplate;
	
	private HashOperations hashOperations;
	
	public TradeRepositoryImpl(RedisTemplate<String, Trade> redisTemplate) {
		this.redisTemplate = redisTemplate;
		
		hashOperations = redisTemplate.opsForHash();
	}
	
	@Override
	public void save(Trade trade) {
		// TODO Auto-generated method stub
		hashOperations.put("TRADE", trade.getFlag(), trade);
	}

	@Override
	public Map<String, Trade> findAll() {
		// TODO Auto-generated method stub
		return hashOperations.entries("TRADE");
	}

	@Override
	public Trade findByType(String flag) {
		// TODO Auto-generated method stub
		return (Trade)hashOperations.get("TRADE", flag);
	}

}
