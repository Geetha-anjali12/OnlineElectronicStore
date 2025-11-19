<%@page import="pack1.CustomerBean" %>
<%@page import="pack1.ProductBean" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
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
ArrayList<ProductBean> al2=(ArrayList<ProductBean>)session.getAttribute("productlist1");
out.println("<u>Hello "+cbean.getCname()+"</u><br><br>"+"These are Product details!!!<br><br>");

if(al2.size()==0)
{
	out.println("Products are available");
	
	
}
else
{
	
	Iterator<ProductBean> i=al2.iterator();
	while(i.hasNext())
	{
		ProductBean pb=i.next();
		out.println(pb.getPcode()+" "+pb.getPname()+" "+pb.getPcompany()+" "+pb.getPprice()+" "+pb.getPqty()+"    "
		                             +"<a href='Buy?pcode="+pb.getPcode()+"'>Buy</a>"
		                          +"<br><br>");
}
}
%>
</h1>

</body>
</html>