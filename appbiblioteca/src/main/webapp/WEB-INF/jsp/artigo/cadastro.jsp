<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro de Artigo</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Artigo:</h2>
		
		<form action="/artigo/incluir" method="post">
			
			<c:import url="/WEB-INF/jsp/obra.jsp"/>
			
			<div class="form-group">
				<label>Subtitulo:</label>
				<input type="text" class="form-control" placeholder="Entre com o Subtitulo" name="subtitulo">
			</div>
			
			<div class="form-group">
				<label>Data de publicação:</label>
				<input type="date" class="form-control" placeholder="Entre com o sua data de publicação" name="dataPublicacao">
			</div>
			<div class="form-group">
				<label>Local:</label>
				<input type="text" class="form-control" placeholder="Entre com o local publicado" name="local">
			</div>
	
			<div class="form-group">
				<label>Assunto principal:</label>
				<input type="text" class="form-control" placeholder="Entre com o local Assunto" name="assunto">
			</div>
			<button type="submit" class="btn btn-defaul">Cadastrar</button>
		</form>
	</div>
</body>
</html>