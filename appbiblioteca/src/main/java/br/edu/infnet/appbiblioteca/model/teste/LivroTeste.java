package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.service.LivroService;
@Order(4)
@Component
public class LivroTeste implements ApplicationRunner{

	@Autowired
	private LivroService livroService;


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Cadastramento de Livro");
		
		Livro a = new Livro();
		a.setRegistro(11);
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
		a.setDataLancamento("2001/01/01");
		a.setEditora("Martins Fontes");
		a.setValor(94.41f);
		livroService.incluir(a);
		
		Livro b = new Livro();
		b.setTitulo("A Clockwork Orange");
		b.setRegistro(12);
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
		b.setDataLancamento("2019/04/21");
		b.setEditora("W. W. Norton & Company");
		b.setValor(44.79f);
		livroService.incluir(b);
		
		Livro c = new Livro();
		c.setRegistro(13);
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
		c.setDataLancamento("2020/09/03");
		c.setEditora("RA-MA S.A. Editorial y Publicaciones");		
		c.setValor(316.51f);
		livroService.incluir(c);
	}
	
}
