<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 String name = request.getParameter("uname");
 String filName = (String)request.getAttribute("filName");
 String filValue = (String)request.getAttribute("filValue");
 out.println("Welcome User : "+name+"<br>");
 out.println("FilterName:"+filName+"<br>");
 out.println("FilValue:"+filValue+"<br>");
 %>
 <a href="input.html">Back</a>
</body>
</html>
