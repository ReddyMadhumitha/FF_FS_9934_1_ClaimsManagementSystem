<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Amount</title>
</head>
<body bgcolor="pink">

	<div align="center">
		<h1>Welcome to Request Amount Page</h1>
		<form:form action="payment" method="post" modelAttribute="payment">
			<table border=1>
				<tr>
					<td>Claim Id</td>
					<td><form:input type="number" path="claimId"
							style="width: 120px" /><font color="red"><form:errors path="claimId"/></font></td>
				</tr>
				<tr>
					<td>Request Amount</td>
					<td><form:input type="number" path="requestAmount"
							style="width: 120px" /><font color="red"><form:errors path="requestAmount"/></font></td>
				</tr>
			</table>
			<input type="submit" value="Request">
		</form:form>
		<br></br>
	</div>
</body>
</html>