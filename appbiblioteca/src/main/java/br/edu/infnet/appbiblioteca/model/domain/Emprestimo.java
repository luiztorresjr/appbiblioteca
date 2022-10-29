package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;

public class Emprestimo {
	private int id;
	private Date dataRetirada;
	private Date dataDevolucao;
	private boolean atrasado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public boolean isAtrasado() {
		return atrasado;
	}
	public void setAtrasado(boolean atrasado) {
		this.atrasado = atrasado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+";"+dataRetirada+";"+dataDevolucao+";"+atrasado;
	}
}
