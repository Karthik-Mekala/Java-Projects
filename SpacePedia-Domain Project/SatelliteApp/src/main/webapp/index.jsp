<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpacePedia</title>
<style type="text/css">
body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
  margin: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.home-container {
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  padding: 20px;
  width: 300px;
  text-align: center;
}

h1 {
  margin-bottom: 20px;
}

.button-container {
  display: flex;
  flex-direction: column;
}

.button {
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  cursor: pointer;
  margin: 5px 0;
}

.button:hover {
  background-color: #0056b3;
}
a {
margin: 10px;
}
</style>
</head>
<body>
<div class="home-container">
    <h3>Welcome to</h3>
    <h1>SpacePedia</h1>
    <div class="button-container">
      <a href="userLogin.jsp" class="button">Sign In</a>
      <a href="userRegister.jsp" class="button">Sign Up</a>
    </div>


</body>
</html>