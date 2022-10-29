package br.edu.infnet.appbiblioteca.domain.model;

import java.util.List;

public class Obra {
	private String Titulo;
	private int numeroDePaginas;
	private List<String> genero;
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
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
	
	
}
