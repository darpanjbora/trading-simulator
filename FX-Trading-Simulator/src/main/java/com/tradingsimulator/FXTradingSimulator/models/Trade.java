package com.tradingsimulator.FXTradingSimulator.models;

import java.io.Serializable;


public class Trade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String BaseCurr;
	String TradeCurr;
	String Quantity;
	String Price;
	String flag; //1 for Buying and 0 for Selling
	
	public Trade(String baseCurr, String tradeCurr, String quantity, String price, String flag) {
		super();
		BaseCurr = baseCurr;
		TradeCurr = tradeCurr;
		Quantity = quantity;
		Price = price;
		this.flag = flag;
	}
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
