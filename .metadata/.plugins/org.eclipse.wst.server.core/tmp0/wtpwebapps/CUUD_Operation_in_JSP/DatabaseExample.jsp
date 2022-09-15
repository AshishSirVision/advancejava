<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
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
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
		Statement stmt = conn.createStatement();
		   ResultSet rs=stmt.executeQuery("select * from student;");
	%>
	<table border="1">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Age</th>
	<th>Course</th>
	<th>City</th>
	</tr>
	<% while(rs.next()){%>
	<tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	</tr>
	<%} %>
	</table>
</body>
</html>