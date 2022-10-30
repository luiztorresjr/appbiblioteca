package br.edu.infnet.appbiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Livro;

@Controller
public class LivroController {
	private static Map<Integer, Livro> mapa = new HashMap<Integer, Livro>();
	private static Integer id = 1;
	
	public static void incluir(Livro livro) {
		livro.setId(id++);
		mapa.put(livro.getId(), livro);
	}
	
	public static Collection<Livro> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value="/livro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/livro/lista";
	}
	
	@GetMapping(value="/livro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "livro/lista";
	}
}
