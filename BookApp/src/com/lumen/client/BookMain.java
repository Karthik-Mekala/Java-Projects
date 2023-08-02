package com.lumen.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {
	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		// USER INPUT TO ADD BOOK DETAILS TO THE LIST
		
		System.out.print("Enter Book Title : ");
		String title = scanner.nextLine();
		
		System.out.print("Enter Book Author : ");
		String author = scanner.nextLine();
		
		System.out.print("Enter Book Category : ");
		String category = scanner.nextLine();
		
		System.out.print("Enter Book ID : ");
		Integer bookId = scanner.nextInt();
		
		System.out.print("Enter Book Price : ");
		double price = scanner.nextDouble();
		
		System.out.println();
		
		Book bookReference = new Book(title, author, category, bookId, price);
		bookService.addBook(bookReference);
		
		
		
		// GET ALL BOOKS
		System.out.println();
		System.out.println("All Books --> ");
		List<Book>books = new ArrayList<>();
		books = bookService.getAll();
		for(Book book : books) {
			System.out.println("Book Title : " + book.getTitle());
			System.out.println("Book Author : " + book.getAuthor());
			System.out.println("Book Category : " + book.getCategory());
			System.out.println("Book ID : " + book.getBookId());
			System.out.println("Book Price : " + book.getPrice());
			System.out.println();
		}
		
		
		
		// GET BOOK BY AUTHOR
		
		System.out.println();
		System.out.println("Books By Author -> ");
		List<Book> booksByAuthor = new ArrayList<>();
		try {
			booksByAuthor = bookService.getByAuthorContains("Jaa DavJohn Hopper");
			for(Book book : booksByAuthor) {
				System.out.println("Book Title : " + book.getTitle());
				System.out.println("Book Author : " + book.getAuthor());
				System.out.println("Book Category : " + book.getCategory());
				System.out.println("Book ID : " + book.getBookId());
				System.out.println("Book Price : " + book.getPrice());
				System.out.println();
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// GET BOOK BY CATEGORY
		
		System.out.println();
		System.out.println("Books By Category -> ");
		List<Book>booksByCategory = new ArrayList<>();
		try {
			booksByCategory = bookService.getByCategory("Fction");
			for(Book book : booksByCategory) {
				System.out.println("Book Title : " + book.getTitle());
				System.out.println("Book Author : " + book.getAuthor());
				System.out.println("Book Category : " + book.getCategory());
				System.out.println("Book ID : " + book.getBookId());
				System.out.println("Book Price : " + book.getPrice());
				System.out.println();
			}
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// GET BOOK LESS THAN SPECIFIED PRICE
		
		System.out.println();
		System.out.println("Books By Price -> ");
		Set<Book>booksByPriceLessThan = new HashSet();
		try {
			booksByPriceLessThan = bookService.getByPriceLessThan(300.68);
			for(Book book : booksByPriceLessThan) {
				System.out.println("Book Title : " + book.getTitle());
				System.out.println("Book Author : " + book.getAuthor());
				System.out.println("Book Category : " + book.getCategory());
				System.out.println("Book ID : " + book.getBookId());
				System.out.println("Book Price : " + book.getPrice());
				System.out.println();
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// GET BOOK BY AUTHOR AND CATEGORY
		
		System.out.println();
		System.out.println("Books By Author and Category -> ");
		Set<Book>booksByAuthorContainsAndCategory = new HashSet();
		try {
			booksByAuthorContainsAndCategory = bookService.getByAuthorContainsAndCategory("Evin Ben", "Fiction");
			for(Book book : booksByAuthorContainsAndCategory) {
				System.out.println("Book Title : " + book.getTitle());
				System.out.println("Book Author : " + book.getAuthor());
				System.out.println("Book Category : " + book.getCategory());
				System.out.println("Book ID : " + book.getBookId());
				System.out.println("Book Price : " + book.getPrice());
				System.out.println();
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// GET BOOK BY ID
		
		System.out.println();
		System.out.println("Books By ID -> ");
		List<Book> booksById = new ArrayList<>();
		try {
			booksById = bookService.getId(6);
			for(Book book : booksById) {
				System.out.println("Book Title : " + book.getTitle());
				System.out.println("Book Author : " + book.getAuthor());
				System.out.println("Book Category : " + book.getCategory());
				System.out.println("Book ID : " + book.getBookId());
				System.out.println("Book Price : " + book.getPrice());
				System.out.println();
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		scanner.close();
	}
}
