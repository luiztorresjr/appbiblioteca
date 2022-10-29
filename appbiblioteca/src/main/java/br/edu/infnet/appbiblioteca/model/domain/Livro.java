package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;
import java.util.List;

public class Livro extends Obra{
	private float valor;
	private Date dataLancamento;
	private int volume;
	private List<String> autores;
	private String editora;
	private String isbn;
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+";"+valor+";"+volume+";"+autores+";"+editora;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
