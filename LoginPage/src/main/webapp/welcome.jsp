<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("name")==null){
response.sendRedirect("login.jsp");	
}
%>
Welcome ${name}

<a href="video.jsp">Videos</a>
<form action="logout">
<input type="submit" value="logout">
</form>
</body>
</html>