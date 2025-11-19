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
ProductBean pb=(ProductBean)request.getAttribute("pbean");

%>
<form action="update1" method="post">
Product code:<input type="text" name="Pcode" value="<%= pb.getPcode() %>"/></br></br>
Product name:<input type="text" name="Pname" value="<%= pb.getPname() %>"/></br></br>
Product company:<input type="text" name="Pcomp" value="<%= pb.getPcompany() %>"/></br></br>
Product price:<input type="text" name="Pprice" value="<%= pb.getPprice() %>"/></br></br>
Product quantity:<input type="text" name="Pqty" value="<%= pb.getPqty() %>"/></br></br>
ReqNo <input type="text" name="reqno"/>
<input type="submit" value="Buy"/></br></br>
</form>
</h1>
</body>
</html>