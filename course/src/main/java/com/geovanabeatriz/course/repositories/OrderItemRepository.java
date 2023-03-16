package com.geovanabeatriz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanabeatriz.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

	
}
