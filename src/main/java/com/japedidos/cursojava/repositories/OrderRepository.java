package com.japedidos.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japedidos.cursojava.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
	

}
