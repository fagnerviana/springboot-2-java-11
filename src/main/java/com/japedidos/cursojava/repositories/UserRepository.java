package com.japedidos.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japedidos.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	

}
