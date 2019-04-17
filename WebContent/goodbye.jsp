<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Good bye</title>
</head>
<body>
<%
if((Boolean)request.getSession().getAttribute("isAuthenticated")== null){
	String redirectURL = "index.jsp";
    response.sendRedirect(redirectURL);
}
%>
<h1>Good Bye !</h1>
<p>See you soon on our book reservation web site.</p>
</body>
</html>