package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;
import java.util.List;

public class Livro extends Obra{
		private String editora;
		private String isbn;
		private Date dataLancamento;
		private int volume;
		private float valor;
		private List<String> autores;
		public String getEditora() {
			return editora;
		}
		public void setEditora(String editora) {
			this.editora = editora;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
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
		public float getValor() {
			return valor;
		}
		public void setValor(float valor) {
			this.valor = valor;
		}
		public List<String> getAutores() {
			return autores;
		}
		public void setAutores(List<String> autores) {
			this.autores = autores;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+";"+editora+";"+isbn+";"+dataLancamento+";"+volume+";"+autores;
		}
}
