<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Artigos</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
  <h3>Artigos: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Subtitulo</th>
				<th>Assunto</th>
				<th>Numero de paginas</th>
				<th>Local</th>
				<th>Data de Publicacao</th>
				<th>Autores</th>
				<th>Generos</th>
				<th>Idioma</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${listagem}">
				<tr>
					<td>${a.id }</td>
					<td>${a.titulo }</td>
					<td>${a.subtitulo}</td>
					<td>${a.assunto}</td>
					<td>${a.numeroDePaginas}</td>
					<td>${a.local}</td>
					<td>${a.dataPublicacao}</td>
					<td>${a.autores}</td>
					<td>${a.genero}</td>
					<td>${a.idioma}</td>
					<td><a href="/artigo/${a.id}/excluir">excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>