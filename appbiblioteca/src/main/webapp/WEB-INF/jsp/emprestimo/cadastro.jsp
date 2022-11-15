<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Pedidos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Emprestimo</h2>
	  <form action="/emprestimo/incluir" method="post">
	    <div class="form-group">
	      <label>Data de retirada:</label>
	      <input type="date" class="form-control" name="dataRetirada">
	    </div>
	    <div class="form-group">
	      <label>Data de devolucao:</label>
	      <input type="date" class="form-control" name="dataDevolucao">
	    </div>
	    <div class="form-group">
	      <label>Atrasado:</label>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="atrasado" value="true"> Sim
			  <label class="form-check-label"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="atrasado" value="false"> nao
			  <label class="form-check-label"></label>
			</div>
	    </div>

		 <div class="form-group">
	      <label>Consulente:</label>
	      <select name="consulente.id" class="form-control">
	      	<c:forEach var="s" items="${consulentes}">
	      		<option value="${s.id}">${s.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>


	    <div class="form-group">
	      <label>Obras:</label>
	      	<c:forEach var="o" items="${obras}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="obras" value="${o.id}">
				  <label class="form-check-label"> ${o.titulo}</label>
				</div>	   
			</c:forEach>   
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>