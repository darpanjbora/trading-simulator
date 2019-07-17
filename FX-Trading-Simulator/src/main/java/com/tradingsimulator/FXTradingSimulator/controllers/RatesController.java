//package com.tradingsimulator.FXTradingSimulator.controllers;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.tradingsimulator.FXTradingSimulator.models.Rate;
//import com.tradingsimulator.FXTradingSimulator.models.Rates;
//import com.tradingsimulator.FXTradingSimulator.repositories.RateRepository;
//
//@RestController
//public class RatesController {	
//	
//	private RateRepository rateRepository;
//	
//	public RatesController(RateRepository rateRepository ) {
//		this.rateRepository = rateRepository;
//	}
//	
//	@RequestMapping("/add/{base}/{rates}/{date}")
//	public Rate add(@PathVariable("base") String base,
//					@PathVariable("date") String date,
//					@PathVariable("rates") Rates rates) {
////		rateRepository.save(new Rate(date, rates, base ));
//		
//		return rateRepository.findByBase(base);
//	}
//	
//	@RequestMapping("/findAllRates")
//		public Map<String, Rate> findAll(){
//			return rateRepository.findAll();
//		}
//	
//	@RequestMapping("/rates/{base}")
//	public Rate getRates(@PathVariable String base) {
//		
//		final String url = "https://api.exchangeratesapi.io/latest?base="+base;
//		RestTemplate restTemplate = new RestTemplate();
//		
//		Rate rate = restTemplate.getForObject(url, Rate.class); 
//		
//		rateRepository.save(rate);
////		
////		System.out.println(rate.getBase());
////		System.out.println(rate.getRates());
//		
//	    return rateRepository.findByBase(base);
//	}
//		
//		
//	@RequestMapping("/historicalrates/{base}")
//	public String getHistoricalRates(@PathVariable String base) {
//		
////		Create Date Object
//		Date today = Calendar.getInstance().getTime();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		
////		To get the one month old date
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.MONTH, -1);
//		Date oneMonthOld = cal.getTime();
//			
////		Date Formatter to format it for the API
//		String todayDate = formatter.format(today);
//		String oneMonthOldDate = formatter.format(oneMonthOld);
//		
//		final String url = "https://api.exchangeratesapi.io/history?start_at="+oneMonthOldDate+"&end_at="+todayDate+"&base="+base;
//		
//		RestTemplate restTemplate = new RestTemplate();
//		String result = restTemplate.getForObject(url, String.class);
//		
//		return result;
//	}
//}
