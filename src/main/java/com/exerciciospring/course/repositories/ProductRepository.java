package com.exerciciospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciospring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
