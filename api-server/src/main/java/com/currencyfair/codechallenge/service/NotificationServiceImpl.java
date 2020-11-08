package com.currencyfair.codechallenge.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.currencyfair.codechallenge.model.Order;

@Service
public class NotificationServiceImpl implements NotificationService {
	
	private static final Logger logger = LoggerFactory.getLogger(NotificationServiceImpl.class);
	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${notification.wsServerUrl}")
	private String wsServerUrl;
	
	@Override
	@Async
	public CompletableFuture<Void> sendOrderCreationEvent(Order order) {
		try{
			restTemplate.postForLocation(wsServerUrl, order);
		}catch(Exception e) {
			logger.error("error when notifiying websocket server", e);
		}
		return CompletableFuture.completedFuture(null);
	}
	
	
}
