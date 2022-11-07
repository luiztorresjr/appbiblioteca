package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appbiblioteca.model.service.ObraService;


@Controller
public class ObraController {
	
	@Autowired
	private ObraService obraService;
	
	@GetMapping(value="/obra/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		obraService.excluir(id);
		return "redirect:/obra/lista";
	}
	
	@GetMapping(value="/obra/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obraService.obterLista());
		return "obra/lista";
	}
}
