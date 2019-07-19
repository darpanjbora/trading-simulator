package com.tradingsimulator.FXTradingSimulator.config;

import java.util.Arrays;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import com.tradingsimulator.FXTradingSimulator.services.SomeHandler;


@Configuration
public class ActiveMqConnectionFactoryConfig {

	@Value("${activemq.broker.url}")
	private String brokerURL;
	
	@Value("${activemq.broker.username}")
	private String userName;
	
	@Value("${activemq.broker.password}")
	private String password;
	
	/**
	 * Basic ActiveMQ configuration
	 * */
	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setTrustedPackages(Arrays.asList("com.tradingsimulator.FXTradingSimulator"));
		connectionFactory.setBrokerURL(brokerURL);
		connectionFactory.setUserName(userName);
		connectionFactory.setPassword(password);
		return connectionFactory;
	}
	
	/**
	 * Serialize message content to JSON using TextMessage
	 * */
	@Bean
	public MessageConverter jacksonJmsMessageConverter() {
		MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
		converter.setTargetType(MessageType.TEXT);
		converter.setTypeIdPropertyName("_type");
		return converter;
	}
	
	/**
	 * For Receiving Messages
	 * */
	@Bean
	public JmsListenerContainerFactory<?> jsaFactory(ConnectionFactory connectionFactory,DefaultJmsListenerContainerFactoryConfigurer configurer, SomeHandler errorHandler){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setMessageConverter(jacksonJmsMessageConverter());
		factory.setErrorHandler(errorHandler);
		configurer.configure(factory, connectionFactory);
		return factory;
	}
	
	/**
	 * For Sending Messages
	 * */
	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate template = new JmsTemplate();
		template.setMessageConverter(jacksonJmsMessageConverter());
		template.setConnectionFactory(connectionFactory());
		return template;
	}
}
