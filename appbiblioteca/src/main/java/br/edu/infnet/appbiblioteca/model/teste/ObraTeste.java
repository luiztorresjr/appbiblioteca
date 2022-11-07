package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Artigo;
import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.service.ObraService;

@Order(4)
@Component
public class ObraTeste implements ApplicationRunner{

	@Autowired
	private ObraService obraService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Obra");
		Livro a = new Livro();
		a.setRegistro(10);
		a.setTitulo("o Hobbit");
		a.setNumeroDePaginas(300);
		a.setIdioma("Portugues");
		a.setIsbn("8595084742");
		List<String> generos = new ArrayList<String>();
		generos.add("Literatura");
		generos.add("Ficção");
		a.setGenero(generos);		
		a.setIdioma("Portugues");
		List<String> autor = new ArrayList<String>();
		autor.add("J.R.R. Tolkien");
		a.setAutores(autor);
		a.setVolume(1);
		a.setDataLancamento("2019/07/15");
		a.setEditora("HarperCollins");
		a.setValor(33.9f);
		obraService.incluir(a);
		
		Artigo b = new Artigo();
		b.setIdioma("Portugues");
		b.setRegistro(20);
		b.setTitulo("Preservação e exploração de animais silvestres nativos");
		b.setSubtitulo("Preá, cutia e Mocô");
		b.setDataPublicacao("2022/10/27");
		b.setLocal("USP");
		List<String> autoresB = new ArrayList<String>();
		autoresB.add("Marcelo J. P. Pinheiro");
		autoresB.add("Silvana A. Andrade");
		autoresB.add("José N. da Cunha");
		b.setAutores(autoresB);
		b.setAssunto("Biologia");
		b.setNumeroDePaginas(1);
		List<String> generosB = new ArrayList<String>();
		generosB.add("Biologia");
		generosB.add("Meio ambiente");
		b.setGenero(generosB);
		obraService.incluir(b);
		
		Periodico c = new Periodico();
		c.setRegistro(30);
		c.setTitulo("New York Times");
		c.setDataPublicacao("2022/11/06");
		c.setIdioma("Ingles");
		c.setPeriodicidade(1);
		List<String> generosC = new ArrayList<String>();
		generosC.add("Politico");
		generosC.add("infomativo");
		c.setGenero(generosC);
		List<String> redatoresC = new ArrayList<String>();
		redatoresC.add("Arthur Ochs Sulzberger Jr");
		redatoresC.add("Bill Keller");
		c.setAutores(redatoresC);
		c.setEditora("Le mond");
		c.setNumeroDePaginas(100);
		c.setValor(11.6f);
		c.setNumeroEdicao(182);
		obraService.incluir(c);
	}

}
