package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appbiblioteca.model.service.LivroService;

@Controller
public class LivroController {
	@Autowired
	private LivroService livroService;	
	
	
	@GetMapping(value="/livro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		livroService.excluir(id);
		return "redirect:/livro/lista";
	}
	
	@GetMapping(value="/livro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", livroService.obterLista());
		return "livro/lista";
	}
}
