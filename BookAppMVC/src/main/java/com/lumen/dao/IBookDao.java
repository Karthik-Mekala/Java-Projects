package com.lumen.dao;

import java.util.List;

import com.bookapp.model.Book;
import com.lumen.exceptions.BookNotFoundException;

public interface IBookDao {
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(Book book);
	List<Book> findAll();
	List<Book> getByAuthorContains(String author) throws BookNotFoundException;
	List<Book> getByCategory(String category) throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	List<Book> getId(int bookId) throws BookNotFoundException;
}
