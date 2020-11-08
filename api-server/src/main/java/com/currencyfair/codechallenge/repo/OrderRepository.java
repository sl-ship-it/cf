package com.currencyfair.codechallenge.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.currencyfair.codechallenge.repo.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, UUID> {
	
	List<OrderEntity> findAll();
	

}
