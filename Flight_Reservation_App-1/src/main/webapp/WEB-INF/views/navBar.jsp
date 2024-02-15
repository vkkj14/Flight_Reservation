<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet"  href="/css/styles.css"></link>

</head>
<body>

<!-- NavBar -->
<form action="#">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">Flights</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Hotels</a>
        </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Sign in</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Sign Up</a>
        </li>
      </ul>
      
  </div>
  
</nav>
</form>
<!-- End NavBar -->

<div>
<img class="img-Fluid" alt="Loading" src="/image/img.png">

<!-- Bottom Image -->
	
	<div class="flight-section">
	 <div class="box1 box">
            <div class="box-content">
                <h6>City1</h6>
                <div class="box-img" style="background-image: url('/image/img-1.jpg');"></div>
                <p>See more</p>
            </div>
        </div>
         <div class="box2 box">
            <div class="box-content">
                <h6>City2</h6>
                <div class="box-img" style="background-image: url('/image/img-2.jpg');"></div>
                <p>See more</p>
            </div>
        </div>
         <div class="box3 box">
            <div class="box-content">
                <h6>City3</h6>
                <div class="box-img" style="background-image: url('/image/img-3.jpg');"></div>
                <p>See more</p>
            </div>
        </div>
        
	</div>
	<div>
	<div class="landscape">
	        <div class="land-content">
                <h6>City4</h6>
                <div class="land-img" style="background-image: url('/image/land2.jpg');"></div>
                <p>See more</p>
            </div>
        </div>
	</div>
	
	<!-- End Bottom Image -->
</div>

</body>
</html>