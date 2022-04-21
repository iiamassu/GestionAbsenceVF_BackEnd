<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "margin-left:40%">
<form action="" method="POST">
<h1>Login</h1>

	<span style="color:red">${erreur}</span>
	<table>
		<tr><th>Username :</th><th><input type="text" name="username" ></th></tr>
		<tr><th>Password :</th><th><input type="text" name="motdepass" ></th></tr>
		<tr><th><button style = "margin-left:10px">Login</button></th></tr>
	</table>
	</form>
</body>
</html>