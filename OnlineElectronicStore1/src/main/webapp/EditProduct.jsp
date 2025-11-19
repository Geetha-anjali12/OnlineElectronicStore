
<%@page import="pack1.AdminBean"%>
<%@page import="pack1.ProductBean"%>
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
out.println("Hello "+abean.getFname()+" Please Edit");

%>
<form action="update" method="post">
Product price:<input type="text" name="Pprice" value="<%= pb.getPprice() %>"/></br></br>
Product quantity:<input type="text" name="Pqty" value="<%= pb.getPqty() %>"/></br></br>
<input type="hidden" name="pcode" value="<%= pb.getPcode() %>"/>
<input type="submit" value="update"/></br></br>
</form>
</h1>
</body>
</html>