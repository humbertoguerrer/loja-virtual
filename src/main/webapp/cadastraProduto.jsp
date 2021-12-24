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
				<label><strong>Descrição:</strong></label><input type="text"
					name="descricao" placeholder="Descreva o produto">
			</div>
			<div>
				<label><strong>Quantidade:</strong></label><input type="text"
					name="quantidade" placeholder="Insira a quantidade de produto">
			</div>
			<div>
				<label><strong>Preço:</strong></label><input type="number"
					name="preco" placeholder="Insira o preço o produto">
			</div>

			<label><strong>Disponível On-Line:</strong></label><input
				type="checkbox" name="online">
			<br>
			<div>
				<input id="lojaButton" type="submit" name="salvar"
					value="Cadastrar Produto">
			</div>
		</form>
	</main>
</body>
</html>