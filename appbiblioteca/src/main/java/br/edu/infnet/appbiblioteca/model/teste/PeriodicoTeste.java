package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.controller.PeriodicoController;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;

@Component
public class PeriodicoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Periodico");
		Periodico a = new Periodico();
		a.setId(1);
		a.setTitulo("Quatro Rodas");
		a.setNumeroDePaginas(134);
		a.setDataPublicacao(new Date(20220801));
		a.setNumeroEdicao(760);
		a.setPeriodicidade(15);
		a.setIdioma("Portugues");
		a.setEditora("Abril");
		List<String> redatores = new ArrayList<String>();
		redatores.add("Paulo Campo Grande");
		a.setRedatores(redatores);
		a.setValor(14.9f);
		PeriodicoController.incluir(a);
		
		Periodico b = new Periodico();
		b.setId(2);
		b.setTitulo("Jornal Folha de São Paulo");
		b.setNumeroDePaginas(134);
		b.setDataPublicacao(new Date(20221029));
		b.setNumeroEdicao(760);
		b.setPeriodicidade(1);
		List<String> generosB = new ArrayList<String>();
		generosB.add("Noticia");
		generosB.add("Jornalistico");
		b.setGenero(generosB);
		b.setIdioma("Portugues");
		b.setEditora("Grupo Folha");
		List<String> redatoresB = new ArrayList<String>();
		redatoresB.add("Paulo Campo Grande");
		b.setRedatores(redatoresB);
		b.setValor(3.9f);		
		PeriodicoController.incluir(b);
		
		Periodico c = new Periodico();
		c.setId(3);
		c.setTitulo("Le monde");
		c.setDataPublicacao(new Date(20221029));
		c.setIdioma("Frances");
		c.setPeriodicidade(1);
		List<String> generosC = new ArrayList<String>();
		generosC.add("Politico");
		generosC.add("infomativo");
		c.setGenero(generosC);
		List<String> redatoresC = new ArrayList<String>();
		redatoresC.add("Jérôme Fenoglio");
		c.setRedatores(redatoresC);
		c.setEditora("Le mond");
		c.setNumeroDePaginas(100);
		c.setValor(11.6f);
		c.setNumeroEdicao(182);
		PeriodicoController.incluir(c);
	}

}