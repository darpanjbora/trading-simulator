package com.tradingsimulator.FXTradingSimulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tradingsimulator.FXTradingSimulator.Cache.Cache;
import com.tradingsimulator.FXTradingSimulator.Cache.RedisCache;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class FxTradingSimulatorApplication {

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	public static void main(String[] args) {
		SpringApplication.run(FxTradingSimulatorApplication.class, args);
	}
	
//	@Bean
//	@Autowired
//	public Cache cacheObject(ObjectMapper objectMapper){
//        return new RedisCache(objectMapper, redisCliFactory());
//    }

}
