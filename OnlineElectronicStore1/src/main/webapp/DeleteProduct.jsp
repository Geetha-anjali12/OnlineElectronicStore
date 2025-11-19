<%@page import="pack1.AdminBean"%>
<%@page import="pack1.ProductBean"%>
<%@page import="pack1.AdminBean"%>
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
AdminBean abean=(AdminBean)session.getAttribute("abean");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
out.println("Hello "+abean.getFname()+"<br><br>"+"product deleted");
out.println("<br><br>");
%>
<a href="AddProduct.html">Add Product</a></br></br>
<a href="view1">View Product</a></br></br>
<a href="logout">Logout</a></br></br>
</h1>
</body>
</html>