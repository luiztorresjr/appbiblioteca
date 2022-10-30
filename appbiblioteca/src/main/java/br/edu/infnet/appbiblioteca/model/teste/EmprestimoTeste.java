package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.controller.EmprestimoController;
import br.edu.infnet.appbiblioteca.model.domain.Artigo;
import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;
import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Obra;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;

@Component
public class EmprestimoTeste implements ApplicationRunner{

	@SuppressWarnings("deprecation")
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Cadastramento de Emprestimo");
		
		// TODO Auto-generated method stub
		Emprestimo a = new Emprestimo();
		Consulente consulenteA = new Consulente();
		consulenteA.setNome("Airton");
		consulenteA.setDataNascimento(new Date("1965/05/09"));
		consulenteA.setEndereco("Rua das conchas, 67");
		consulenteA.setRegistro(1);
		consulenteA.setRg("2256790062");
		consulenteA.setTelefone("11990076230");
		a.setConsulente(consulenteA);
		a.setDataDevolucao(new Date("2022/11/10"));
		a.setDataRetirada(new Date("2022/10/20"));
		a.setId(1);
		Artigo obraA = new Artigo();
		obraA.setId(1);
		obraA.setTitulo("Avaliação de usabilidade do sistema Trilhas Literárias de Hortolândia");
		obraA.setSubtitulo("");
		obraA.setDataPublicacao(new Date("2020/01/04"));
		obraA.setLocal("IFSP campus Hortolândia SP");
		List<String> autoresA = new ArrayList<String>();
		autoresA.add("Luiz Torres Junior");
		autoresA.add("André C da Silva");
		obraA.setAutores(autoresA);
		obraA.setAssunto("Avalicao de interface");
		obraA.setNumeroDePaginas(20);
		List<String> generosA = new ArrayList<String>();
		generosA.add("UI");
		generosA.add("Informática");
		obraA.setGenero(generosA);
		List<Obra> obrasA = new ArrayList<Obra>();
		obrasA.add(obraA);
		a.setObras(obrasA);
		a.setAtrasado(false);
		EmprestimoController.incluir(a);
		
		Emprestimo b = new Emprestimo();
		Consulente consulenteB = new Consulente();
		consulenteB.setNome("Carmen");
		consulenteB.setDataNascimento(new Date("1989/12/01"));
		consulenteB.setEndereco("Avenida Brasil, 19");
		consulenteB.setRegistro(2);
		consulenteB.setRg("1234567890");
		consulenteB.setTelefone("21986432000");
		b.setConsulente(consulenteB);
		b.setDataDevolucao(new Date("2022/10/28"));
		b.setDataRetirada(new Date("2022/09/20"));
		b.setId(2);
		Periodico obraB = new Periodico();
		obraB.setId(2);
		obraB.setTitulo("Le monde");
		obraB.setDataPublicacao(new Date(20221029));
		obraB.setIdioma("Frances");
		obraB.setPeriodicidade(1);
		List<String> generosC = new ArrayList<String>();
		generosC.add("Politico");
		generosC.add("infomativo");
		obraB.setGenero(generosC);
		List<String> redatoresC = new ArrayList<String>();
		redatoresC.add("Jérôme Fenoglio");
		obraB.setRedatores(redatoresC);
		obraB.setEditora("Le mond");
		obraB.setNumeroDePaginas(100);
		obraB.setValor(11.6f);
		obraB.setNumeroEdicao(182);
		List<Obra> obrasB = new ArrayList<Obra>();
		obrasB.add(obraB);
		b.setObras(obrasB);
		b.setAtrasado(true);
		EmprestimoController.incluir(b);
		
		
		Emprestimo c = new Emprestimo();
		Consulente consulenteC = new Consulente();
		consulenteC.setNome("Jordan");
		consulenteC.setDataNascimento(new Date("1999/08/30"));
		consulenteC.setEndereco("Rua das conchas, 67");
		consulenteC.setRegistro(3);
		consulenteC.setRg("8763410093");
		consulenteC.setTelefone("31964006776");
		c.setConsulente(consulenteC);
		c.setDataDevolucao(new Date("2022/11/10"));
		c.setDataRetirada(new Date("2022/10/20"));
		c.setId(3);
		Livro obraC = new Livro();
		obraC.setId(1);
		obraC.setTitulo("Senhor dos Aneis");
		obraC.setNumeroDePaginas(1200);
		obraC.setIsbn("8533613407");
		List<String> generos = new ArrayList<String>();
		generos.add("Literatura");
		generos.add("Ficção");
		obraC.setGenero(generos);		
		obraC.setIdioma("Portugues");
		List<String> autor = new ArrayList<String>();
		autor.add("J.R.R. Tolkien");
		obraC.setAutores(autor);
		obraC.setVolume(1);
		obraC.setDataLancamento(new Date(20010101));
		obraC.setEditora("Martins Fontes");
		List<Obra> obrasC = new ArrayList<Obra>();
		obrasC.add(obraC);
		c.setObras(obrasC);
		c.setAtrasado(false);
		EmprestimoController.incluir(c);
		
	}

}
