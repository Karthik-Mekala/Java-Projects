package com.lumen.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.lumen.model.Book;


public class BookDetails {
	static ArrayList<Book> bookList = new ArrayList<Book>();
	static List<Book> arrayList = Arrays.asList(
			new Book("Java in Action", "Java David", "Tech", 1, 900.90),
			new Book("5 am club", "Robin Sharma", "Selfhelp", 2, 300.68),
			new Book("HTMl for Dummies", "Ben John", "Tech", 3, 1900.45),
			new Book("Secret Seven", "Evin Ben", "Fiction", 4, 700.06),
			new Book("Java in Action", "Java DavJohn Hopper", "Selfhelp", 5, 800.56)
			);
	
	public static void addBooks(Book book) {
		bookList.add(book);
	}
	
	
	public static List<Book> showBooks() {
				
		for(Book book : arrayList) {
			addBooks(book);
		}
		
		return bookList;
		
	}



}
