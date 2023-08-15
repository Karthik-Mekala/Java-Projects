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
  /* background-color: #03045e; */
  background-image:url("img.jpg");
  background-repeat: no-repeat;
  background-size:cover;
  margin: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
}

.home-container {
  background-color: #212529;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
  padding: 20px;
  width: 90%;
  max-width: 600px;
  text-align: center;
  color: #ffffff;
}

h1 {
  margin-bottom: 20px;
}

.card-container {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 20px;
  margin-top: 20px;
}

.card {
  background-color: #343a40;
  border-radius: 5px;
  padding: 15px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
}

.logout-link {
  color: white;
  text-decoration: none;
  margin-top: 20px;
  display: inline-block;
}

.logout-link:hover {
  text-decoration: underline;
}
a{
color:white;
}
</style>
</head>
<body>

 <div class="home-container">
 	<h1>Hi ${name}!</h1>
    <h1>Welcome to the Satellite Information Portal</h1>
    <div class="card-container">
      <div class="card">
        <h2><a href="Communication-Satellites">Communication Satellites</a></h2>
        <p>Supports telecommunication, television broadcasting, satellite news gathering, societal applications, weather forecasting, disaster warning and Search and Rescue operation services.</p>
      </div>
      <div class="card">
        <h2><a href="Earth-Observation-Satellites">Earth Observation Satellites</a></h2>
        <p>The largest civilian remote sensing satellite constellation in the world - thematic series of satellites supporting multitude of applications in the areas of land and water resources; cartography; and ocean & atmosphere</p>
      </div>
      <div class="card">
        <h2><a href="Experimental-Satellites">Experimental Satellites</a></h2>
        <p>A host of small satellites mainly for the experimental purposes. These experiments include Remote Sensing, Atmospheric Studies, Payload Development, Orbit Controls, recovery technology etc..</p>
      </div>
      <div class="card">
        <h2><a href="Small-Satellites">Small Satellites</a></h2>
        <p>Sub 500 kg class satellites - a platform for stand-alone payloads for earth imaging and science missions within a quick turn around time.</p>
      </div>
      <div class="card">
        <h2><a href="Student-Satellite">Student Satellites</a></h2>
        <p>ISRO's Student Satellite programme is envisaged to encourage various Universities and Institutions for the development of Nano/Pico Satellites.</p>
      </div>
    </div>
    <a href="index.jsp" class="logout-link">Logout</a>
  </div>

</body>
</html>