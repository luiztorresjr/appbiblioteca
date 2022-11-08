package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.service.PeriodicoService;
@Order(7)
@Component
public class PeriodicoTeste implements ApplicationRunner{

	@Autowired
	private PeriodicoService periodicoService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Periodico");
		Periodico a = new Periodico();
		a.setRegistro(31);
		a.setTitulo("Quatro Rodas");
		a.setNumeroDePaginas(134);
		a.setDataPublicacao("2022/08/01");
		a.setNumeroEdicao(760);
		a.setPeriodicidade(15);
		a.setIdioma("Portugues");
		a.setEditora("Abril");
		List<String> redatores = new ArrayList<String>();
		List<String> generos = new ArrayList<String>();
		generos.add("Entreterimento");
		generos.add("Automotivo");
		redatores.add("Paulo Campo Grande");
		a.setAutores(redatores);
		a.setValor(14.9f);
		periodicoService.incluir(a);
		
		Periodico b = new Periodico();
		b.setRegistro(32);
		b.setTitulo("Jornal Folha de São Paulo");
		b.setNumeroDePaginas(134);
		b.setDataPublicacao("2022/10/29");
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
		b.setAutores(redatoresB);
		b.setValor(3.9f);		
		periodicoService.incluir(b);
		
		Periodico c = new Periodico();
		c.setRegistro(33);
		c.setTitulo("Le monde");
		c.setDataPublicacao("2022/10/29");
		c.setIdioma("Frances");
		c.setPeriodicidade(1);
		List<String> generosC = new ArrayList<String>();
		generosC.add("Politico");
		generosC.add("infomativo");
		c.setGenero(generosC);
		List<String> redatoresC = new ArrayList<String>();
		redatoresC.add("Jérôme Fenoglio");
		c.setAutores(redatoresC);
		c.setEditora("Le mond");
		c.setNumeroDePaginas(100);
		c.setValor(11.6f);
		c.setNumeroEdicao(182);
		periodicoService.incluir(c);
	}

}