package com.geovanabeatriz.workshopmongo.dto;

import java.io.Serializable;

import com.geovanabeatriz.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = 1L; //O DTO faz uma projeção dos dados que eu quero usar, no post eu vou usar somente o nome e o id do usuário

	private String id;
	private String name;
	
	public AuthorDTO() {
		
	}
	
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
