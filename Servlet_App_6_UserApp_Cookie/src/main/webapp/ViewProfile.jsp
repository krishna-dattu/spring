<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)request.getAttribute("fName");
UserBean ub = (UserBean)application.getAttribute("ubean");
out.println("Page belongs to "+fName+"<br>");
out.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()
           +"&nbsp&nbsp"+ub.getAddr()+"&nbsp&nbsp"+
		ub.getmId()+"&nbsp&nbsp"+ub.getPhNo()+"<br>");
%>
<a href="edit">EditProfile</a>
<a href="logout">Logout</a>

</body>
</html>