<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="get">
<%response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); %>
Enter username: <input type="text" name="uname"><br>
Enter passwrd: <input type="password" name="pass"><br>
<input type="submit" value="login">
</form>
</body>
</html>