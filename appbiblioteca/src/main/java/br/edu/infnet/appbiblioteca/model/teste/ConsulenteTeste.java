package br.edu.infnet.appbiblioteca.model.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Endereco;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.ConsulenteService;

@Order(2)
@Component
public class ConsulenteTeste implements ApplicationRunner {
	
	@Autowired
	private ConsulenteService consulenteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Endereco enderecoA = new Endereco();
		enderecoA.setCep("80250-030");
		enderecoA.setLogradouro("Rua Brigadeiro Franco");
		enderecoA.setComplemento("de 2051/2052 a 2403/2404");
		enderecoA.setBairro("Centro");
		enderecoA.setLocalidade("Curitiba");
		enderecoA.setUf("PR");
		
		Endereco enderecoB = new Endereco();
		enderecoB.setCep("31275-000");
		enderecoB.setLogradouro("Avenida Antônio Abrahão Caram");
		enderecoB.setComplemento("");
		enderecoB.setBairro("São José");
		enderecoB.setLocalidade("Belo Horizonte");
		enderecoB.setUf("MG");
		
		Endereco enderecoC = new Endereco();
		enderecoC.setCep("22021-001");
		enderecoC.setLogradouro("Avenida Atlântica");
		enderecoC.setComplemento("de 1662 a 2172 - lado par");
		enderecoC.setBairro("Copacabana");
		enderecoC.setLocalidade("Rio de Janeiro");
		enderecoC.setUf("RJ");
		
		// TODO Auto-generated method stub
		System.out.println("Cadastramento de Consulente");
		Consulente a = new Consulente();
		a.setNome("Airton");
		a.setUsuario(usuario);
		a.setEmail("airton@primeiro.com");
		a.setRg("2256790062");
		a.setTelefone("11990076230");
		a.setUsuario(usuario);
		a.setEndereco(enderecoA);
		consulenteService.incluir(a);
		
		Consulente b = new Consulente();
		b.setNome("Carmen");
		b.setUsuario(usuario);
		b.setEmail("carmen@primeiro.com");
		b.setRg("1234567890");
		b.setUsuario(usuario);
		b.setTelefone("21986432000");
		b.setEndereco(enderecoB);
		consulenteService.incluir(b);
		
		Consulente c = new Consulente();
		c.setNome("Jordan");
		c.setUsuario(usuario);
		c.setEmail("jordan@primeiro.com");
		c.setRg("8763410093");
		c.setUsuario(usuario);
		c.setTelefone("31964006776");
		c.setEndereco(enderecoC);
		consulenteService.incluir(c);
		
	}

}
