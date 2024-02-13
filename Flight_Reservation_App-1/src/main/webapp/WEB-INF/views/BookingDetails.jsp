<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Search Booking Details</title>
</head>

<body>
<form action="bookingSearch">
<h3> Booking Details</h3>
Booking ID: <input type="text" name="flightId">
<input type="submit" value="search">
<br>
<br>
${msg}
</form>
</body>
</html>