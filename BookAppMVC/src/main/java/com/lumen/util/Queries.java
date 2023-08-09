package com.lumen.util;

public class Queries {
	public static final String insertQuery="insert into books values(?,?,?,?,?)"; 
	public static final String updateQuery="update books set price=? where bookid=?"; 
	public static final String deleteQuery="delete from books where bookid=?"; 
	
	public static final String query="select * from books"; 
	public static final String querybyauthor="select * from books where author like ?"; 
	public static final String querybycategory="select * from books where category=?"; 
	public static final String querybyprice="select * from books where price<=?"; 
	public static final String querybyauthorandcategory="select * from books where author=? and category=? ";
	public static final String querybyid="select * from books where bookid=?"; 	
}
