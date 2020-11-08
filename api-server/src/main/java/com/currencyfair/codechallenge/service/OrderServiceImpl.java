package com.currencyfair.codechallenge.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyfair.codechallenge.converter.entitydto.OrderEntityDTOConverter;
import com.currencyfair.codechallenge.model.Order;
import com.currencyfair.codechallenge.repo.OrderRepository;
import com.currencyfair.codechallenge.repo.entity.OrderEntity;

@Service
public class OrderServiceImpl implements OrderService {

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderRepository repository;

	@Autowired
	private NotificationService notifcationService;

	@Override
	@Transactional(TxType.REQUIRED)
	public void createOrder(Order order) {
		OrderEntity entity = OrderEntityDTOConverter.createFromDTO(order);
		repository.save(entity);
		order.setOrderId(entity.getId());
		notifcationService.sendOrderCreationEvent(order);
	}

	@Override
	@Transactional(TxType.NOT_SUPPORTED)
	public Order getOrder(UUID id) {
		return null;
	}

	@Override
	@Transactional(TxType.NOT_SUPPORTED)
	public List<Order> listOrders() {
		return repository.findAll()
				.stream()
				.map(OrderEntityDTOConverter::createFromEntity)
				.collect(Collectors.toList());
	}

}
