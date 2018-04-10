package com.cinquepalmi.test.spring.currencyconversionservice.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cinquepalmi.test.spring.currencyconversionservice.dto.ConversionCurrencyBean;

/*
 * Feign
 * 
 * la property url specifica url microservizio con cui interagire
 */
//@FeignClient(name="currecy-exchange-service", url="localhost:8000")


/*
 * Ribbon e Feign
 * 
 * aggiungere nel file di properties currecy-exchange-service.ribbon.listOfServers che indica l'elenco delle istanze attive separate da ,
 */
//@FeignClient(name="currecy-exchange-service")
//@RibbonClient(name="currecy-exchange-service")

/*
 * Ribbon, Feign e Eureka
 * 
 * l'attributo name deve corrispondere al nome con la quale l'applicazione è registrtata su Eureka
 */
//@FeignClient(name="CURRENCY-EXCHANGE-SERVICE") 
//@RibbonClient(name="CURRENCY-EXCHANGE-SERVICE")


@FeignClient(name="CURRENCY-EXCHANGE-SERVICE") 
@RibbonClient(name="CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ConversionCurrencyBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
	
}
