<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro de Artigo</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Artigo:</h2>

		<form action="/livro/incluir" method="post">

			<c:import url="/WEB-INF/jsp/obra.jsp" />

			<div class="form-group">
				<label>Data de lançamento:</label> <input type="date"
					class="form-control"
					placeholder="Entre com o sua data de lançamento"
					name="dataLancamento">
			</div>
			<div class="form-group">
				<label>Volume:</label> <input type="number" min="1" step="1"
					class="form-control" placeholder="Entre com o volume" name="volume">
			</div>
			<div class="form-group">
				<label>Editora:</label> <input type="text" class="form-control"
					placeholder="Entre com a editora" name="editora">
			</div>
			<div class="form-group">
				<label>Preço:</label> <input type="number" class="form-control"
					placeholder="Entre com o preço do Livro" name="valor">
			</div>
			<div class="form-group">
				<label>ISBN:</label> <input type="text" class="form-control"
					placeholder="Entre com o ISBM" name="isbn">
			</div>

			<button type="submit" class="btn btn-defaul">Cadastrar</button>
		</form>
	</div>
</body>
</html>