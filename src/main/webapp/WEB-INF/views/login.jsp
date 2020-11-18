<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body bgcolor="violet">

	<div align="center">
		<h1>Welcome to Login Page</h1>
		<form:form action="login" method="post" modelAttribute="credential">
			<table border=1>
				<tr>
					<td>User Id</td>
					<td><form:input type="text" path="userId" name="userId"
							style="width: 120px" /><font color="red"><form:errors path="userId"/></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							name="password" style="width: 120px" /><font color="red"><form:errors path="password"/></font></td>
				</tr>

			</table>
			<input type="submit" value="Login">
		</form:form>
		<br></br> Not registered?<a href="registration">Register</a>
	</div>
</body>
</html>