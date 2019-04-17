<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<h1>Hi, you can search any book you want </h1>
<form action="ResServlet" method="post">
  Enter the book you want:<br>
  <input type="text" name="bookName"><br>
  <button type="submit">Search</button><br>
</form>
</body>
</html>