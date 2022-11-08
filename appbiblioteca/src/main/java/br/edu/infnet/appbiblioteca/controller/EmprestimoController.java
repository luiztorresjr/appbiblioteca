package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;
import br.edu.infnet.appbiblioteca.model.service.EmprestimoService;


@Controller
public class EmprestimoController {
	
	@Autowired
	private EmprestimoService emprestimoService;
		
	@GetMapping(value="/emprestimo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		emprestimoService.excluir(id);
		return "redirect:/emprestimo/lista";
	}
	
	@GetMapping(value="/emprestimo/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", emprestimoService.obterLista());
		return "emprestimo/lista";
	}
	
	@PostMapping(value = "/emprestimo/incluir")
	public String incluir(Emprestimo emprestimo) {
		emprestimoService.incluir(emprestimo);
		return "redirect:/emprestimo/lista";
	}
	
	@GetMapping(value="/emprestimo")
	public String telaCadastro() {
		return "emprestimo/cadastro";
	}
	
}
