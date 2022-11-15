<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	    <div class="form-group">
	      <label>Registro:</label>
	      <input type="text" class="form-control" placeholder="Entre com o registro"  name="registro">
	    </div>
	    
	    <div class="form-group">
	      <label>Titulo:</label>
	      <input type="text" class="form-control" placeholder="Entre com o titulo" name="titulo">
	    </div>	    

	    <div class="form-group">
	      <label>Numero de pagina:</label>
	      <input type="number" min="0" step="1" class="form-control" placeholder="Entre com o numero de paginas"  name="numeroDePaginas">
	    </div>
	    
		 <div class="form-group">
			 <label>Idioma:</label>
			 <input type="text" class="form-control" placeholder="Entre com o idioma"  name="idioma">
		</div>
			    
	    <div class="form-group">
				<label>Generos:(Coloque uma virgula entre cada genero)</label>
				<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="genero"></textarea>
		</div>
		
		<div class="form-group">
				<label>Autores:(Coloque uma virgula entre cada autor)</label>
				<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="autores"></textarea>
		</div>