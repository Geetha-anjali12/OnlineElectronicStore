<%@page  import="pack1.CustomerBean"%>
<%@page  import="pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>
<%
CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
out.print("Hello " + cbean.getFname());
double finalprice=(double)request.getAttribute("FinalPrice");
out.print("<strong>You Have Charged : " + finalprice + "</strong><br><br>");
out.print("<strong>Your Order is Placed Successfully</strong>");
out.println("<br><br>");
%>
<a href="view2">View Products</a></br></br>
<a href="Logout1">Logout</a>
</h1>
</body>
</html>