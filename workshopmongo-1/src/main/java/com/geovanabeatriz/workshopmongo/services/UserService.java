package com.geovanabeatriz.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geovanabeatriz.workshopmongo.domain.User;
import com.geovanabeatriz.workshopmongo.dto.UserDTO;
import com.geovanabeatriz.workshopmongo.repositories.UserRepository;
import com.geovanabeatriz.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	
	@Autowired //Conversa com a camada Repository automaticamente
	private UserRepository repo;
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findOne(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
