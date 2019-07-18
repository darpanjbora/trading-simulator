//package com.tradingsimulator.FXTradingSimulator.services;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.tradingsimulator.FXTradingSimulator.models.Rate;
//import com.tradingsimulator.FXTradingSimulator.repositories.RateRepository;
//
//@Repository
//public class RateRepositoryImpl implements RateRepository {
//
//	private RedisTemplate<String, Rate> redisTemplate;
//	
//	private HashOperations hashOperations;
//	
//	public RateRepositoryImpl(RedisTemplate<String, Rate> redisTemplate) {
//		this.redisTemplate = redisTemplate;
//		
//		hashOperations = redisTemplate.opsForHash();
//	}
//	
//	@Override
//	public void save(Rate rate) {
//		// TODO Auto-generated method stub
//		hashOperations.put("RATES", rate.getBase(), rate);
//	}
//
//	@Override
//	public Map<String, Rate> findAll() {
//		// TODO Auto-generated method stub
//		return hashOperations.entries("RATES");
//	}
//
//	@Override
//	public Rate findByBase(String base) {
//		// TODO Auto-generated method stub
//		return (Rate)hashOperations.get("RATES", base);
//	}
//
//}
