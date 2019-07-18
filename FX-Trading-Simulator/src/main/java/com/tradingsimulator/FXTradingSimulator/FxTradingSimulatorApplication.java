package com.tradingsimulator.FXTradingSimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.tradingsimulator.FXTradingSimulator.models.Rate;
import com.tradingsimulator.FXTradingSimulator.models.Trade;

@SpringBootApplication
public class FxTradingSimulatorApplication {

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean 
	RedisTemplate<String, Trade> redisTemplate() {
		RedisTemplate<String, Trade> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FxTradingSimulatorApplication.class, args);
	}
}
