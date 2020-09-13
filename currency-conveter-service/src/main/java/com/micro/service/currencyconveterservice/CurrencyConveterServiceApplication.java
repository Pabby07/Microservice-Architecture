package com.micro.service.currencyconveterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.micro.service.currencyconveterservice")
@EnableDiscoveryClient
public class CurrencyConveterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConveterServiceApplication.class, args);
	}

}
