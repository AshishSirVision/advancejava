<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Link.html" %>
<%
	request.getSession(false);
	if(session!= null){
		String name=(String) session.getAttribute("name");
		out.print("<hr/>Hello, " + name + " Welcome to Profile");
	}
	else{
		out.print("Please login first");
		%>
		<%@ include file="login.html" %>
<%
}
%>
</body>
</html>