package com.tradingsimulator.FXTradingSimulator.models;

public class Rate{

	private String date;
	
	private Rates rates;

    private String base;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public Rates getRates ()
    {
        return rates;
    }

    public void setRates (Rates rates)
    {
        this.rates = rates;
    }

    public String getBase ()
    {
        return base;
    }

    public void setBase (String base)
    {
        this.base = base;
    }
}
