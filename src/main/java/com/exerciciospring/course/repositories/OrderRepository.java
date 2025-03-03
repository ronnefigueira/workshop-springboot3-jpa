package com.exerciciospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciospring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
