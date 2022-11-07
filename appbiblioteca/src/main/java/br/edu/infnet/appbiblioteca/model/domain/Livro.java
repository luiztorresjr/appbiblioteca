package br.edu.infnet.appbiblioteca.model.domain;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tlivro")
public class Livro extends Obra{
		private String editora;
		private String isbn;
		private Date dataLancamento;
		private int volume;
		private float valor;
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
		@SuppressWarnings("deprecation")
		public void setDataLancamento(String dataLancamento) {
			Date dataInterna = new Date(dataLancamento.replace("-", "/"));
			this.dataLancamento = dataInterna;
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
		
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+";"+editora+";"+isbn+";"+dataLancamento+";"+volume;
		}
}
