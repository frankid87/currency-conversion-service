package com.cinquepalmi.test.spring.currencyconversionservice.dto;

import java.math.BigDecimal;

public class ConversionCurrencyBean {

	private Long id;
	private String from;
	private String to;
	private Integer port;
	private BigDecimal conversionMultiple; 
	private BigDecimal quantity;
	private BigDecimal totalAmountCalcolated;
	
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
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalAmountCalcolated() {
		return totalAmountCalcolated;
	}
	public void setTotalAmountCalcolated(BigDecimal totalAmountCalcolated) {
		this.totalAmountCalcolated = totalAmountCalcolated;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
}