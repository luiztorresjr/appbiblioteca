package br.edu.infnet.appbiblioteca.model.teste;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Artigo;
import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;
import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.domain.Obra;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.EmprestimoService;
@Order(7)
@Component
public class EmprestimoTeste implements ApplicationRunner{
	
	@Autowired
	private EmprestimoService emprestimoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Cadastramento de Emprestimo");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// TODO Auto-generated method stub
		Emprestimo a = new Emprestimo();
		Consulente consulenteA = new Consulente();
		consulenteA.setId(1);
		consulenteA.setNome("Airton");
		consulenteA.setRg("2256790062");
		consulenteA.setTelefone("11990076230");
		a.setConsulente(consulenteA);
		a.setDataDevolucao("2022/11/10");
		a.setDataRetirada("2022/10/20");
		
		a.setUsuario(usuario);
		
		Artigo obraA = new Artigo();
		obraA.setId(7);
		obraA.setRegistro(10);
		obraA.setTitulo("Avaliação de usabilidade do sistema Trilhas Literárias de Hortolândia");
		obraA.setSubtitulo("");
		obraA.setDataPublicacao("2020/01/04");
		obraA.setLocal("IFSP campus Hortolândia SP");
		List<String> autoresA = new ArrayList<String>();
		autoresA.add("Luiz Torres Junior");
		autoresA.add("André C da Silva");
		obraA.setAutores(autoresA);
		obraA.setAssunto("Avalicao de interface");
		obraA.setIdioma("Portugues");
		obraA.setNumeroDePaginas(20);
		List<String> generosA = new ArrayList<String>();
		generosA.add("UI");
		generosA.add("Informática");
		obraA.setGenero(generosA);
		List<Obra> obrasA = new ArrayList<Obra>();
		obrasA.add(obraA);
		a.setObras(obrasA);
		a.setAtrasado(false);
		emprestimoService.incluir(a);
		
		Emprestimo b = new Emprestimo();
		Consulente consulenteB = new Consulente();
		consulenteB.setId(2);
		consulenteB.setNome("Carmen");
		consulenteB.setRg("1234567890");
		consulenteB.setTelefone("21986432000");
		b.setConsulente(consulenteB);
		b.setDataDevolucao("2022/10/28");
		b.setDataRetirada("2022/09/20");
		Periodico obraB = new Periodico();
		obraB.setTitulo("Le monde");
		obraB.setId(12);
		obraB.setRegistro(20);
		obraB.setDataPublicacao("2022/10/29");
		obraB.setIdioma("Frances");
		obraB.setPeriodicidade(1);
		List<String> generosC = new ArrayList<String>();
		generosC.add("Politico");
		generosC.add("infomativo");
		obraB.setGenero(generosC);
		List<String> redatoresC = new ArrayList<String>();
		redatoresC.add("Jérôme Fenoglio");
		obraB.setAutores(redatoresC);
		obraB.setEditora("Le mond");
		obraB.setNumeroDePaginas(100);
		obraB.setValor(11.6f);
		obraB.setNumeroEdicao(182);
		List<Obra> obrasB = new ArrayList<Obra>();
		obrasB.add(obraB);
		b.setObras(obrasB);
		b.setAtrasado(true);
		b.setUsuario(usuario);
		emprestimoService.incluir(b);
		
		
		Emprestimo c = new Emprestimo();
		Consulente consulenteC = new Consulente();
		consulenteC.setId(3);
		consulenteC.setNome("Jordan");
		consulenteC.setRg("8763410093");
		consulenteC.setTelefone("31964006776");
		c.setConsulente(consulenteC);
		c.setDataDevolucao("2022/11/10");
		c.setDataRetirada("2022/10/20");
		Livro obraC = new Livro();
		obraC.setId(4);
		obraB.setRegistro(30);
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
		obraC.setDataLancamento("2001/01/01");
		obraC.setEditora("Martins Fontes");
		List<Obra> obrasC = new ArrayList<Obra>();
		obrasC.add(obraC);
		c.setObras(obrasC);
		c.setAtrasado(false);
		c.setUsuario(usuario);
		emprestimoService.incluir(c);
		
	}

}
