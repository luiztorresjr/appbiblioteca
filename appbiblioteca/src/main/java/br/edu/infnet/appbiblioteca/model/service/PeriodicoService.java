package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;
import br.edu.infnet.appbiblioteca.model.repository.PeriodicoRepository;
@Service
public class PeriodicoService {
	@Autowired
	private PeriodicoRepository periodicoRepository;
	
	public void incluir(Periodico emprestimo) {
		periodicoRepository.save(emprestimo);
	}
	
	public void excluir(Integer id) {
		periodicoRepository.deleteById(id);
	}
	
	public Collection<Periodico> obterLista(){
		return (Collection<Periodico>) periodicoRepository.findAll();
	}
}
