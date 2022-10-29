package br.edu.infnet.appbiblioteca.domain.model;

public class Revista extends Obra{
	private int numeroEdicao;
	private String editor;
	private int periodico;
	private float valor;
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public int getPeriodico() {
		return periodico;
	}
	public void setPeriodico(int periodico) {
		this.periodico = periodico;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
		
}
