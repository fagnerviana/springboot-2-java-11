package com.japedidos.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japedidos.cursojava.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	

}
