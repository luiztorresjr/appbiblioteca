package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.controller.LivroController;
import br.edu.infnet.appbiblioteca.model.domain.Livro;

@Component
public class LivroTeste implements ApplicationRunner{


	@SuppressWarnings("deprecation")
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Cadastramento de Livro");
		
		Livro a = new Livro();
		a.setId(1);
		a.setTitulo("Senhor dos Aneis");
		a.setNumeroDePaginas(1200);
		a.setIdioma("Portugues");
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
		a.setDataLancamento(new Date("2001/01/01"));
		a.setEditora("Martins Fontes");
		a.setValor(94.41f);
		LivroController.incluir(a);
		
		Livro b = new Livro();
		b.setId(2);
		b.setTitulo("A Clockwork Orange");
		b.setNumeroDePaginas(240);
		b.setIdioma("Ingles");
		b.setIsbn("0393341763");
		List<String> generosB = new ArrayList<String>();
		generosB.add("Classico");
		generosB.add("Satira Humoristica");
		generosB.add("Ficção");
		b.setGenero(generosB);		
		List<String> autorB = new ArrayList<String>();
		autorB.add("Anthony Burgess");
		b.setAutores(autorB);
		b.setVolume(1);
		b.setDataLancamento(new Date("2019/04/21"));
		b.setEditora("W. W. Norton & Company");
		b.setValor(44.79f);
		LivroController.incluir(b);
		
		Livro c = new Livro();
		c.setId(3);
		c.setTitulo("Hackers");
		c.setNumeroDePaginas(474);
		c.setIdioma("Espanhol");
		c.setIsbn("8499648959");
		List<String> generosC = new ArrayList<String>();
		generosC.add("Tecnico");
		generosC.add("Infomatica");
		c.setGenero(generosC);		
		List<String> autorC = new ArrayList<String>();
		autorC.add("Juan Andres Maíllo Fernández");
		c.setAutores(autor);
		c.setVolume(1);
		c.setDataLancamento(new Date("2020/09/03"));
		c.setEditora("RA-MA S.A. Editorial y Publicaciones");		
		c.setValor(316.51f);
		LivroController.incluir(c);
	}
	
}
