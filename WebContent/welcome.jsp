<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<%
if((Boolean)request.getSession().getAttribute("isAuthenticated")== null){
	String redirectURL = "index.jsp";
    response.sendRedirect(redirectURL);
}
%>
<form action="AuthServlet" method="post">
<button type="submit">Logout</button><br>
</form>
<br>
<h1>Hi, you can search any book you want </h1>
<form action="ResServlet" method="post">
  Enter the book you want:<br>
  <input type="text" name="bookName"><br>
  <button type="submit">Search</button><br>
</form>
</body>
</html>