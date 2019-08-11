<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error new password</title>
</head>
<body>
<h2>new password and confirm doesnot matched</h2>
<form action="http://localhost:9090/bankapplication/newPassword">
<table>
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