<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de controle de est�gio</title>
</head>
<body>
	<h1> Registrar Supervisor</h1>
	<form action = "./newSupervisor" method = "post">
		<span> CPF:</span> <input type = "text" name = "cpf" placeholder = "Digite o CPF"/> <br>
		<input type = 'submit' value = 'Enviar dados'/>
	</form>
	
</body>
</html>