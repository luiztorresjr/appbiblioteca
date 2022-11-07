package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Livro;
import br.edu.infnet.appbiblioteca.model.repository.LivroRepository;
@Service
public class LivroService {
	@Autowired
	private LivroRepository livroRepository;
	
	public void incluir(Livro livro) {
		livroRepository.save(livro);
	}
	
	public void excluir(Integer id) {
		livroRepository.deleteById(id);
	}
	
	public Collection<Livro> obterLista(){
		return (Collection<Livro>) livroRepository.findAll();
	}
}
