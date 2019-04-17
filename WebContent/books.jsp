<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
	<%
		Boolean isExisting = (Boolean) request.getAttribute("exist");
		Boolean isAvailable = (Boolean) request.getAttribute("available");
		if (isExisting!= null && isAvailable!= null) {
			if(isExisting){
			out.println("The book exists");
			if (isAvailable) {
			out.println(" and the book is available");
	%>
	<form action="ResServlet" method="post">
		Do you want to reserve it :<br> 
		<input type="radio" name="reserve" value="yes"> 
		<label for="yes">Yes</label> 
		<input type="radio" name="reserve" value="no"  checked> 
		<label for="no">No</label><br>
		<button type="submit">Submit</button>
		<br>
	</form>
	<%
		} else {
		out.println(" but the book is not available");
			}
			} else {
				out.println("The book does not exist");
			}}
		%>
<form action="ResServlet" method="post">
 Enter the book you want:<br>
 <input type="text" name="bookName"><br>
 <button type="submit">Search</button><br>
</form>
<br>
<%
String books = (String) request.getAttribute("books");
out.println(books);
%>
</body>
</html>