<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>password</title>
</head>
<body>
<form action="http://localhost:9090/bankapplication/ChangePassword">
<table>
<tr>
<td><label>Old Password</label></td>
<td><input type="text" name="OPW"/></td>
</tr>
<tr>
<td><label>New Password</label></td>
<td><input type="text" name="NPW"/></td>
</tr>
<tr>
<td><label>Conform New Password</label></td>
<td><input type="text" name="CNPW"/></td>
</tr>
<tr>
<td><input type="submit" value="SUBMIT"/></td>
</tr>
</table>
</form>
</body>
</html>