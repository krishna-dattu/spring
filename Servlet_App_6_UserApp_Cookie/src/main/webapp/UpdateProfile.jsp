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
String fName = (String)request.getAttribute("fName");
String ms = (String)request.getAttribute("msg");
out.println("Page belongs to "+fName+"<br>");
out.println(ms);
%>
<a href="view">ViewProfile</a>
<a href="edit">EditProfile</a>
<a href="logout">Logout</a>

</body>
</html>