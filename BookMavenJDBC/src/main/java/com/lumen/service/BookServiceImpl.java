package com.lumen.service;

import java.util.ArrayList;
import java.util.List;

import com.lumen.dao.BookDaoImpl;
import com.lumen.dao.IBookDao;
import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;

public class BookServiceImpl implements IBookService {


	@Override
	public void addBook(Book book) {
		IBookDao bookDao = new BookDaoImpl();
		bookDao.addBook(book);
		System.out.println("Book Added.");
	}

	@Override
	public void updateBook(int bookId, double price) {
		IBookDao bookDao = new BookDaoImpl();
		bookDao.updateBook(bookId, price);
		System.out.println("Book Updated successfully.");
	}

	@Override
	public void deleteBook(int bookId) {
		IBookDao bookDao = new BookDaoImpl();
		bookDao.deleteBook(bookId);
		System.out.println("Book Deleted successfully.");
	}

	@Override
	public List<Book> getAll() {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> bookList = bookDao.findAll();
		return bookList;
	}


	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByAuthorContains(author);
		if(books.isEmpty()) {
			throw new BookNotFoundException("Sorry, Book Author not found!");
		}

		return books;
	}


	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByCategory(category);
		if(books.isEmpty()) {
			throw new BookNotFoundException("Sorry, Book Category not found!");
		}

		return books;

	}


	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByPriceLessThan(price);
		
		if(books.isEmpty()) {
			throw new BookNotFoundException("Sorry, Book Price less than "+ price + " not found!");
		}
		return books;
	}


	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByAuthorContainsAndCategory(author, category);

		
		if(books.isEmpty()) {
			throw new BookNotFoundException("Sorry, Book with provided Author and Category not found!");
		}

		return books;
	}


	@Override
	public Book getId(int bookId) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		Book book = bookDao.getId(bookId);
		Book booksById = null;

		if(book != null) {
			if(book.getBookId() == bookId) {
				booksById = book;
			}
		} else
			throw new BookNotFoundException("Sorry, Book ID not found!");

		return booksById;
	}
}
