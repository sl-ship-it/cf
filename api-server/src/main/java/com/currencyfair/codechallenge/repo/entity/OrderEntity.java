package com.currencyfair.codechallenge.repo.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class OrderEntity {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;

	private String userId;

	private String currencyFrom;

	private String currencyTo;

	private BigDecimal amountBuy;

	private BigDecimal amountSell;

	private BigDecimal rate;

	private OffsetDateTime timePlaced;

	private String originatingCountry;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public BigDecimal getAmountBuy() {
		return amountBuy;
	}

	public void setAmountBuy(BigDecimal amountBuy) {
		this.amountBuy = amountBuy;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public OffsetDateTime getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(OffsetDateTime timePlaced) {
		this.timePlaced = timePlaced;
	}

	public String getOriginatingCountry() {
		return originatingCountry;
	}

	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}

	public BigDecimal getAmountSell() {
		return amountSell;
	}

	public void setAmountSell(BigDecimal amountSell) {
		this.amountSell = amountSell;
	}

}
