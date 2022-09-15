<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="dbconn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" 
user="root" password=""/>

${"connection established successfully"}
<sql:query dataSource="${dbconn}" var="rs">
select * from student;
</sql:query>

<table>
  <tr>
  <td>id</td>
  <td>fname</td>
  <td>lname</td>
  <td>age</td>
 
  </tr>
		<c:forEach var="rowdata" items="${rs.rows }">
			<tr>
				<td><c:out value="${rowdata.id}"></c:out></td>
				<td><c:out value="${rowdata.firstname}"></c:out></td>
				<td><c:out value="${rowdata.lastname}"></c:out></td>
				<td><c:out value="${rowdata.age}"></c:out></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>