package com.micro.service.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchange extends JpaRepository<CurrencyExchangeValue, Long> {

	CurrencyExchangeValue findByFromAndTo(String from, String to);
}
