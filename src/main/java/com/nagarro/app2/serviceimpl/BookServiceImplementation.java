package com.nagarro.app2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.app2.model.Book;
import com.nagarro.app2.repo.BookRepo;
import com.nagarro.app2.service.BookService;

@Service
public class BookServiceImplementation implements BookService {

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public List<Book> getBooksList() {
		return bookRepo.findAll();
	}

	@Override
	public Optional<Book> getBookById(String id) {
		return bookRepo.findById(id);
	}

	@Override
	public void addNewBook(Book newBook) {
		bookRepo.save(newBook);
	}

	@Override
	public void updateExitingBook(String id, Book newBook) {
		
		bookRepo.save(newBook);
	}

	@Override
	public void removeBook(String id) {
		bookRepo.deleteById(id);
	}
	
	

}
