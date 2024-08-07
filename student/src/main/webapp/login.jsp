<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>student login</h1><br>
<form action="login" method="post">
    <div align="center">
        <label for="userName">Name:</label>
        <input type="text" id="userName" name="userName" required>
    </div>
    <div align="center">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <div align="center">
        <input type="submit" value="Login">
    </div>
</form>
</body>
</html>