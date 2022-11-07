package br.edu.infnet.appbiblioteca.model.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.ConsulenteService;

@Order(3)
@Component
public class ConsulenteTeste implements ApplicationRunner {
	
	@Autowired
	private ConsulenteService consulenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Consulente");
		Consulente a = new Consulente();
		a.setNome("Airton");
		a.setDataNascimento("1965/05/09");
		a.setEndereco("Rua das conchas, 67");
		a.setUsuario(usuario);
		a.setEmail("airton@primeiro.com");
		a.setRg("2256790062");
		a.setTelefone("11990076230");
		consulenteService.incluir(a);
		
		Consulente b = new Consulente();
		b.setNome("Carmen");
		b.setDataNascimento("1989/12/01");
		b.setEndereco("Avenida Brasil, 19");
		b.setUsuario(usuario);
		b.setEmail("carmen@primeiro.com");
		b.setRg("1234567890");
		b.setTelefone("21986432000");
		consulenteService.incluir(b);
		
		Consulente c = new Consulente();
		c.setNome("Jordan");
		c.setDataNascimento("1999/08/30");
		c.setEndereco("Rua das conchas, 67");
		c.setUsuario(usuario);
		c.setEmail("jordan@primeiro.com");
		c.setRg("8763410093");
		c.setTelefone("31964006776");
		consulenteService.incluir(c);
		
	}

}
