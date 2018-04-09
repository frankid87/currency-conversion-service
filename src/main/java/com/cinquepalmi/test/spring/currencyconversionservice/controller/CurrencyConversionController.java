package com.cinquepalmi.test.spring.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cinquepalmi.test.spring.currencyconversionservice.dto.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	
	private String url = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
	
	@GetMapping("currency-converter/from/{from}/to/{to}/quanity/{quantity}")
	public CurrencyConversionBean calculateConversion(
			@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
		
		Map<String, String> map = new HashMap<>();
		map.put("from", from);
		map.put("to", to);
		
		CurrencyConversionBean bean = new RestTemplate().getForEntity(url, CurrencyConversionBean.class, map).getBody();
		return bean;
	}
}
