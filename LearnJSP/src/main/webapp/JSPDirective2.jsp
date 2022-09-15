<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page info="Hello java" %>
<%@ page buffer="88816kb" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Today is <%= new Date() %>
<hr/>
information <%= getServletInfo() %>
<%= response.getBufferSize() %>
</body>
</html>