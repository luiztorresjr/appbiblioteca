<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro de Periodico</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
		<h2>Periodico:</h2>
		
		<form action="/periodico/incluir" method="post">
			<div class="form-group">
				<label>Registro:</label>
				<input type="number" min="0" step="1" class="form-control" placeholder="Entre com o Registro" name="registro">
			</div>
			<div class="form-group">
				<label>Titulo:</label>
				<input type="text" class="form-control" placeholder="Entre com o Titulo" name="titulo">
			</div>
			<div class="form-group">
				<label>Numero de paginas:</label>
				<input type="number" min="0" step="1" class="form-control" placeholder="Entre com o Titulo" name="numeroDePaginas">
			</div>
			<div class="form-group">
				<label>Autores:(D� enter entre cada autor)</label>
				<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="autores"></textarea>
			</div>
			<div class="form-group">
				<label>Genero:(D� enter entre cada genero)</label>
				<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="genero"></textarea>
			</div>
			<div class="form-group">
				<label>Numero da edi��o:</label>
				<input type="number" min="0" step="1" class="form-control" placeholder="Entre com o Titulo" name="numeroDePaginas">
			</div>
			<div class="form-group">
				<label>Editora:</label>
				<input type="text"  class="form-control" placeholder="Entre com o Titulo" name="numeroDePaginas">
			</div>
			<div class="form-group">
				<label>Periodicidade:</label>
				<input type="number" min="1" step="1" class="form-control" placeholder="Entre com o Titulo" name="numeroDePaginas">
			</div>
			<div class="form-group">
				<label>Pre�o:</label>
				<input type="number"  class="form-control" placeholder="Entre com o Titulo" name="numeroDePaginas">
			</div>
			<div class="form-group">
				<label>Data da publica��o:</label>
				<input type="date"  class="form-control" placeholder="Entre com o Titulo" name="numeroDePaginas">
			</div>
			<button type="submit" class="btn btn-defaul">Cadastrar</button>
		</form>
		</div>
</body>
</html>