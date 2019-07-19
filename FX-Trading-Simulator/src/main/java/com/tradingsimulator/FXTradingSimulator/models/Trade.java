package com.tradingsimulator.FXTradingSimulator.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Trade implements Serializable{
	
	String BaseCurr;
	String TradeCurr;
	String Quantity;
	String Price;
	String id;
	
	public Trade() {
		
	}
	
	public Trade(String baseCurr, String tradeCurr, String quantity, String price, String id) {
		super();
		BaseCurr = baseCurr;
		TradeCurr = tradeCurr;
		Quantity = quantity;
		Price = price;
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBaseCurr() {
		return BaseCurr;
	}
	public void setBaseCurr(String baseCurr) {
		BaseCurr = baseCurr;
	}
	public String getTradeCurr() {
		return TradeCurr;
	}
	public void setTradeCurr(String tradeCurr) {
		TradeCurr = tradeCurr;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	
}
