package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;
import java.util.List;

public class Periodico extends Obra{
	private int numeroEdicao;
	private List<String> redatores;
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
		return super.toString()+";"+numeroEdicao+";"+periodicidade+";"+valor+";"+redatores;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public List<String> getRedatores() {
		return redatores;
	}
	public void setRedatores(List<String> _redatores) {
		redatores = _redatores;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
}
