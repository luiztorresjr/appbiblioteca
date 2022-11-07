package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appbiblioteca.model.service.ArtigoService;



@Controller
public class ArtigoController {
	
	@Autowired
	private ArtigoService artigoService;
		
	@GetMapping(value="/artigo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		artigoService.excluir(id);
		return "redirect:/artigo/lista";
	}
	
	@GetMapping(value="/artigo/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", artigoService.obterLista());
		return "artigo/lista";
	}
}
