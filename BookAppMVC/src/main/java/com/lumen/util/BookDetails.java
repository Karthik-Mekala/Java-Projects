package com.lumen.util;

import java.util.List;

import com.bookapp.model.Book;
import com.lumen.dao.BookDaoImpl;
import com.lumen.dao.IBookDao;


public class BookDetails {
	
	public static void addBooks(Book book) {
		IBookDao bookDao = new BookDaoImpl();
		bookDao.addBook(book);
	}
	
	
	public static List<Book> showBooks() {
		IBookDao bookDao = new BookDaoImpl();
		List<Book> bookList = bookDao.findAll();
		return bookList;
		
	}



}
