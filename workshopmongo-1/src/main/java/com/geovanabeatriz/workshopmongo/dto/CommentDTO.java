package com.geovanabeatriz.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

	private static final long serialVersionUID = 1L; 

	private String name;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String name, Date date, AuthorDTO author) {
		super();
		this.name = name;
		this.date = date;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	
}
