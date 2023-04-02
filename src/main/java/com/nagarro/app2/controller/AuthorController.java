package com.nagarro.app2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.app2.model.Author;
import com.nagarro.app2.service.AuthorService;

//This is a rest contolerr
@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@GetMapping("/authors")
	public List<Author> getAllAuthor() {
		return authorService.getAllAuthors();

	}

	@GetMapping("/authors/{id}")
	public Optional<Author> getAllAuthor(@PathVariable int id) {
		return  authorService.getAuthor(id);

	}

	@PostMapping("/authors")
	public ResponseEntity<Void> addAuthor(@RequestBody Author newAuthor) {
		return authorService.addAuthor(newAuthor);
	}

	@PutMapping("/authors/{id}")
	public ResponseEntity<Void> editAuthor(@RequestBody Author newAuthor, @PathVariable int id) {
		newAuthor.setId(id);
		return authorService.editAuthor(newAuthor, id);
	}

	@DeleteMapping("/authors/{id}")
	public ResponseEntity<Void> deleteAuthor(@PathVariable int id) {
		System.out.println(id + "Id");
		return authorService.deleteAuthor(id);
	}
	
}
