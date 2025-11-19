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
<h3>
         <%
         String data=(String)request.getAttribute("message");
         out.println(data);
         
               session.invalidate();
         %>
         </h3>
         <jsp:include page="CustomerLogin.html"/>
         
</body>
</html>