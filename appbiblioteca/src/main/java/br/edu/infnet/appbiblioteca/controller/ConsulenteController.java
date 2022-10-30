package br.edu.infnet.appbiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;



@Controller
public class ConsulenteController {
	
	private static Map<Integer, Consulente> mapa = new HashMap<Integer, Consulente>();
	private static Integer id = 1;
	
	public static void incluir(Consulente consulente) {
		consulente.setRegistro(id++);
		mapa.put(consulente.getRegistro(), consulente);
	}
	
	public static Collection<Consulente> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value="/consulente/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/consulente/lista";
	}
	
	@GetMapping(value="/consulente/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "consulente/lista";
	}
}