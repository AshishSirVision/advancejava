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
String s=request.getParameter("sen");
out.print("Sentance displayed :"+s);
 s=request.getParameter("sen2");
out.print("Sentance displayed :"+s);

 s=request.getParameter("sen3");
out.print("Sentance displayed :"+s);


 s=request.getParameter("sen5");
out.print("Sentance displayed :"+s);

 s=request.getParameter("sen4");
out.print("Sentance displayed :"+s);
%>
</body>
</html>