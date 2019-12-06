<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de controle de estágio</title>
</head>
<body>
	<h1> Registrar Estudante</h1>
	<form action="./newStudent" method = "post">
		<span> Nome:</span> <input type = "text" name = "name" id = "name" placeholder = "Digite seu nome"/> <br>
		<span> CPF:</span> <input type = "text" name = "cpf" id = "cpf" placeholder = "Digite seu CPF"/> <br>
		<span> RG:</span> <input type = "text" name = "rg" id="rg" placeholder = "Digite seu RG"/> <br>
		<span> Data de aniversario:</span> <input type = "date" name = "birthday" id="date" placeholder = "Digite sua data de aniversário"/> <br>
		<input type = 'submit' value = 'Enviar dados'/>
	</form>

<script>
	function send(e) {
		fetch("./students", {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body: JSON.stringify({
				name: document.getElementById("name").value,
				cpf: document.getElementById("cpf").value,
				rg: document.getElementById("rg").value,
				date: document.getElementById("date").value
			})
		}).then(
			function (response) {
				console.log(response);
			}
		)
	}
</script>
	
</body>
</html>