package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;
import java.util.List;

public class Emprestimo {
	private int id;
	private Date dataRetirada;
	private Date dataDevolucao;
	private boolean atrasado;
	private Consulente consulente;
	private List<Obra> obras;
	
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
	
	
	public Consulente getConsulente() {
		return consulente;
	}
	public void setConsulente(Consulente consulente) {
		this.consulente = consulente;
	}
	public List<Obra> getObras() {
		return obras;
	}
	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+";"+consulente+";"+dataRetirada+";"+dataDevolucao+";"+atrasado+";"+obras;
	}
}
