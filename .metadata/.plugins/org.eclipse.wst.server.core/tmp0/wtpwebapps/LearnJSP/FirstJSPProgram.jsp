<!-- directive tag below -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- jsp comment tag --%>

<%!
//declararion tag
int num1;
int num2;
int max;
%>

<%
//scriplet tag
num1=Integer.parseInt(request.getParameter("num1"));
num2=Integer.parseInt(request.getParameter("num2"));

if(num1>num2)
{
	max=num1;
}
else
{
	max=num2;
}


%>

<%= 
//expression tag 
max+" is greatar"
%>
</body>
</html>