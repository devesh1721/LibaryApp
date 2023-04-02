package com.nagarro.app2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.nagarro.app2.model.Author;

public interface AuthorService {
	
	public List<Author> getAllAuthors();
	public Optional<Author> getAuthor(int id);
	public ResponseEntity<Void> addAuthor(Author newAuthor);
	public ResponseEntity<Void> editAuthor(Author newAuhtor,int id);
	ResponseEntity<Void> deleteAuthor(int id);

}
