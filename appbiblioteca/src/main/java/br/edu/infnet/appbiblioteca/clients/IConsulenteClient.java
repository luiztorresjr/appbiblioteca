package br.edu.infnet.appbiblioteca.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;

@FeignClient(url="localhost:8082/api/consulente", name="consulenteClient")
public interface IConsulenteClient {

	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Consulente consulente);
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value="/listar")
	public List<Consulente> obterLista();
	
	@PostMapping(value="/listar")
	public List<Consulente> obterLista(@RequestBody Usuario usuario);
	
	@GetMapping(value="/{id}/obter")
	public Consulente obter(@PathVariable Integer id);
}
