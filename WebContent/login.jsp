<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>

<form action="LoginServlet" method="post">
	<TABLE>
		<tr>
			<td>Usuario </td>
			<td><INPUT type="text" name="user"></td>
		</tr>
		<tr>
			<td>Senha </td>
			<td><INPUT type="text" name="password"></td>
		</tr>
		<tr>
			<td colspan="2"><INPUT type="submit" value="Ok"></td>
		</tr>	
	</TABLE>
</form>
</body>
</html>