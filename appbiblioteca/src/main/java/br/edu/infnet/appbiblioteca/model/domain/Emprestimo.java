package br.edu.infnet.appbiblioteca.model.domain;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="temprestimo")
public class Emprestimo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dataRetirada;
	private Date dataDevolucao;
	private boolean atrasado;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idConsulente")
	private Consulente consulente;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Obra> obras;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@SuppressWarnings("deprecation")
	public Emprestimo() {
		dataRetirada = Date.from(Instant.now());
		dataDevolucao =  new Date (dataRetirada.getYear(), dataRetirada.getMonth(), dataRetirada.getDay()+7);
		atrasado = false;
	}
	
	public Emprestimo(Consulente consulente) {
		this();
		this.consulente = consulente;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataRetirada() {
		return dataRetirada;
	}
	@SuppressWarnings("deprecation")
	public void setDataRetirada(String dataRetirada) {
		Date dataInterna = new Date(dataRetirada.replace("-", "/"));
		this.dataRetirada = dataInterna;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	@SuppressWarnings("deprecation")
	public void setDataDevolucao(String dataDevolucao) {
		Date dataInterna = new Date(dataDevolucao.replace("-", "/"));
		this.dataDevolucao = dataInterna;
	}
	public boolean isAtrasado() {
		return atrasado;
	}
	public void setAtrasado(boolean atrasado) {
		this.atrasado = atrasado;
	}	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
