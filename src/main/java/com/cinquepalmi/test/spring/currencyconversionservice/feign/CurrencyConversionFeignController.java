package com.cinquepalmi.test.spring.currencyconversionservice.feign;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cinquepalmi.test.spring.currencyconversionservice.dto.ConversionCurrencyBean;

@RestController
public class CurrencyConversionFeignController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionCurrencyBean calculateConversion(
			@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
		
		ConversionCurrencyBean bean = proxy.retrieveExchangeValue(from, to);
		bean.setQuantity(quantity);
		bean.setTotalAmountCalcolated(quantity.multiply(bean.getConversionMultiple()));
		return bean;
	}
}
