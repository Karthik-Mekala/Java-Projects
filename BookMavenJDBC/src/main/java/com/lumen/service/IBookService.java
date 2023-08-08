package com.lumen.service;

import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public interface IBookService {
	void addBook(Book book);
	List<Book> getAll();
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
	List<Book> getByAuthorContains(String author) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	Book getId(int bookId) throws BookNotFoundException;
	
}
