package br.edu.infnet.appbiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;

@Controller
public class PeriodicoController {

	private static Map<Integer, Periodico> mapa = new HashMap<Integer, Periodico>();
	private static int id=1;
	
	public static void incluir(Periodico periodico) {
		periodico.setId(id++);
		mapa.put(periodico.getId(), periodico);
	}
	
	public static Collection<Periodico> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value="/periodico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/periodico/lista";
	}
	
	@GetMapping(value="/periodico/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "periodico/lista";
	}
}
