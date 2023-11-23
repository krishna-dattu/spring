<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
String ms = (String)request.getAttribute("msg");
out.println("Page belongs to "+ab.getfName()+"<br>");
out.println(ms);
%>
<a href="product.html">AddProduct</a>
<a href="viewProducts">ViewAllProducts</a>
<a href="logout">Logout</a>
</body>
</html>