<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Link.html"%>
	<%
	String name = request.getParameter("fname");
	String password = request.getParameter("pass");
	if (password.equals("admin123")) {
		out.println("<br/><br/>Welcome, " + name);
		session.setAttribute("name", name);
	} else {
		out.println("<hr/>Sorry,username or password error!<br/><br/>");
	%>
	<%@ include file="login.html"%>
	<%
	}
	%>
</body>
</html>