package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.controller.ArtigoController;
import br.edu.infnet.appbiblioteca.model.domain.Artigo;

@Component
public class ArtigoTeste implements ApplicationRunner {

	@SuppressWarnings("deprecation")
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Artigo");
		Artigo a = new Artigo();
		a.setId(1);
		a.setTitulo("Avaliação de usabilidade do sistema Trilhas Literárias de Hortolândia");
		a.setSubtitulo("");
		a.setDataPublicacao(new Date("2020/01/04"));
		a.setLocal("IFSP campus Hortolândia SP");
		List<String> autoresA = new ArrayList<String>();
		autoresA.add("Luiz Torres Junior");
		autoresA.add("André C da Silva");
		a.setAutores(autoresA);
		a.setAssunto("Avalicao de interface");
		a.setNumeroDePaginas(20);
		List<String> generosA = new ArrayList<String>();
		generosA.add("UI");
		generosA.add("Informática");
		a.setGenero(generosA);
		ArtigoController.incluir(a);
		
		Artigo b = new Artigo();
		b.setId(2);
		b.setTitulo("Arqueogenética");
		b.setSubtitulo("um olhar para o passado para garantir o futuro");
		b.setDataPublicacao(new Date("2022/10/27"));
		b.setLocal("USP");
		List<String> autoresB = new ArrayList<String>();
		autoresB.add("André Menezes Strauss");
		autoresB.add("Taran Grant");
		b.setAutores(autoresB);
		b.setAssunto("Genética");
		b.setNumeroDePaginas(1);
		List<String> generosB = new ArrayList<String>();
		generosB.add("Biologia");
		generosB.add("Genética");
		b.setGenero(generosB);
		ArtigoController.incluir(b);

		Artigo c = new Artigo();
		c.setId(3);
		c.setTitulo("A importância do trabalho investigativo no cotidiano escolar do Ensino de Ciências");
		c.setDataPublicacao(new Date("2015/10/22"));
		c.setLocal("II CONEDU - Congresso nacional de educação");
		List<String> autoresC = new ArrayList<String>();
		autoresC.add("Andressa L. S. Teixeira");
		autoresC.add("Karolyne C. de Carvalho Araújo");
		autoresC.add("Rejane Magalhães");
		autoresC.add("Bernardino, L. Schulz");
		c.setAutores(autoresC);
		c.setAssunto("Avalicao de interface");
		c.setNumeroDePaginas(20);
		List<String> generosC = new ArrayList<String>();
		generosC.add("Educação");
		c.setGenero(generosC);
		ArtigoController.incluir(c);
		
	}

}
