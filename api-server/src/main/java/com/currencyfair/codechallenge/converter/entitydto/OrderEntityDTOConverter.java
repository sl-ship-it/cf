package com.currencyfair.codechallenge.converter.entitydto;

import com.currencyfair.codechallenge.model.Order;
import com.currencyfair.codechallenge.repo.entity.OrderEntity;
import com.currencyfair.codechallenge.utils.DateTimeUtils;

public class OrderEntityDTOConverter {

	private OrderEntityDTOConverter() {

	}

	public static OrderEntity createFromDTO(Order dto) {
		OrderEntity entity = new OrderEntity();
		entity.setAmountBuy(dto.getAmountBuy());
		entity.setAmountSell(dto.getAmountSell());
		entity.setCurrencyFrom(dto.getCurrencyFrom());
		entity.setCurrencyTo(dto.getCurrencyTo());
		entity.setRate(dto.getRate());
		entity.setUserId(dto.getUserId());
		entity.setOriginatingCountry(dto.getOriginatingCountry());
		entity.setTimePlaced(DateTimeUtils.convertToOffsetDate(dto.getTimePlaced()));
		return entity;
	}

	public static Order createFromEntity(OrderEntity entity) {
		Order dto = new Order();
		dto.setOrderId(entity.getId());
		dto.setAmountBuy(entity.getAmountBuy());
		dto.setAmountSell(entity.getAmountSell());
		dto.setCurrencyFrom(entity.getCurrencyFrom());
		dto.setCurrencyTo(entity.getCurrencyTo());
		dto.setRate(entity.getRate());
		dto.setUserId(entity.getUserId());
		dto.setOriginatingCountry(entity.getOriginatingCountry());
		dto.setTimePlaced(DateTimeUtils.convertToString(entity.getTimePlaced()));
		return dto;
	}
}
