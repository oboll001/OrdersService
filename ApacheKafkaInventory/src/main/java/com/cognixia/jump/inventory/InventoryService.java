package com.cognixia.jump.inventory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Orders;

@Service
public class InventoryService {
	
	
	@KafkaListener(topics = "orders", groupId = "orders_group_id")
	public void purchase(Orders order) {
		System.out.println("Purchasing: "+ order.toString());
		
	}
}
