package br.edu.infnet.appbiblioteca.model.domain;

import java.util.Date;
import java.util.List;

public class Artigo extends Obra{
	private String assunto;
	private String local;
	private String Subtitulo;
	private List<String> autores;
	private Date dataPublicacao;
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+";"+assunto+";"+local+";"+autores+";"+dataPublicacao;
	}
	public String getSubtitulo() {
		return Subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		Subtitulo = subtitulo;
	}
}
