package com.geovanabeatriz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanabeatriz.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

	
}
