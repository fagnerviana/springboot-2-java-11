package com.japedidos.cursojava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.japedidos.cursojava.entities.Order;
import com.japedidos.cursojava.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findALL() {
		return repository.findAll();

	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();

	}

}
