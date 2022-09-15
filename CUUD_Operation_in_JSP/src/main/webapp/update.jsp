<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
				<head>
				<meta charset="ISO-8859-1">
				<title>Insert title here</title>
				</head>
				<body>
					<form action="EditServlet" method="post">
						<table>
							<tr>
								<td>Id:</td>
								<td><input type="text" name="id1" value="<%=Integer.parseInt(request.getParameter("id")) %>" readonly="readonly"/></td>
							</tr>
							<tr>
								<td>Name:</td>
								<td><input type="text" name="name1" /></td>
							</tr>
							<tr>
								<td>Age:</td>
								<td><input type="text" name="age1" /></td>
							</tr>
							<tr>
								<td>Course:</td>
								<td><input type="text" name="course1" /></td>
							</tr>
							<tr>
								<td>City:</td>
								<td><select name="city1" style="width: 150px">
										<option>Delhi</option>
										<option>Noida</option>
										<option>Raipur</option>
										<option>Bhopal</option>
								</select></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="Update" /></td>
							</tr>
						</table>
					</form>
					<br />
					<a href="ViewServlet1">View Student</a>
				</body>
				</html>"