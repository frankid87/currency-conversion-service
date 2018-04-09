package com.cinquepalmi.test.spring.currencyconversionservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cinquepalmi.test.spring.currencyconversionservice.dto.CurrencyConversionBean;

@FeignClient(name="currecy-exchange-service", url="localhost:8000")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
