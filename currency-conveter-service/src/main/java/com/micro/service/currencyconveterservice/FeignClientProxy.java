package com.micro.service.currencyconveterservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.micro.service.currencyexchangeservice.CurrencyExchangeValue;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8080")
@FeignClient(name = "currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface FeignClientProxy {

	@GetMapping("/currency/from/{from}/to/{to}")
	public CurrencyConvert getCurrencyExchange(@PathVariable("from") String from, @PathVariable("to") String to);
		
}
