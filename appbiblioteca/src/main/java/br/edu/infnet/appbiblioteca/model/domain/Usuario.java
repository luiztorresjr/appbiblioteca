package br.edu.infnet.appbiblioteca.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tusuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Consulente> consulente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Consulente> getConsulente() {
		return consulente;
	}
	public void setConsulente(List<Consulente> consulente) {
		this.consulente = consulente;
	}
	
	@Override
	public String toString() {
		return id + ";" + nome + ";" + email + ";" + senha;
	}
}
