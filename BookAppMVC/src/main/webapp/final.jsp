<%@page import="com.bookapp.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 
<% Book book = (Book) request.getAttribute("book"); %>
<%= "Book Title : " + book.getTitle() + "<br>" %>
<%= "Book ID : " + book.getBookId() + "<br>" %>
<%= "Book Price : " + book.getPrice() + "<br>" %>
<%= "Book Category : " + book.getCategory() + "<br>" %>
<%= "Book Author : " + book.getAuthor() + "<br>" %>
--%>
Book Title : ${book.title}<br>
Book ID : ${book.bookId }<br>
Book Price : ${book.price }<br>
Book Category : ${book.category}<br>
Book Author : ${book.author}<br>


</body>
</html>