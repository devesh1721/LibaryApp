package com.nagarro.app2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.app2.model.Book;

public interface BookService {
	public List<Book> getBooksList();

	public Optional<Book> getBookById(String id);

	public void addNewBook(Book newBook);

	public void updateExitingBook(String id, Book newBook);

	public void removeBook(String id);
}
