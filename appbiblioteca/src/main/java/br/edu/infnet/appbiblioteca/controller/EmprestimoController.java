package br.edu.infnet.appbiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;


@Controller
public class EmprestimoController {

	private static Map<Integer, Emprestimo> mapa = new HashMap<Integer, Emprestimo>();
	private static int id = 1;
		
	public static void incluir(Emprestimo emprestimo) {
		emprestimo.setId(id++);
		mapa.put(emprestimo.getId(), emprestimo);
	}
	
	public static Collection<Emprestimo> obterLista(){
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	@GetMapping(value="/emprestimo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/emprestimo/lista";
	}
	
	@GetMapping(value="/emprestimo/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "emprestimo/lista";
	}
}
