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
	public void saveBuy(Trade trade) {
		// TODO Auto-generated method stub
		hashOperations.put("BUY", trade.getId(), trade);
	}
	@Override
	public void saveSell(Trade trade) {
		// TODO Auto-generated method stub
		hashOperations.put("SELL", trade.getId(), trade);
	}

	@Override
	public Map<String, Trade> findAllSell() {
		// TODO Auto-generated method stub
		return hashOperations.entries("SELL");
	}
	
	@Override
	public Map<String, Trade> findAllBuy() {
		// TODO Auto-generated method stub
		return hashOperations.entries("BUY");
	}

	@Override
	public Trade findOne(String type, String id) {
		// TODO Auto-generated method stub
		return (Trade)hashOperations.get(type, id);
	}

}
