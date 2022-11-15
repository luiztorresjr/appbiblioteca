package br.edu.infnet.appbiblioteca.model.domain;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tobra")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Obra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int registro;
	private String titulo;
	private int numeroDePaginas;
	private String idioma;	
	  @ElementCollection 
	  @Column(name = "genero") 
	private List<String> genero;
	  @ElementCollection 
	  @Column(name = "autor") 
	private List<String> autores;
	@ManyToMany(mappedBy = "obras")
	private List<Emprestimo> emprestimo;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public List<String> getGenero() {
		return genero;
	}

	public void setGenero(List<String> genero) {
		this.genero = genero;
	}
	
	public void setGenero(String genero) {
		List<String> generos = new ArrayList<String>();
		for (String g : genero.split(",")) {
			generos.add(g);
		};
		this.genero = generos;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	public void setAutores(String autor) {
		List<String> autores = new ArrayList<String>();
		for (String g : autor.split(",")) {
			autores.add(g);
		};
		this.genero = autores;
	}
	

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	

	public List<Emprestimo> getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(List<Emprestimo> emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+";"+titulo+";"+numeroDePaginas+";"+registro+";"+genero+";"+idioma;
	}

	
}
