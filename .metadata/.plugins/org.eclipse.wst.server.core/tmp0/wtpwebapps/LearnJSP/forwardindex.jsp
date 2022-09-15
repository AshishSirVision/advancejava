<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="DemoParam.jsp">

<jsp:param value="This is sent" name="sen"/>
<jsp:param value="This is sent" name="sen1"/>
<jsp:param value="This is sent" name="sen2"/>
<jsp:param value="This is sent" name="sen3"/>
<jsp:param value="This is sent" name="sen5"/>
<jsp:param value="This is sent" name="sen4"/>

</jsp:forward>
</body>
</html>