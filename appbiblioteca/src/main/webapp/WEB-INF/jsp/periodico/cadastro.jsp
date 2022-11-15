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
		
		<c:import url="/WEB-INF/jsp/obra.jsp"/>
			
			<div class="form-group">
				<label>Numero da edição:</label>
				<input type="number" min="0" step="1" class="form-control" placeholder="Entre com o numero da edicao" name="numeroEdicao">
			</div>
			<div class="form-group">
				<label>Editora:</label>
				<input type="text"  class="form-control" placeholder="Entre com o Titulo" name="editora">
			</div>
			<div class="form-group">
				<label>Periodicidade:</label>
				<input type="number" min="1" step="1" class="form-control" placeholder="Entre com o Periocidade" name="periodicidade">
			</div>
			<div class="form-group">
				<label>Preço:</label>
				<input type="number"  class="form-control" placeholder="Entre com o valor" name="valor">
			</div>
			<div class="form-group">
				<label>Data da publicação:</label>
				<input type="date"  class="form-control" placeholder="Entre com de publicacao" name="dataPublicacao">
			</div>
			<button type="submit" class="btn btn-defaul">Cadastrar</button>
		</form>
		</div>
</body>
</html>