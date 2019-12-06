<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de controle de estágio</title>
</head>
<body>
	<h1>Login</h1>
	<form action = "/login" method = "post">
		<span> Login/Email:</span> <input type = "text" name = "login" placeholder = "Digite ou login ou email"/> <br>
		<span> Password </span> <input type = "password" name = "password" placeholder = "Digite a senha "/> <br>
		<input type = 'submit' value = 'Login'/>
		<select name="type">
			<option value="student">Student</option>
			<option value="company">Company</option>
			<option value="administrator">Administrator</option>
			<option value="supervisor">Supervisor</option>
		</select>
	</form>	
</body>
</html>