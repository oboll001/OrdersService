package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrdersRepository;
import com.cognixia.jump.service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersRepository repo;
	
	@Autowired
	OrdersService service;
	

	@GetMapping("/generate")
	public Orders createOrder(@RequestBody Orders order) {
		
		Orders created = repo.save(order);
		
		return created;
	}
}
