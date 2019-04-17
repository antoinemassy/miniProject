<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
<%
		Boolean isAvailable = (Boolean) request.getAttribute("available");
		String available = isAvailable ? "no" : "yes";
		String name = (String) request.getAttribute("bookName");
		out.println(name);
		out.println(" is now reserved by you : ");
		out.println(available);
%>
<br>
<a href ="books.jsp">Go back to books page</a>
</body>
</html>