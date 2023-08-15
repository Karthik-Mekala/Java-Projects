<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  min-height: 100vh;
}

.search-container {
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
  padding: 20px;
  width: 100%;
  max-width: 800px;
  text-align: center;
  color: #333;
}

h1 {
  margin-bottom: 20px;
}

.search-bar {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 20px;
}

#search-input {
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  width: 500px;
}

#search-button {
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px 20px;
  cursor: pointer;
  margin-left: 10px;
}

.buttons {
  margin-top: 20px;
}

.home-button, .logout-button {
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px 20px;
  text-decoration: none;
  margin: 0 10px;
}

.home-button:hover, .logout-button:hover {
  background-color: #0056b3;
  text-decoration: none;
}

.result-table {
  width: 100%;
  margin-top: 20px;
  border-collapse: collapse;
}

.result-table th, .result-table td {
  padding: 10px;
  border: 1px solid #ccc;
  width:200px;
}

.result-table th {
  background-color: #f0f0f0;
}
</style>
</head>
<body>
	
	<div class="search-container">
    <h1>Student Satellites of India</h1>
    <div class="search-bar">
    <form action="Student-Satellites-by-Year" class="search-bar">
      <input type="text" id="search-input" placeholder="Enter year" name="year">
      <button id="search-button">Search</button>
	</form>
    </div>
    <div class="buttons">
    <a href="Student-Satellite" class="home-button">Back</a>
      <a href="home.jsp" class="home-button">Home</a>
      <a href="index.jsp" class="logout-button">Logout</a>
    </div>
    <table class="result-table">
      <thead>
        <tr>
			<th>ID</th>
			<th>Satellite Name</th>
			<th>Launch Date</th>
			<th>Launch Vehicle</th>
			<th>Satellite Orbit Type</th>
			<th>Launch Year</th>
		</tr>
      </thead>
      <tbody>
        <c:forEach items="${studentSatList}" var="studentSat">
			<tr>
				<td>${studentSat.getId()}</td>
				<td>${studentSat.getName()}</td>
				<td>${studentSat.getLaunchDate()}</td>
				<td>${studentSat.getLaunchVehicle()}</td>
				<td>${studentSat.getOrbitType()}</td>
				<td>${studentSat.getYear()}</td>
			</tr>
		</c:forEach>

      </tbody>
    </table>
  </div>

</body>
</html>