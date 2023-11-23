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
String ms = (String)request.getAttribute("msg");
out.println(ms);
%>
<jsp:include page="home.html"/>

</body>
</html>