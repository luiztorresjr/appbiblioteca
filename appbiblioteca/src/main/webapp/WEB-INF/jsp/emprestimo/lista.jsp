<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de emprestimos</title>
</head>
<body>
<div class="container mt-3">
<h3>Emprestimos: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>Id</th>
				<th>Consulente</th>
				<th>Data de retirada</th>
				<th>Data de devolução</th>
				<th>Atrasado</th>
				<th>Obras</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listagem}">
				<tr>
					<td>${c.id }</td>
					<td>${c.consulente }</td>
					<td>${c.dataRetirada}</td>
					<td>${c.dataDevolucao}</td>
					<td>${c.atrasado}</td>
					<td>${c.obras}</td>
					<td><a href="/emprestimo/${c.id}/excluir">excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>