<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
<%
if((Boolean)request.getSession().getAttribute("error")== null){
	String redirectURL = "index.jsp";
    response.sendRedirect(redirectURL);
    request.getSession().setAttribute("error", null);
}
%>
The Authentication failed !
<br><br>
<a href ="index.jsp">Go back to authentication page</a>
</body>
</html>