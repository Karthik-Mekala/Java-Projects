<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="align:right;">
<a href="admin.jsp">Admin</a>
</div>

<form action="search">
Enter Category <input type="text" name="category">
<input type="submit" value="Submit">
</form>

${books}
</body>
</html>