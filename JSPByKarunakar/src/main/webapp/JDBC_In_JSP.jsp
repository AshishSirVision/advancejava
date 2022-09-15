<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
  Class.forName("com.mysql.jdbc.Driver");
   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
   Statement stmt=conn.createStatement();
   ResultSet rs=stmt.executeQuery("select * from emp");
   
%>
<table border="1">
  <tr>
      <th>id</th>
      <th>name</th>
      <th>address</th>
      <th>department</th>
  </tr>
  <% 
  while(rs.next())
  {
  %>
  <tr>
      <th><%= rs.getString(1) %></th>
      <th><%= rs.getString(2) %></th>
      <th><%= rs.getString(3) %></th>
      <th><%= rs.getString(4) %></th>
  </tr>  
  <% } %>
</table>

</body>
</html>