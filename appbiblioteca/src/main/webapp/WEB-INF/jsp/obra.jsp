<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.edu.infnet.appbiblioteca.model.domain.Obra" %>
<script type="text/javascript">
var autores = new Array();
var generos = new Array();

function setAutor(){
	autor = document.getElementById("autores")
	const x = document.createElement("li");	
	const t = document.createTextNode(autor.value);
	x.appendChild(t);
	autores.push(autor.value);
	x.classList.add("list-group-item");
	document.getElementById("autor").appendChild(x);
	document.getElementById("autores").value=''
}

function setGenero(){
	genero = document.getElementById("genero")
	const x = document.createElement("li");	
	const t = document.createTextNode(genero.value);
	generos.push(genero.value);
	x.appendChild(t);
	x.classList.add("list-group-item");
	document.getElementById("generos").appendChild(x);
	document.getElementById("genero").value=''
}
addEventListener('submit', (event) => {
	document.getElementById("genero").value += generos;
	document.getElementById("autores").value +=autores;
});

</script> 
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
		     	<label>Genero:</label>
				<input type="text" class="form-control" placeholder="Adicione o genero" name="genero" id="genero">
				<br />
				<button class="btn btn-primary" type="button" onclick="setGenero()">Adicionar</button>	
		      <label>Lista de Generos:</label>
					<ul class="list-group" id="generos" name="generos">			
					  		
					</ul>	
		  </div>
		  
		  <div class="form-group">
		      <label>Autor:</label>
			  <input type="text" class="form-control" placeholder="Adicione o nome do autor" name="autores" id="autores">
			   <br/> 
			   <button class="btn btn-primary" type="button" onclick="setAutor()">Adicionar</button>
  			</div>
		    <div class="col-sm-4">
		    <div class="col-sm-1">
		    <label>Lista de Autores:</label>
		    </div>
		      <div class="col-sm-3">
		      <ul class="list-group" id="autor" name="autor">	
		      </ul>		
		      </div>		
		    </div>
			
			
			
		
		
	