<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="e" class="p1.Employee"/>  
	<%
	e.setId(111);//setproperty
	e.setName("Arjun");// setting value to the object
	System.out.println(e.getName());
	System.out.println(e.getId());//getproperty
	
	%>
</body>
</html>