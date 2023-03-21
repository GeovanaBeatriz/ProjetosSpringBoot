package com.geovanabeatriz.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geovanabeatriz.workshopmongo.domain.User;
import com.geovanabeatriz.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired //Conversa com a camada Repository automaticamente
	private UserRepository repo;
	public List<User> findAll(){
		return repo.findAll();
	}
}
