package br.edu.infnet.appbiblioteca.model.domain;


import java.util.List;

public class Obra {
	private int id;
	private String titulo;
	private int numeroDePaginas;
	private List<String> genero;
	private String idioma;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}


	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}


	public List<String> getGenero() {
		return genero;
	}


	public void setGenero(List<String> genero) {
		this.genero = genero;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+";"+titulo+";"+numeroDePaginas+";"+genero+";"+idioma;
	}
}
