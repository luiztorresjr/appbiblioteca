package br.edu.infnet.appbiblioteca.domain.model;

import java.util.Date;

public class Emprestimo {
	private int id;
	private Date dataRetida;
	private Date dataDevolucao;
	private boolean atrasado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataRetida() {
		return dataRetida;
	}
	public void setDataRetida(Date dataRetida) {
		this.dataRetida = dataRetida;
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
	
	
}
