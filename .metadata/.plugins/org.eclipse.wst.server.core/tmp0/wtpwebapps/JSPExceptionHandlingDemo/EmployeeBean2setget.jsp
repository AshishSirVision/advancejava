<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="p1.Employee">
	
	</jsp:useBean>  
	
	<jsp:setProperty name="obj" property="id" value="113" /> 
	<jsp:setProperty name="obj" property="name" value="Aaknsha" /> 
	
		<jsp:getProperty property="id" name="obj"/><br>  
		<jsp:getProperty property="name" name="obj"/><br>  
		 
	
</body>
</html>