package com.bookapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.Book;
import com.lumen.service.BookServiceImpl;
import com.lumen.service.IBookService;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// create a reference of IBookService
	private IBookService bookService = new BookServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String title = request.getParameter("title");
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		double price = Double.parseDouble(request.getParameter("price"));
		String category = request.getParameter("category");
		String author = request.getParameter("author");
		
		Book book = new Book();
		book.setTitle(title);
		book.setBookId(bookId);
		book.setPrice(price);
		book.setCategory(category);
		book.setAuthor(author);
		
		
		bookService.addBook(book);
		
//		request.setAttribute("book", book);
		request.setAttribute("message", "Book Added Successfully");
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
