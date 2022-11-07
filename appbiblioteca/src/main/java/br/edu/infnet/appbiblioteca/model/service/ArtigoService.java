package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Artigo;
import br.edu.infnet.appbiblioteca.model.repository.ArtigoRepository;
@Service
public class ArtigoService {
	
	@Autowired
	private ArtigoRepository artigoRepository;
	
	public void incluir(Artigo artigo) {
		artigoRepository.save(artigo);
	}
	
	public void excluir(Integer id) {
		artigoRepository.deleteById(id);
	}
	
	public Collection<Artigo> obterLista(){
		return (Collection<Artigo>) artigoRepository.findAll();	
	}
}
