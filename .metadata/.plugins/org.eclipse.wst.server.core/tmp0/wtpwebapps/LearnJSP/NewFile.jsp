<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="Style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from emp");
	%><div class="header">
		<h1>id</h1>
		<h1>name</h1>
		<h1>address</h1>
	</div>
	<div class="row">
	<div class="id">
	<%
	int i=0;
	while (rs.next()) {
		i++;
	%>
	<h2><%=rs.getString(1)%></h2>
	<%} %>
	</div><div class="name">
	<%
	 i=0;
	ResultSet rs2 = stmt.executeQuery("select * from emp");
	while (rs.next()) {
		i++;
	%>
	<h2><%=rs.getString(2)%></h2>
	<%} %>
	</div><div class="address">
	<%
	 i=0;
	ResultSet rs3 = stmt.executeQuery("select * from emp");
	while (rs.next()) {
		i++;
	%>
	<h2><%=rs.getString(3)%></h2>
	<%} %>
	</div>
	</div>
</body>
</html>