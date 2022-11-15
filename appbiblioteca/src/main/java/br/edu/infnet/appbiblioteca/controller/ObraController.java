package br.edu.infnet.appbiblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appbiblioteca.model.domain.Obra;
import br.edu.infnet.appbiblioteca.model.service.ObraService;


@Controller
public class ObraController {
	
	@Autowired
	private ObraService obraService;
	private static List<String> autores = new ArrayList<String>();
	
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
	
	@GetMapping(value="/obra")
	public String telaCadastro() {
		return "obra/cadastro";
	}
	
	@PostMapping(value="/obra/incluir")
	public String incluir(Obra obra) {
		obraService.incluir(obra);
		return "redirect:/obra/lista";
	}
	
	@PostMapping(value="/obra/autor")
	public void alterarAutor(Model model, String valor){
		String autor = model.getAttribute("autor").toString();
		Integer escolha = Integer.parseInt(valor);
		if(escolha == 1) {
			autores.add(autor);
		}else {
			autores.remove(autor);
		}
		model.addAttribute("autores", autores);
		
	}
}
