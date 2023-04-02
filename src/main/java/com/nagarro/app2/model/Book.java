package com.nagarro.app2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Book {
	
	@Id
	@NotBlank(message = "Book Code is mandatory")
	String bookCode;
	@NotBlank(message = "Book Name is mandatory")
	@Column(name = "BookName")
	String bookName;
	@NotBlank(message = "Author is mandatory")
	@Column(name = "Author")
	String author;
	@Column(name = "DateAdded")
	String dateAdded;

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookName=" + bookName + ", author=" + author + ", dateAdded="
				+ dateAdded + "]";
	}

}
