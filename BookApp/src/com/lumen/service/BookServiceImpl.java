package com.lumen.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.util.BookDetails;

public class BookServiceImpl implements IBookService {


	@Override
	public void addBook(Book book) {
		BookDetails.addBooks(book);
	}

	@Override
	public List<Book> getAll() {
		new BookDetails();
		List<Book> books = BookDetails.showBooks();
		return books;
	}


	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		ArrayList<Book> booksByAuthor = new ArrayList<Book>();
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
		List<Book> books = BookDetails.showBooks();
		ArrayList<Book> booksByCategory = new ArrayList<Book>();
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
	public Set<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Set<Book> booksByPriceLessThan = new HashSet();
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
	public Set<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		
		Set<Book> booksByAuthorContainsAndCategory = new HashSet();
		try {
			for(Book book : books) {
				if(book.getAuthor().equals(author)) {
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
		List<Book> books = BookDetails.showBooks();
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
