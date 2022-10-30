package br.edu.infnet.appbiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Obra;


@Controller
public class ObraController {
	private static Map<Integer, Obra> mapa = new HashMap<Integer, Obra>();
	private static int id = 1;
	
	public static void incluir(Obra obra) {
		obra.setId(id++);
		mapa.put(obra.getId(), obra);
	}
	
	
	private static Collection<Obra> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value="/obra/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/obra/lista";
	}
	
	@GetMapping(value="/obra/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "obra/lista";
	}
}
