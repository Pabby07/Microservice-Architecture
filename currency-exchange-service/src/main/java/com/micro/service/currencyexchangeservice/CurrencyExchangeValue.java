package com.micro.service.currencyexchangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchangeValue {

	@Id
	private Long id;
	
	@Column(name="curr_from")
	private String from;
	
	@Column(name="curr_to")
	private String to;
	private int val;
	private int port;
	
	public CurrencyExchangeValue() {
	
	}
	
	public CurrencyExchangeValue(Long id, String from, String to, int val, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.val = val;
		this.port = port;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
