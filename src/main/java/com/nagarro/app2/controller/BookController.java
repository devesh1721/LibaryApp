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

import com.nagarro.app2.model.Book;
import com.nagarro.app2.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getBooksList();
	}

	@GetMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable String id) {
		return bookService.getBookById(id);
	}

	@PostMapping("/books")
	public void addBook(@RequestBody Book newBook) {
		bookService.addNewBook(newBook);
	}

	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book newBook, @PathVariable String id) {
		bookService.updateExitingBook(id, newBook);
	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.removeBook(id);
	}

}
