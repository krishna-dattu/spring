<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
ProductBean pb = (ProductBean)request.getAttribute("pb");
out.println("Page of "+ab.getfName()+"<br>");
%>
<form action="updateProduct" method="post">
<input type="hidden" name="code" value=<%=pb.getpCode() %>>
ProductPrice:<input type="text" name="price" value=<%=pb.getpPrice() %>><br>
ProductQty:<input type="text" name="qty" value=<%=pb.getpQty() %>><br>
<input type="submit" value="UpdateProduct">
</form>

</body>
</html>