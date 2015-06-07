<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saveUser">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" />
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" />
			</tr>			

			<tr>
				<td>Authority</td>
				<td><input type="text" name="authority" />
			</tr>
			<tr>
				<td>Enabled</td>
				<td><input type="checkbox" name="enabled" checked="checked"/>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>