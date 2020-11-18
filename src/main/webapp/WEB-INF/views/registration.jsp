<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body bgcolor="cyan">

	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="user">
			<table border=1>
				<tr>
					<td>User Id</td>
					<td><form:input type="number" path="userId"
							style="width: 120px" /><font color="red"><form:errors path="userId"/></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors path="password"/></font></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><form:input type="password" path="confirmPassword"
							style="width: 120px" /></td>
				</tr>
				<tr>

					<td>Role</td>

					<td><form:select path="roleId" id="roleId"
							style="width: 127px">

							<option value=1>Member</option>

							<option value=2>Admin</option>

						</form:select></td>

				</tr>
			</table>
			<input type="submit" value="Register">
		</form:form>
		<br></br> Already Registered?<a href="login">Login</a>
	</div>
</body>
</html>