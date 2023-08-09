package com.lumen.service;

import java.util.ArrayList;

import java.util.List;

import com.bookapp.model.Book;
import com.lumen.dao.BookDaoImpl;
import com.lumen.dao.IBookDao;
import com.lumen.exceptions.BookNotFoundException;

public class BookServiceImpl implements IBookService {


	@Override
	public void addBook(Book book) {
		IBookDao bookDao = new BookDaoImpl();
		bookDao.addBook(book);
		System.out.println("Book Added.");
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
		List<Book> booksByAuthor = new ArrayList<Book>();
		try {
			for(Book book : books) {
				if(book.getAuthor().equals(author)) {
					booksByAuthor.add(book);
				}
			}
			if(booksByAuthor.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book Author not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByAuthor;
	}


	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByCategory(category);
		List<Book> booksByCategory = new ArrayList<Book>();
		try {
			for(Book book : books) {
				if(book.getCategory().equals(category)) {
					booksByCategory.add(book);
				}
			}
			if(booksByCategory.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book Category not found!");
			}

		} catch(BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByCategory;



	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByPriceLessThan(price);
		List<Book> booksByPriceLessThan = new ArrayList();
		try {
			for(Book book : books) {
				if(book.getPrice() <= price) {
					booksByPriceLessThan.add(book);
				}
			}
			if(booksByPriceLessThan.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book Price less than "+ price + " not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByPriceLessThan;
	}


	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
//		List<Book> books = BookDetails.showBooks();
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getByAuthorContainsAndCategory(author, category);
		List<Book> booksByAuthorContainsAndCategory = new ArrayList();
		try {
			for(Book book : books) {
				if(book.getAuthor().equals(author) && book.getCategory().equals(category)) {
					booksByAuthorContainsAndCategory.add(book);
				}
			}
			if(booksByAuthorContainsAndCategory.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book with provided Author and Category not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksByAuthorContainsAndCategory;
	}


	@Override
	public List<Book> getId(int bookId) throws BookNotFoundException {
//		List<Book> books = BookDetails.showBooks();
		IBookDao bookDao = new BookDaoImpl();
		List<Book> books = bookDao.getId(bookId);
		ArrayList<Book> booksById = new ArrayList<Book>();
		try {
			for(Book book : books) {
				if(book.getBookId() == bookId) {
					booksById.add(book);
				}
			}
			if(booksById.isEmpty()) {
				throw new BookNotFoundException("Sorry, Book ID not found!");
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return booksById;
	}
}
