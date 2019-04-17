<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book reservation</title>
</head>
<body>
<h1>Welcome on the best book reservation website</h1>
<h2>Please provide username and password to login</h2>
<form action="AuthServlet" method="post">
  Username:<br>
  <input type="text" name="username"><br>
  Password:<br>
  <input type="password" name="password"><br>
  <button type="submit">Enter</button><br>
</form>
</body>
</html>