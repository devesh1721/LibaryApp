package com.nagarro.app2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nagarro.app2.model.Author;
import com.nagarro.app2.repo.AuthorRepo;
import com.nagarro.app2.service.AuthorService;

@Service
public class AuthorServiceImplementation implements AuthorService {

	@Autowired
	private AuthorRepo authorRepo;


	@Override
	public List<Author> getAllAuthors() {
		return authorRepo.findAll();
	}

	@Override
	public Optional<Author> getAuthor(int id) {
		return authorRepo.findById(id);
	}

	@Override
	public ResponseEntity<Void> addAuthor(Author newAuthor) {
		HttpHeaders header = new HttpHeaders();
		try {
			authorRepo.save(newAuthor);
			header.add("Desc", "Author save sucessfully");
			return ResponseEntity.status(HttpStatus.OK).headers(header).build();
		} catch (IllegalArgumentException e) {
			header.add("Desc", "Author save sucessfully");
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).headers(header).build();
		}

	}

	@Override
	public ResponseEntity<Void> editAuthor(Author newAuthor, int id) {
		HttpHeaders header = new HttpHeaders();
		try {
			Optional<Author> authorObj = authorRepo.findById(id);
			if (authorObj.isEmpty()) {
				authorRepo.save(newAuthor);
				header.add("Desc", "Duplicate Id");
				return ResponseEntity.status(HttpStatus.OK).headers(header).build();
			} else {
				header.add("Desc", "Author save sucessfully");
				return ResponseEntity.status(HttpStatus.OK).headers(header).build();
			}
		} catch (IllegalArgumentException e) {
			header.add("desc", "Author was not  edited");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).build();
		}
	}

	@Override
	public ResponseEntity<Void> deleteAuthor(int id) {
		HttpHeaders header = new HttpHeaders();
		try {
			authorRepo.deleteById(id);
			header.add("desc", "Author delete sucessfully");
			return ResponseEntity.status(HttpStatus.OK).headers(header).build();
		} catch (Exception e) {
			header.add("desc", "Author not exits");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).build();
		}
	}

}
