<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
//declararion tag
int num1,fact=1;
%>

<%
//scriplet tag
num1=5;//Integer.parseInt(request.getParameter("num1"));

for(int i=1;i<=5;i++)
{
	fact=fact*i;
}

%>

<%= 
//expression tag 
"factorial of "+num1+" is "+fact
%>
</body>
</html>