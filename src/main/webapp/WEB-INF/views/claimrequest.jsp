<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Claim Request</title>
</head>
<body bgcolor="violet">

	<div align="center">
		<h1>Welcome to Claim Request Page</h1>
		<form:form action="claimrequest" method="post" modelAttribute="claimreq">
			<table border=1>
				<tr>
					<td>Claim Information</td>
					<td><form:textarea  path="claimInformation"
							style="width: 120px" /><font color="red"><form:errors path="claimInformation"/></font></td>
				</tr>
				<tr>
					<td>Reason</td>
					<td><form:textarea  path="reason"
							style="width: 120px" /><font color="red"><form:errors path="reason"/></font></td>
				</tr>
				<tr>
					<td>Claim Id</td>
					<td><form:input type="number" path="claimId"
							style="width: 120px" /><font color="red"><form:errors path="claimId"/></font></td>
				</tr>
				<tr>
					<td>Member Id</td>
					<td><form:input type="number" path="memberId"
							style="width: 120px" /><font color="red"><form:errors path="memberId"/></font></td>
				</tr>
				
			</table>
			<input type="submit" value="Request">
		</form:form>
		<br></br>
	</div>
</body>
</html>