<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>
</head>
<body>
<h1>You Have Successfully Logged out !!!</h1>
<a href="home.html" > Click Here to Login Again</a>
<%
session.invalidate();
%>

</body>
</html>