package br.edu.infnet.apiconsulente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiconsulente.model.domain.Consulente;
import br.edu.infnet.apiconsulente.model.domain.Usuario;
import br.edu.infnet.apiconsulente.model.service.ConsulenteService;

@RestController
@RequestMapping("/api/consulente")
public class ConsulenteController {

	@Autowired
	private ConsulenteService consulenteService;
	
	@GetMapping(value="/listar")
	public List<Consulente> obterLista(){
		return consulenteService.obterLista();
	}
	
	@PostMapping(value="/listar")
	public List<Consulente> obterLista(@RequestBody Usuario usuario) {
		return consulenteService.obterLista(usuario.getId());
	}
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Consulente consulente) {
		consulenteService.incluir(consulente);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable int id) {
		consulenteService.excluir(id);
	}
	
	@GetMapping(value="/{id}/obter")
	public Consulente obterConsulente(@PathVariable int id) {
		return consulenteService.obterConsulente(id);
	}
}
