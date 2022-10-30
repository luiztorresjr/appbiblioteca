<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de Consulentes</title>
</head>
<body>
	<div class="container mt-3">
	<h3>Consulentes: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>Registro</th>
				<th>Nome</th>
				<th>Data de nascimento</th>
				<th>RG</th>
				<th>Telefone</th>
				<th>Endereco</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="a" items="${listagem}">
				<tr>
					<td> ${a.registro } </td>
					<td>${a.nome }</td>
					<td>${a.dataNascimento }</td>
					<td>${a.rg }</td>
					<td>${a.telefone }</td>
					<td>${a.endereco }</td>
					<td><a href="/consulente/${a.registro}/excluir">excluir</a></td>
				</tr>
			</c:forEach>			
			</tbody>
		</table>
	</div>
</body>
</html>