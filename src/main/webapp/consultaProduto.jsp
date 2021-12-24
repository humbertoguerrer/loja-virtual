<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" href="css/lojaStyle.css">

<meta charset="ISO-8859-1">
<title>Loja Virtual</title>
</head>
<body>
	<nav class="lojaNav">
		<ul>
			<li><span style="color: white">Loja Virtual</span></li>
			<li><img src="img/encomenda.png" height="20px"></li>
			<li><a href="cadastraProduto.jsp">Cadastrar Produto</a></li>
			<li><a href="consultaProduto.jsp">Consultar Produto</a></li>
		</ul>
	</nav>
	<main class="lojaMain">
		<form action="" method="post" class="lojaForm">
			<div>
				<label><strong>Busca pela Descrição:</strong></label><input type="text"
					name="descricao">
			</div>
			<br>
			<div>
				<input id="lojaButton" type="submit" name="salvar"
					value="Consultar Produto">
			</div>
		</form>
	</main>
</body>
</html>