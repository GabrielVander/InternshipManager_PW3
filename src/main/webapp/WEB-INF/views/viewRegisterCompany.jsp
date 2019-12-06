<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de controle de est�gio</title>
</head>
<body>
	<h1> Registrar Empresa</h1>
	<form action = "./newCompany" method = "post">
		<span> Nome:</span> <input type = "text" name = "name" placeholder = "Digite o nome "/> <br>
		<span> CNPJ:</span> <input type = "text" name = "cnpj" placeholder = "Digite o CNPJ "/> <br>
		<span> E-mail:</span> <input type = "email" name = "email" placeholder = "Digite o email"/> <br>
		<span> endere�o:</span> <input type = "text" name = "address" placeholder = "Digite o endere�o"/> <br>
		<input type = 'submit' value = 'Enviar dados'/>
	</form>
	
</body>
</html>