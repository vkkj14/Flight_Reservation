<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH FLIGHTS</title>
</head>
<body>
<h3>FIND FLIGHTS</h3>
<form action = "findFlights" method = "post">
<pre>
    FROM: <input type ="text" name = "from"/>
     TO: <input type ="text" name = "to"/>
     DEPARTURE DATE:<input type = "text" name = "departureDate"/>
<input type = "Submit" value = "Search"/>
</pre>
</form>
<form  action="bookingDetails">
<h3>Booking Details</h3>
<input type="submit" value="Search"/>

</form>
</body>
</html>