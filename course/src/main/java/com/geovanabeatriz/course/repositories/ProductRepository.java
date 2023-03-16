package com.geovanabeatriz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanabeatriz.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

	
}
