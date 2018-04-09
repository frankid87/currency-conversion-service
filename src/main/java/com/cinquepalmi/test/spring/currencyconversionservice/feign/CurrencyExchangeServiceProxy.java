package com.cinquepalmi.test.spring.currencyconversionservice.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cinquepalmi.test.spring.currencyconversionservice.dto.ConversionCurrencyBean;

@FeignClient(name="currecy-exchange-service") // 
//@FeignClient(name="currecy-exchange-service", url="localhost:8000") senza ribbon bisonga specificare url
@RibbonClient(name="currecy-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ConversionCurrencyBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
