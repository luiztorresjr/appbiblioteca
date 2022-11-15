package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Artigo;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.ArtigoService;
@Order(5)
@Component
public class ArtigoTeste implements ApplicationRunner {

	@Autowired
	private ArtigoService artigoService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Artigo");
		Artigo a = new Artigo();
		a.setRegistro(21);
		a.setTitulo("Avaliação de usabilidade do sistema Trilhas Literárias de Hortolândia");
		a.setSubtitulo("");
		a.setDataPublicacao("2020/01/04");
		a.setLocal("IFSP campus Hortolândia SP");
		List<String> autoresA = new ArrayList<String>();
		autoresA.add("Luiz T. Junior");
		a.setUsuario(usuario);
		autoresA.add("André C da Silva");
		a.setAutores(autoresA);
		a.setAssunto("Avalicao de interface");
		a.setNumeroDePaginas(20);
		List<String> generosA = new ArrayList<String>();
		generosA.add("UI");
		generosA.add("Informática");
		a.setGenero(generosA);
		a.setIdioma("Portugues");
		artigoService.incluir(a);
		
		Artigo b = new Artigo();
		b.setRegistro(22);
		b.setTitulo("Arqueogenética");
		b.setSubtitulo("um olhar para o passado para garantir o futuro");
		b.setDataPublicacao("2022/10/27");
		b.setLocal("USP");
		List<String> autoresB = new ArrayList<String>();
		autoresB.add("André Menezes Strauss");
		autoresB.add("Taran Grant");
		b.setAutores(autoresB);
		b.setAssunto("Genética");
		b.setUsuario(usuario);
		b.setNumeroDePaginas(1);
		List<String> generosB = new ArrayList<String>();
		generosB.add("Biologia");
		generosB.add("Genética");
		b.setGenero(generosB);
		b.setIdioma("Portugues");
		artigoService.incluir(b);

		Artigo c = new Artigo();
		c.setRegistro(23);
		c.setTitulo("A importância do trabalho investigativo no cotidiano escolar do Ensino de Ciências");
		c.setDataPublicacao("2015/10/22");
		c.setLocal("II CONEDU - Congresso nacional de educação");
		List<String> autoresC = new ArrayList<String>();
		autoresC.add("Andressa L. S. Teixeira");
		autoresC.add("Karolyne C. de Carvalho Araújo");
		autoresC.add("Rejane Magalhães");
		autoresC.add("Bernardino, L. Schulz");
		c.setAutores(autoresC);
		c.setUsuario(usuario);
		c.setAssunto("Avalicao de interface");
		c.setNumeroDePaginas(20);
		c.setIdioma("Portugues");
		List<String> generosC = new ArrayList<String>();
		generosC.add("Educação");
		c.setGenero(generosC);
		artigoService.incluir(c);
		
	}

}
