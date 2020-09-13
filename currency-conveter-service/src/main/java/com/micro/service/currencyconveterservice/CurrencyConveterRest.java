package com.micro.service.currencyconveterservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConveterRest {
	
	@Autowired
	private FeignClientProxy proxy;

	@GetMapping("/convert/from/{from}/to/{to}/value/{value}")
	public CurrencyConvert Conveter(@PathVariable String from, @PathVariable String to, @PathVariable int value) {
		
		RestTemplate rs = new RestTemplate();
		
		
		
//		Map<String,String> map = new HashMap<String, String>();
//		map.put("from", from);
//		map.put("to", to);
//		ResponseEntity<CurrencyConvert>  entitys = rs.getForEntity("http://localhost:8080/currency/from/{from}/to/{to}", CurrencyConvert.class, map);
//		CurrencyConvert responseBody = entitys.getBody();
		
		CurrencyConvert responseBody = proxy.getCurrencyExchange(from, to);
		
		return new CurrencyConvert(responseBody.getId(),from, to, responseBody.getVal(), responseBody.getPort(), value, responseBody.getVal()*value);
	}

}

