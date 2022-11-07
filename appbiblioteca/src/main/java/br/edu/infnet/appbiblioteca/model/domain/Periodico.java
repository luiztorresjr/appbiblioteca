package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tperiodico")
public class Periodico extends Obra{
	private int numeroEdicao;
	private String editora;
	private int periodicidade;
	private float valor;
	private Date dataPublicacao;
	
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
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
		return super.toString()+";"+numeroEdicao+";"+periodicidade+";"+valor;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	
	@SuppressWarnings("deprecation")
	public void setDataPublicacao(String dataPublicacao) {
		Date dataInterna = new Date(dataPublicacao.replace("-", "/"));
		this.dataPublicacao = dataInterna;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
}
