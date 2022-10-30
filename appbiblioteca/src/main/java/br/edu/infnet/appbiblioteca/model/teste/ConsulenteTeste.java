package br.edu.infnet.appbiblioteca.model.teste;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.controller.ConsulenteController;
import br.edu.infnet.appbiblioteca.model.domain.Consulente;

@Component
public class ConsulenteTeste implements ApplicationRunner {

	@SuppressWarnings("deprecation")
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Consulente");
		Consulente a = new Consulente();
		a.setNome("Airton");
		a.setDataNascimento(new Date("1965/05/09"));
		a.setEndereco("Rua das conchas, 67");
		a.setRegistro(1);
		a.setRg("2256790062");
		a.setTelefone("11990076230");
		ConsulenteController.incluir(a);
		
		Consulente b = new Consulente();
		b.setNome("Carmen");
		b.setDataNascimento(new Date("1989/12/01"));
		b.setEndereco("Avenida Brasil, 19");
		b.setRegistro(2);
		b.setRg("1234567890");
		b.setTelefone("21986432000");
		ConsulenteController.incluir(b);
		
		Consulente c = new Consulente();
		c.setNome("Jordan");
		c.setDataNascimento(new Date("1999/08/30"));
		c.setEndereco("Rua das conchas, 67");
		c.setRegistro(3);
		c.setRg("8763410093");
		c.setTelefone("31964006776");
		ConsulenteController.incluir(c);
		
	}

}
