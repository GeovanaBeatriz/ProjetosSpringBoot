package com.geovanabeatriz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanabeatriz.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	
}