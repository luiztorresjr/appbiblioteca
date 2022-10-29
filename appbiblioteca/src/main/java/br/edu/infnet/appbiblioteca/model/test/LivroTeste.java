package br.edu.infnet.appbiblioteca.model.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Livro;

@Component
public class LivroTeste implements ApplicationRunner{

	@SuppressWarnings("unused")
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Livro a = new Livro();
		a.setTitulo("Senhor dos Aneis");
		a.setNumeroDePaginas(1200);
		a.setIsbn("8533613407");
		List<String> generos = new ArrayList<String>();
		generos.add("Literatura");
		generos.add("Ficção");
		a.setGenero(generos);		
		a.setIdioma("Portugues");
		List<String> autor = new ArrayList<String>();
		autor.add("J.R.R. Tolkien");
		a.setAutores(autor);
		a.setVolume(1);
		a.setDataLancamento(new Date(20010101));
		a.setEditora("Martins Fontes");
		System.out.println("Livro: "+a.toString());
		
		Livro b = new Livro();
		b.setTitulo("A Clockwork Orange");
		b.setNumeroDePaginas(240);
		b.setIdioma("Ingles");
		b.setIsbn("0393341763");
		List<String> generosB = new ArrayList<String>();
		generos.add("Classico");
		generos.add("Satira Humoristica");
		generos.add("Ficção");
		b.setGenero(generosB);		
		List<String> autorB = new ArrayList<String>();
		autor.add("Anthony Burgess");
		b.setAutores(autorB);
		b.setVolume(1);
		b.setDataLancamento(new Date(20190421));
		b.setEditora("W. W. Norton & Company");
		System.out.println("Livro: "+b.toString());
		
		Livro c = new Livro();
		c.setTitulo("Hackers");
		c.setNumeroDePaginas(474);
		c.setIdioma("Espanhol");
		c.setIsbn("8499648959");
		List<String> generosC = new ArrayList<String>();
		generos.add("Tecnico");
		generos.add("Infomatica");
		c.setGenero(generos);		
		List<String> autorC = new ArrayList<String>();
		autor.add("Juan Andres Maíllo Fernández");
		c.setAutores(autor);
		c.setVolume(1);
		c.setDataLancamento(new Date(20200903));
		c.setEditora("RA-MA S.A. Editorial y Publicaciones");		
		System.out.println("Livro: "+c.toString());
	}
	
}
