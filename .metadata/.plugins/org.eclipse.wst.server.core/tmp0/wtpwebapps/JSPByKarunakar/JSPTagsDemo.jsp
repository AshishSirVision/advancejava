<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//This is scriplet tag
	for (int i = 10; i > 0; i--) {
		
		for (int k = i; k < 10; k++) {
			out.println("*");
		}
		out.print("<br>");
	}
	%>
</body>
</html>