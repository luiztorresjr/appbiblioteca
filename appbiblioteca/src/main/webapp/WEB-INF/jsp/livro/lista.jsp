<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Lista de livros</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">

		<h4>
			<a href="/livro">Novo Livro</a>
		</h4>

		<h3>Livros: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Titulo</th>
					<th>ISBN</th>
					<th>Volume</th>
					<th>Data de lancamento</th>
					<th>Autores</th>
					<th>Numero de paginas</th>
					<th>Genero</th>
					<th>Idioma</th>
					<th>Editora</th>
					<th>Valor</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${listagem}">
					<tr>
						<td>${a.id }</td>
						<td>${a.titulo }</td>
						<td>${a.isbn}</td>
						<td>${a.volume}</td>
						<td>${a.dataLancamento}</td>
						<td>${a.autores}</td>
						<td>${a.numeroDePaginas}</td>
						<td>${a.genero}</td>
						<td>${a.idioma}</td>
						<td>${a.editora}</td>
						<td>${a.valor}</td>
						<td><a href="/livro/${a.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>