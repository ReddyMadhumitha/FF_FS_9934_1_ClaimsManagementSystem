<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.List" %>
<%@ page import="com.hcl.claimsmanagementsystem.model.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Members</title>
</head>
<body>
    <br>
    <br>
    <center>
    <h1>List of Members</h1>
    <table border="1px">
        <thead>
            <tr>
            <th>Id</th>
            <th>Member Id</th>
            <th>Status</th>
            </tr>
        </thead>


        <tbody>
            <c:forEach var="member" items="${members}">
        
                <tr>
                    <td>${member.getId()}</td>
                    <td>${member.getUserId()}</td>
                    <td>${member.getStatus()}</td>
                </tr>
            </c:forEach>
        </tbody>


    </table>
    	<a href="updateStatus">Update Status</a>
    	<br />
       <a href="homepage">Home</a>
    </center>
</body>
</html>




