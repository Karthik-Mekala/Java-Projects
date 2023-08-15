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

.login-container {
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  padding: 20px;
  width: 300px;
}

h2 {
  text-align: center;
}

form {
  display: flex;
  flex-direction: column;
}

label {
  margin-top: 10px;
}

input {
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  margin-top: 5px;
}

button {
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px;
  cursor: pointer;
  margin-top: 10px;
}

button:hover {
  background-color: #0056b3;
}
</style>

</head>
<body>
  <div class="login-container">
    <h2>Login</h2>
    <form action=home method="post">
      <label for="username">User Name :</label>
      <input type="text" id="username" name="username" required>
      <label for="password">Password :</label>
      <input type="password" id="password" name="password" required>
      <button type="submit">Login</button>
    </form>
    <br>
    ${message}
  </div>
  
	
</body>
</html>