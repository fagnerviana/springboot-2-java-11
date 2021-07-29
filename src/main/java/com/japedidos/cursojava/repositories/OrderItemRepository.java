package com.japedidos.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japedidos.cursojava.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
