package br.edu.infnet.appbiblioteca.model.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Usuario u = new Usuario();
		u.setNome("admin");
		u.setEmail("admin@admin.com");
		u.setSenha("123");
		usuarioService.incluir(u);
	}

}
