package com.lumen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.lumen.exceptions.BookNotFoundException;
import com.lumen.util.Queries;

public class BookDaoImpl implements IBookDao{

	String url = "jdbc:mysql://localhost:3306/mybook";
	String username = "root";
	String password = "admin@123";


	@Override
	public void addBook(Book book) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (
				Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.insertQuery)){
			preparedStatement.setString(1, book.getTitle());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getCategory());
			preparedStatement.setInt(4, book.getBookId());
			preparedStatement.setDouble(5, book.getPrice());
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} 


	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> findAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.query);
				ResultSet resultSet = preparedStatement.executeQuery();){

			List<Book> bookList = new ArrayList<Book>();
			Book book;
			while(resultSet.next()) {
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String category = resultSet.getString("category");
				Integer bookId = resultSet.getInt("bookid");
				Double price = resultSet.getDouble("price");
				book = new Book(title, bookId, price, category, author);
				bookList.add(book);
			}
			return bookList;

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.querybyauthor);) {

			preparedStatement.setString(1, author);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {

				List<Book> bookList = new ArrayList<Book>();
				Book book;
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					String author1 = resultSet.getString("author");
					String category = resultSet.getString("category");
					Integer bookId = resultSet.getInt("bookid");
					Double price = resultSet.getDouble("price");
					book = new Book(title, bookId, price, category, author);
					bookList.add(book);
				}
				return bookList;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.querybycategory);) {

			preparedStatement.setString(1, category);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {

				List<Book> bookList = new ArrayList<Book>();
				Book book;
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					String author1 = resultSet.getString("author");
					String category1 = resultSet.getString("category");
					Integer bookId = resultSet.getInt("bookid");
					Double price = resultSet.getDouble("price");
					book = new Book(title, bookId, price, category, author1);
					bookList.add(book);
				}
				return bookList;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.querybyprice);) {

			preparedStatement.setDouble(1, price);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {

				List<Book> bookList = new ArrayList<Book>();
				Book book;
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					String author1 = resultSet.getString("author");
					String category1 = resultSet.getString("category");
					Integer bookId = resultSet.getInt("bookid");
					Double price1 = resultSet.getDouble("price");
					book = new Book(title, bookId, price, category1, author1);
					bookList.add(book);
				}
				return bookList;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.querybyauthorandcategory);) {

			preparedStatement.setString(1, author);
			preparedStatement.setString(2, category);
			

			try (ResultSet resultSet = preparedStatement.executeQuery()) {

				List<Book> bookList = new ArrayList<Book>();
				Book book;
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					String author1 = resultSet.getString("author");
					String category1 = resultSet.getString("category");
					Integer bookId = resultSet.getInt("bookid");
					Double price = resultSet.getDouble("price");
					book = new Book(title, bookId, price, category, author);
					bookList.add(book);
				}
				return bookList;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Book> getId(int bookId) throws BookNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.querybyid);) {

			preparedStatement.setDouble(1, bookId);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {

				List<Book> bookList = new ArrayList<Book>();
				Book book;
				while(resultSet.next()) {
					String title = resultSet.getString("title");
					String author1 = resultSet.getString("author");
					String category1 = resultSet.getString("category");
					Integer bookId1 = resultSet.getInt("bookid");
					Double price1 = resultSet.getDouble("price");
					book = new Book(title, bookId1, price1, category1, author1);
					bookList.add(book);
				}
				return bookList;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}







}
