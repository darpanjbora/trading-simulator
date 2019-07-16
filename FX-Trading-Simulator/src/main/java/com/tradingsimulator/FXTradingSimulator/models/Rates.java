package com.tradingsimulator.FXTradingSimulator.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
	
	@JsonProperty("HRK")
	private String HRK;

	@JsonProperty("CHF")
    private String CHF;

	@JsonProperty("MXN")
    private String MXN;
	
	@JsonProperty("ZAR")
    private String ZAR;

	@JsonProperty("INR")
    private String INR;

	@JsonProperty("THB")
    private String THB;

	@JsonProperty("CNY")
    private String CNY;

	@JsonProperty("AUD")
    private String AUD;
	
	@JsonProperty("ILS")
    private String ILS;
	
	@JsonProperty("KRW")
    private String KRW;
	
	@JsonProperty("JPY")
    private String JPY;
	
	@JsonProperty("PLN")
    private String PLN;

	@JsonProperty("GBP")
    private String GBP;
	
	@JsonProperty("IDR")
    private String IDR;
	
	@JsonProperty("HUF")
    private String HUF;
	
	@JsonProperty("PHP")
    private String PHP;
	
	@JsonProperty("TRY")
    private String TRY;
	
	@JsonProperty("RUB")
    private String RUB;
	
	@JsonProperty("HKD")
    private String HKD;
	
	@JsonProperty("ISK")
    private String ISK;
	
	@JsonProperty("DKK")
    private String DKK;
	
	@JsonProperty("CAD")
    private String CAD;

	@JsonProperty("USD")
    private String USD;
	
	@JsonProperty("MYR")
    private String MYR;
	
	@JsonProperty("BGN")
    private String BGN;
	
	@JsonProperty("NOK")
    private String NOK;
	
	@JsonProperty("RON")
    private String RON;
	
	@JsonProperty("SGD")
    private String SGD;
	
	@JsonProperty("CZK")
    private String CZK;
	
	@JsonProperty("SEK")
    private String SEK;
	
	@JsonProperty("NZD")
    private String NZD;
	
	@JsonProperty("BRL")
    private String BRL;

    public String getHRK ()
    {
        return HRK;
    }

    public void setHRK (String HRK)
    {
        this.HRK = HRK;
    }

    public String getCHF ()
    {
        return CHF;
    }

    public void setCHF (String CHF)
    {
        this.CHF = CHF;
    }

    public String getMXN ()
    {
        return MXN;
    }

    public void setMXN (String MXN)
    {
        this.MXN = MXN;
    }

    public String getZAR ()
    {
        return ZAR;
    }

    public void setZAR (String ZAR)
    {
        this.ZAR = ZAR;
    }

    public String getINR ()
    {
        return INR;
    }

    public void setINR (String INR)
    {
        this.INR = INR;
    }

    public String getTHB ()
    {
        return THB;
    }

    public void setTHB (String THB)
    {
        this.THB = THB;
    }

    public String getCNY ()
    {
        return CNY;
    }

    public void setCNY (String CNY)
    {
        this.CNY = CNY;
    }

    public String getAUD ()
    {
        return AUD;
    }

    public void setAUD (String AUD)
    {
        this.AUD = AUD;
    }

    public String getILS ()
    {
        return ILS;
    }

    public void setILS (String ILS)
    {
        this.ILS = ILS;
    }

    public String getKRW ()
    {
        return KRW;
    }

    public void setKRW (String KRW)
    {
        this.KRW = KRW;
    }

    public String getJPY ()
    {
        return JPY;
    }

    public void setJPY (String JPY)
    {
        this.JPY = JPY;
    }

    public String getPLN ()
    {
        return PLN;
    }

    public void setPLN (String PLN)
    {
        this.PLN = PLN;
    }

    public String getGBP ()
    {
        return GBP;
    }

    public void setGBP (String GBP)
    {
        this.GBP = GBP;
    }

    public String getIDR ()
    {
        return IDR;
    }

    public void setIDR (String IDR)
    {
        this.IDR = IDR;
    }

    public String getHUF ()
    {
        return HUF;
    }

    public void setHUF (String HUF)
    {
        this.HUF = HUF;
    }

    public String getPHP ()
    {
        return PHP;
    }

    public void setPHP (String PHP)
    {
        this.PHP = PHP;
    }

    public String getTRY ()
    {
        return TRY;
    }

    public void setTRY (String TRY)
    {
        this.TRY = TRY;
    }

    public String getRUB ()
    {
        return RUB;
    }

    public void setRUB (String RUB)
    {
        this.RUB = RUB;
    }

    public String getHKD ()
    {
        return HKD;
    }

    public void setHKD (String HKD)
    {
        this.HKD = HKD;
    }

    public String getISK ()
    {
        return ISK;
    }

    public void setISK (String ISK)
    {
        this.ISK = ISK;
    }

    public String getDKK ()
    {
        return DKK;
    }

    public void setDKK (String DKK)
    {
        this.DKK = DKK;
    }

    public String getCAD ()
    {
        return CAD;
    }

    public void setCAD (String CAD)
    {
        this.CAD = CAD;
    }

    public String getUSD ()
    {
        return USD;
    }

    public void setUSD (String USD)
    {
        this.USD = USD;
    }

    public String getMYR ()
    {
        return MYR;
    }

    public void setMYR (String MYR)
    {
        this.MYR = MYR;
    }

    public String getBGN ()
    {
        return BGN;
    }

    public void setBGN (String BGN)
    {
        this.BGN = BGN;
    }

    public String getNOK ()
    {
        return NOK;
    }

    public void setNOK (String NOK)
    {
        this.NOK = NOK;
    }

    public String getRON ()
    {
        return RON;
    }

    public void setRON (String RON)
    {
        this.RON = RON;
    }

    public String getSGD ()
    {
        return SGD;
    }

    public void setSGD (String SGD)
    {
        this.SGD = SGD;
    }

    public String getCZK ()
    {
        return CZK;
    }

    public void setCZK (String CZK)
    {
        this.CZK = CZK;
    }

    public String getSEK ()
    {
        return SEK;
    }

    public void setSEK (String SEK)
    {
        this.SEK = SEK;
    }

    public String getNZD ()
    {
        return NZD;
    }

    public void setNZD (String NZD)
    {
        this.NZD = NZD;
    }

    public String getBRL ()
    {
        return BRL;
    }

    public void setBRL (String BRL)
    {
        this.BRL = BRL;
    }
}
