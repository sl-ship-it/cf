package com.currencyfair.codechallenge.service;

import java.util.List;
import java.util.UUID;

import com.currencyfair.codechallenge.model.Order;

public interface OrderService {
	
	public void createOrder(Order order);
	
	public Order getOrder(UUID id);
	
	public List<Order> listOrders();

}
