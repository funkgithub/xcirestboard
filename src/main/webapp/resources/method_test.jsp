<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
  $(document).ready(function() {
	  $('#mybutton').click(function(){
		  $.ajax({
			  method: $('#mymethod').val(),
			  url: '<c:url value="/rest2/" />'
			})
			  .done(function( msg ) {
			    alert( "Data Get: " + msg );
			});
	  });
  });
  </script>
</head>
<body>
<form id="myform">
<select id="mymethod">
	<option>GET</option>
	<option>POST</option>
	<option>PUT</option>
	<option>DELETE</option>
</select>
<input type="button" value="ok" id="mybutton" />
</form>
</body>
</html>
