package com.cinquepalmi.test.spring.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cinquepalmi.test.spring.currencyconversionservice.dto.ConversionCurrencyBean;

@RestController
public class ConversionCurrencyController {

	@GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionCurrencyBean colculateConversion(
			@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		String url = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
		Map<String, String> urlVariables = new HashMap<>();
		urlVariables.put("from", from);
		urlVariables.put("to", to);
		
		ConversionCurrencyBean conversionCurrencyBean = new RestTemplate().getForEntity(url, ConversionCurrencyBean.class, urlVariables).getBody();
		conversionCurrencyBean.setQuantity(quantity);
		conversionCurrencyBean.setTotalAmountCalcolated(quantity.multiply(conversionCurrencyBean.getConversionMultiple()));
		return conversionCurrencyBean;
	}
	
}
