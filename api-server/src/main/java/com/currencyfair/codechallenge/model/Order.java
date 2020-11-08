package com.currencyfair.codechallenge.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T08:41:09.652Z[GMT]")


public class Order   {
  @JsonProperty("orderId")
  private UUID orderId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("currencyFrom")
  private String currencyFrom = null;

  @JsonProperty("currencyTo")
  private String currencyTo = null;

  @JsonProperty("amountSell")
  private BigDecimal amountSell = null;

  @JsonProperty("amountBuy")
  private BigDecimal amountBuy = null;

  @JsonProperty("rate")
  private BigDecimal rate = null;

  @JsonProperty("timePlaced")
  private String timePlaced = null;

  @JsonProperty("originatingCountry")
  private String originatingCountry = null;

  public Order orderId(UUID orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   **/
  @Schema(description = "")
  
    @Valid
    public UUID getOrderId() {
    return orderId;
  }

  public void setOrderId(UUID orderId) {
    this.orderId = orderId;
  }

  public Order userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "123456", description = "")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Order currencyFrom(String currencyFrom) {
    this.currencyFrom = currencyFrom;
    return this;
  }

  /**
   * Get currencyFrom
   * @return currencyFrom
   **/
  @Schema(example = "EUR", description = "")
  
    public String getCurrencyFrom() {
    return currencyFrom;
  }

  public void setCurrencyFrom(String currencyFrom) {
    this.currencyFrom = currencyFrom;
  }

  public Order currencyTo(String currencyTo) {
    this.currencyTo = currencyTo;
    return this;
  }

  /**
   * Get currencyTo
   * @return currencyTo
   **/
  @Schema(example = "USD", description = "")
  
    public String getCurrencyTo() {
    return currencyTo;
  }

  public void setCurrencyTo(String currencyTo) {
    this.currencyTo = currencyTo;
  }

  public Order amountSell(BigDecimal amountSell) {
    this.amountSell = amountSell;
    return this;
  }

  /**
   * Get amountSell
   * @return amountSell
   **/
  @Schema(example = "1000", description = "")
  
    @Valid
    public BigDecimal getAmountSell() {
    return amountSell;
  }

  public void setAmountSell(BigDecimal amountSell) {
    this.amountSell = amountSell;
  }

  public Order amountBuy(BigDecimal amountBuy) {
    this.amountBuy = amountBuy;
    return this;
  }

  /**
   * Get amountBuy
   * @return amountBuy
   **/
  @Schema(example = "747.1", description = "")
  
    @Valid
    public BigDecimal getAmountBuy() {
    return amountBuy;
  }

  public void setAmountBuy(BigDecimal amountBuy) {
    this.amountBuy = amountBuy;
  }

  public Order rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
   **/
  @Schema(example = "0.7471", description = "")
  
    @Valid
    public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public Order timePlaced(String timePlaced) {
    this.timePlaced = timePlaced;
    return this;
  }

  /**
   * Get timePlaced
   * @return timePlaced
   **/
  @Schema(example = "24-JAN-18 10:27:44", description = "")
  
    public String getTimePlaced() {
    return timePlaced;
  }

  public void setTimePlaced(String timePlaced) {
    this.timePlaced = timePlaced;
  }

  public Order originatingCountry(String originatingCountry) {
    this.originatingCountry = originatingCountry;
    return this;
  }

  /**
   * Get originatingCountry
   * @return originatingCountry
   **/
  @Schema(example = "FR", description = "")
  
    public String getOriginatingCountry() {
    return originatingCountry;
  }

  public void setOriginatingCountry(String originatingCountry) {
    this.originatingCountry = originatingCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.userId, order.userId) &&
        Objects.equals(this.currencyFrom, order.currencyFrom) &&
        Objects.equals(this.currencyTo, order.currencyTo) &&
        Objects.equals(this.amountSell, order.amountSell) &&
        Objects.equals(this.amountBuy, order.amountBuy) &&
        Objects.equals(this.rate, order.rate) &&
        Objects.equals(this.timePlaced, order.timePlaced) &&
        Objects.equals(this.originatingCountry, order.originatingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userId, currencyFrom, currencyTo, amountSell, amountBuy, rate, timePlaced, originatingCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    currencyFrom: ").append(toIndentedString(currencyFrom)).append("\n");
    sb.append("    currencyTo: ").append(toIndentedString(currencyTo)).append("\n");
    sb.append("    amountSell: ").append(toIndentedString(amountSell)).append("\n");
    sb.append("    amountBuy: ").append(toIndentedString(amountBuy)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    timePlaced: ").append(toIndentedString(timePlaced)).append("\n");
    sb.append("    originatingCountry: ").append(toIndentedString(originatingCountry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
