<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Consulentes</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	<h3>Consulentes: ${listagem.size()}</h3>
	
	<h4><a href="/consulente">Novo Consulente</a></h4>
	
		<table class="table table-striped">
			<thead>
				<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>RG</th>
				<th>Telefone</th>
				<th>Email</th>
				<th>Endereco</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="a" items="${listagem}">
				<tr>
					<td> ${a.id } </td>
					<td>${a.nome }</td>
					<td>${a.rg }</td>
					<td>${a.telefone }</td>
					<td>${a.email }</td>
					<td>${a.endereco.logradouro }</td>
					<td><a href="/consulente/${a.id}/excluir">excluir</a></td>
				</tr>
			</c:forEach>			
			</tbody>
		</table>
	</div>
</body>
</html>