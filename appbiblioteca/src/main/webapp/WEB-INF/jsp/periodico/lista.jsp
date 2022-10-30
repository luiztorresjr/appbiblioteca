<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de Periodicos</title>
</head>
<body>
<div class="container mt-3">
<h3>Periodicos: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Numero de paginas</th>
				<th>Generos</th>
				<th>Idioma</th>
				<th>Numero de edicao</th>
				<th>Redatores</th>
				<th>Editora</th>
				<th>Periodicidade</th>
				<th>Valor</th>
				<th>Data de publicacao</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listagem}">
				<tr>
					<td>${c.id }</td>
					<td>${c.titulo }</td>
					<td>${c.numeroDePaginas}</td>
					<td>${c.genero}</td>
					<td>${c.idioma}</td>
					<td>${c.numeroEdicao}</td>
					<td>${c.redatores}</td>
					<td>${c.editora}</td>
					<td>${c.periodicidade}</td>
					<td>${c.valor}</td>
					<td>${c.dataPublicacao}</td>
					<td><a href="/periodico/${c.id}/excluir">excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>