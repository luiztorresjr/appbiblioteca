package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.repository.ConsulenteRepository;
@Service
public class ConsulenteService {
	
	@Autowired
	private ConsulenteRepository consulenteRepository;
	
	public void incluir(Consulente consulente) {
		consulenteRepository.save(consulente);
	}
	
	public void excluir(Integer id) {
		consulenteRepository.deleteById(id);
	}
	
	public Collection<Consulente> obterLista(){
		return (Collection<Consulente>) consulenteRepository.findAll();
	}
}
