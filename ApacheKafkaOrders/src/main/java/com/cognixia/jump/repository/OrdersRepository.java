package com.cognixia.jump.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.jump.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{ 

	public Optional<Orders> findById(int id);
}
