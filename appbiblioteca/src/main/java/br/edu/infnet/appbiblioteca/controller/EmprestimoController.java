package br.edu.infnet.appbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.service.ConsulenteService;
import br.edu.infnet.appbiblioteca.model.service.EmprestimoService;
import br.edu.infnet.appbiblioteca.model.service.ObraService;


@Controller
public class EmprestimoController {
	
	
	
	@Autowired
	private EmprestimoService emprestimoService;
	@Autowired
	private ConsulenteService consulenteService;
	@Autowired
	private ObraService ObraService;
	
	@GetMapping(value="/emprestimo")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("consulentes", consulenteService.obterLista(usuario));
		
		model.addAttribute("obras", ObraService.obterLista());
		
		return "emprestimo/cadastro";
	}
	
	
	@GetMapping(value="/emprestimo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		emprestimoService.excluir(id);
		return "redirect:/emprestimo/lista";
	}
	
	@GetMapping(value="/emprestimo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", emprestimoService.obterLista(usuario));
		return "emprestimo/lista";
	}
	
	@PostMapping(value = "/emprestimo/incluir")
	public String incluir(Emprestimo emprestimo, @SessionAttribute("user") Usuario usuario) {
		
		Consulente consulente = consulenteService.obter(emprestimo.getConsulente().getId());
		emprestimo.setConsulente(consulente);
		emprestimo.setUsuario(usuario);
		
		emprestimoService.incluir(emprestimo);
		
		return "redirect:/emprestimo/lista";
	}
	
	
	
}
