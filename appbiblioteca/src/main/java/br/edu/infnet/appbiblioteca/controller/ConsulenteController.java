package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.ConsulenteService;



@Controller
public class ConsulenteController {
	
	@Autowired
	private ConsulenteService consulenteService;	
	
	@GetMapping(value="/consulente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		consulenteService.excluir(id);
		return "redirect:/consulente/lista";
	}
	
	@GetMapping(value="/consulente/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", consulenteService.obterLista());
		return "consulente/lista";
	}
	
	@GetMapping(value="/consulente")
	public String telaCadastro() {
		return "consulente/cadastro";
	}
	
	@PostMapping(value="/consulente/incluir")
	public String incluir(Consulente consulente, @SessionAttribute("user") Usuario usuario) {
		consulente.setUsuario(usuario);
		consulenteService.incluir(consulente);
		return "redirect:/consulente/lista";
	}
}