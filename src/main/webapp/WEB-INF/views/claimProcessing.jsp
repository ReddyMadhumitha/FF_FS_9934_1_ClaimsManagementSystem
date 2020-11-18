<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.List" %>
<%@ page import="com.hcl.claimsmanagementsystem.model.ClaimRequest" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Claims</title>
</head>
<body bgcolor="pink">
    <br>
    <br>
    <center>
    <h1>List of Claims Requests</h1>
    <table border="1px">
        <thead>
            <tr>
            <th>Id</th>
            <th>Claim Id</th>
            <th>Claim Information</th>
            <th>Claim Reason</th>
            <th>Member Id</th>
            <th>Status</th>
            </tr>
        </thead>


        <tbody>
            <c:forEach var="member" items="${members}">
        
                <tr>
                    <td>${member.getId()}</td>
                    <td>${member.getClaimId()}</td>
                    <td>${member.getClaimInformation()}</td>
                    <td>${member.getReason()}</td>
                    <td>${member.getMemberId()}</td>
                    <td>${member.getStatus()}</td>
                </tr>
            </c:forEach>
        </tbody>


    </table>
       <a href="homepage">Home</a>
    </center>
</body>
</html>




