package com.currencyfair.codechallenge.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.currencyfair.codechallenge.model.Order;
import com.currencyfair.codechallenge.service.OrderService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T08:41:09.652Z[GMT]")
@RestController
public class OrderApiController implements OrderApi {
    
    @Autowired
    private OrderService orderService;

    public ResponseEntity<List<Order>> orderGet() {
        return new ResponseEntity<List<Order>>(orderService.listOrders(), HttpStatus.OK);
    }

    public ResponseEntity<Order> orderOrderIdGet(@Parameter(in = ParameterIn.PATH, description = "the user identifier, as userId", required=true, schema=@Schema()) @PathVariable("orderId") String orderId) {
        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> orderPost(@Parameter(in = ParameterIn.DEFAULT, description = "Order Creation Payload", schema=@Schema()) @Valid @RequestBody Order body) {
    	orderService.createOrder(body);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

}
