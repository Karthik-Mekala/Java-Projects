package com.bookapp.model;

public class Book {
	private String title;
	private int bookId;
	private double price;
	private String category;
	private String author;
	public Book() {
		super();
	}
	public Book(String title, int bookId, double price, String category, String author) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.price = price;
		this.category = category;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", price=" + price + ", category=" + category
				+ ", author=" + author + "]";
	}
	
}
