package br.edu.infnet.appbiblioteca.model.domain;

import java.util.List;

public class Obra {
	private String titulo;
	private int numeroDePaginas;
	private List<String> genero;
	private String idioma;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String _titulo) {
		titulo = _titulo;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return titulo+";"+numeroDePaginas+";"+genero;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
