package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.controller.ObraController;
import br.edu.infnet.appbiblioteca.model.domain.Obra;

@Component
public class ObraTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Obra");
		Obra a = new Obra();
		a.setId(1);
		a.setTitulo("Harry Potter");
		List<String> generosA = new ArrayList<String>();
		generosA.add("Fantasia");
		generosA.add("Juvenil");
		a.setGenero(generosA);
		a.setIdioma("Ingles");
		a.setNumeroDePaginas(540);
		ObraController.incluir(a);
		
		Obra b = new Obra();
		b.setId(2);
		b.setTitulo("New York Time");
		List<String> generosB = new ArrayList<String>();
		generosB.add("Noticia");
		generosB.add("Jornalistico");
		b.setGenero(generosB);
		b.setIdioma("Ingles");
		b.setNumeroDePaginas(100);
		ObraController.incluir(b);
		
		Obra c = new Obra();
		c.setId(3);
		c.setTitulo("O tempo-espaço: ficção, teoria e sociedade");
		List<String> generosC = new ArrayList<String>();
		generosC.add("Astronomia");
		c.setGenero(generosC);
		c.setIdioma("Portugues");
		c.setNumeroDePaginas(7);
		ObraController.incluir(c);
	}

}
