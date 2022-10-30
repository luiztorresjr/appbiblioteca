package br.edu.infnet.appbiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Artigo;



@Controller
public class ArtigoController {

	private static Map<Integer, Artigo> mapa = new HashMap<Integer, Artigo>();
	private static int id = 1;
	
	public static void incluir(Artigo artigo) {
		artigo.setId(id++);
		mapa.put(artigo.getId(), artigo);
	}
	
	public static Collection<Artigo> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value="/artigo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/artigo/lista";
	}
	
	@GetMapping(value="/artigo/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "artigo/lista";
	}
}
