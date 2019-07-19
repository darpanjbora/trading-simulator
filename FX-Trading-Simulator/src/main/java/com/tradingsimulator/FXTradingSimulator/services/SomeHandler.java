package com.tradingsimulator.FXTradingSimulator.services;

import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Service
public class SomeHandler implements ErrorHandler {

	@Override
	public void handleError(Throwable t) {
		// TODO Auto-generated method stub
		System.out.println("------Error in listener: "+ t);
	}

}
