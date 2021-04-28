package com.japedidos.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japedidos.cursojava.entities.Category;
import com.japedidos.cursojava.entities.Order;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	

}
