<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body bgcolor="cyan">
	<div align="center">
		<h2>
			<%
				out.print("Your successfully login to Claims Managament System!!!");
			%>
		</h2>
		<h3>
			<a href="listMembers">View Member Requests</a>
		</h3>
		<br />
		<h3>
			<a href="claimsProcessing">Claims to be processed</a>
		</h3>
		<br />
		<h3>
			<a href="homepage">Home</a>
		</h3>
	</div>
</body>
</html>