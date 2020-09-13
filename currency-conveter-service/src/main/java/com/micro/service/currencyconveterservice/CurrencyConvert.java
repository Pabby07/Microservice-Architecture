package com.micro.service.currencyconveterservice;



public class CurrencyConvert {
	
	private Long id;
	private String from;
	private String to;
	private int val;
	private int port;
	private int amount;
	private int finalAmount;
	
	
	public CurrencyConvert() {
		
	}
	
	
	public int getFinalAmount() {
		return finalAmount;
	}


	public void setFinalAmount(int finalAmount) {
		this.finalAmount = finalAmount;
	}


	public CurrencyConvert(Long id, String from, String to, int val, int port, int amount, int finalAmount) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.val = val;
		this.port = port;
		this.amount = amount;
		this.finalAmount = finalAmount;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
