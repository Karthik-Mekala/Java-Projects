package com.lumen.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

public class BookMain {

	public void getBookByAuthor() {
		// GET BOOK BY AUTHOR
		IBookService bookService = new BookServiceImpl();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Author Name : ");
		String authorName = scanner.nextLine();
		System.out.println();
		System.out.println("Books By Author -> ");
		List<Book> booksByAuthor = new ArrayList<>();
		try {
			booksByAuthor = bookService.getByAuthorContains(authorName);
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

	}



	public void getBookByCategory() {
		// GET BOOK BY CATEGORY
		IBookService bookService = new BookServiceImpl();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Book Category : ");
		String bookCategory = scanner.nextLine();
		System.out.println();
		System.out.println("Books By Category -> ");
		List<Book>booksByCategory = new ArrayList<>();
		try {
			booksByCategory = bookService.getByCategory(bookCategory);
			for(Book book : booksByCategory) {
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
	}




	public void getBookByPriceLessThan() {
		// GET BOOK LESS THAN SPECIFIED PRICE
		IBookService bookService = new BookServiceImpl();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Book Price : ");
		double bookPrice = scanner.nextDouble();
		System.out.println();
		System.out.println("Books By Price -> ");
		List<Book>booksByPriceLessThan = new ArrayList<Book>();
		try {
			booksByPriceLessThan = bookService.getByPriceLessThan(bookPrice);
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
	}


	public void getBookByAuthorAndCategory() {
		// GET BOOK BY AUTHOR AND CATEGORY
		IBookService bookService = new BookServiceImpl();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Author Name : ");
		String authorName1 = scanner.nextLine();
		System.out.print("Enter Book Category : ");
		String bookCategory1 = scanner.nextLine();
		System.out.println();
		System.out.println("Books By Author and Category -> ");
		List<Book>booksByAuthorContainsAndCategory = new ArrayList<Book>();
		try {
			booksByAuthorContainsAndCategory = bookService.getByAuthorContainsAndCategory(authorName1, bookCategory1);
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
	}


	public void getBookById() {
		// GET BOOK BY ID
		IBookService bookService = new BookServiceImpl();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Book ID : ");
		int bookId1 = scanner.nextInt();
		System.out.println();
		System.out.println("Books By ID -> ");
		Book booksById = null;
		try {
			booksById = bookService.getId(bookId1);
			if(booksById != null) {
				System.out.println("Book Title : " + booksById.getTitle());
				System.out.println("Book Author : " + booksById.getAuthor());
				System.out.println("Book Category : " + booksById.getCategory());
				System.out.println("Book ID : " + booksById.getBookId());
				System.out.println("Book Price : " + booksById.getPrice());
			} else {
				throw new BookNotFoundException("Sorry, Book ID not found!");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}




	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hi there !");
		System.out.println("Welcome to my Book App");
		System.out.println();
		
		boolean option = true;
		while(option) {

			System.out.println("Select any Option");
			System.out.println("1. Add Books");
			System.out.println("2. Get All Books");
			System.out.println("3. Upadate Book");
			System.out.println("4. Delete Book");
			System.out.println("5. Get Books by Author");
			System.out.println("6. Get Books by Category");
			System.out.println("7. Get Books Less than Specified Price");
			System.out.println("8. Get Books by Author and Category");
			System.out.println("9. Get Books by Book ID");
			System.out.println();
			System.out.print("Enter your Choice : ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				// USER INPUT TO ADD BOOK DETAILS TO THE LIST
				System.out.println();
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
				break;

			case 2:
				// GET ALL BOOKS
				System.out.println();
				System.out.println("All Books --> ");
				List<Book> books = new ArrayList<>();
				books = bookService.getAll();
				for(Book book : books) {
					System.out.println("Book Title : " + book.getTitle());
					System.out.println("Book Author : " + book.getAuthor());
					System.out.println("Book Category : " + book.getCategory());
					System.out.println("Book ID : " + book.getBookId());
					System.out.println("Book Price : " + book.getPrice());
					System.out.println();
				}
				break;

			case 3:
				System.out.println();
				System.out.print("Enter Book ID : ");
				int bookId1 = scanner.nextInt();
				System.out.print("Enter Book Price : ");
				double price1 = scanner.nextDouble();
				System.out.println();
				IBookService bookService1 = new BookServiceImpl();
				bookService1.updateBook(bookId1, price1);
				break;

			case 4:
				System.out.println();
				System.out.print("Enter Book ID : ");
				int bookId2 = scanner.nextInt();
				System.out.println();
				IBookService bookService2= new BookServiceImpl();
				bookService2.deleteBook(bookId2);
				break;

			case 5:
				BookMain bookMain = new BookMain();
				bookMain.getBookByAuthor();
				break;

			case 6:
				BookMain bookMain1 = new BookMain();
				bookMain1.getBookByCategory();
				break;

			case 7:
				BookMain bookMain2 = new BookMain();
				bookMain2.getBookByPriceLessThan();
				break;

			case 8:
				BookMain bookMain3 = new BookMain();
				bookMain3.getBookByAuthorAndCategory();
				break;

			case 9:
				BookMain bookMain4 = new BookMain();
				bookMain4.getBookById();
				break;


			default:
				System.out.println("Enter a valid choice");
				System.out.println();
				break;
			}
			System.out.println();
			System.out.print("Do you want to try again [y/n] : ");
			String tryAgain = scanner.next();
			if(tryAgain.equals("y"))
				option = true;
			else {
				option = false;
				System.out.println("Thank you!");
				break;
			}
			System.out.println();

		}
		scanner.close();

	}
}
