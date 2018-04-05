package com.cinquepalmi.test.spring.currencyconversionservice.dto;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id;
	private String from, to;
	private BigDecimal quantity, convertionMultiple, totalCalculatedAmount;

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
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getConvertionMultiple() {
		return convertionMultiple;
	}
	public void setConvertionMultiple(BigDecimal convertionMultiple) {
		this.convertionMultiple = convertionMultiple;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	
}