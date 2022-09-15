<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="4+5 is :${4+5}"/>
<c:import var="data" url="NewFile.html"/>  

	<c:out value="${data}"/>  
	
<c:set var="da" scope="session" value="Hello world"/>  
	<c:out value="${da}"/>  
	<h1>
	<a href="FirstJSTL.jsp">Click me</a>
	</h1>
</body>
</html>