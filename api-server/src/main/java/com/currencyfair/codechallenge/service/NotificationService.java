package com.currencyfair.codechallenge.service;

import java.util.concurrent.CompletableFuture;

import com.currencyfair.codechallenge.model.Order;

public interface NotificationService {

	public CompletableFuture<Void> sendOrderCreationEvent(Order order);
}
