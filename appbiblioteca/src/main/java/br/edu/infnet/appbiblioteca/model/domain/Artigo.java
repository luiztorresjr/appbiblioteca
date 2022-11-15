package br.edu.infnet.appbiblioteca.model.domain;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tartigo")
public class Artigo extends Obra{
	private String assunto;
	private String local;
	private String subtitulo;	
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
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	@SuppressWarnings("deprecation")
	public void setDataPublicacao(String dataPublicacao) {
		Date dataInterna = new Date(dataPublicacao.replace("-", "/"));
		this.dataPublicacao = dataInterna;
	}
	
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String _subtitulo) {
		subtitulo = _subtitulo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+";"+subtitulo+";"+assunto+";"+local+";"+dataPublicacao;
	}
}
