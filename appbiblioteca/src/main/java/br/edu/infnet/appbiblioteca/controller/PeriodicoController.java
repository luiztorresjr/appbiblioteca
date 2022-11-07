package br.edu.infnet.appbiblioteca.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.service.PeriodicoService;

@Controller
public class PeriodicoController {

	@Autowired
	private PeriodicoService periodicoService;
	
	
	@GetMapping(value="/periodico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		periodicoService.excluir(id);
		return "redirect:/periodico/lista";
	}
	
	@GetMapping(value="/periodico/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", periodicoService.obterLista());
		return "periodico/lista";
	}
	
	@GetMapping(value="/periodico")
	public String telaCadatro() {
		return "periodico/cadastro";
	}
	
	@PostMapping(value="/periodico/incluir")
	public String incluir(Periodico periodico) {
		periodicoService.incluir(periodico);
		return "redirect:/usuario/lista";
	}
}
