package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Obra;
import br.edu.infnet.appbiblioteca.model.repository.ObraRepository;

@Service
public class ObraService {
	@Autowired
	private ObraRepository obraRepository;
	
	
	public  void incluir(Obra obra) {
		obraRepository.save(obra);
	}	
	
	public  Collection<Obra> obterLista(){
		return (Collection<Obra>) obraRepository.findAll();
	}
	
	public  void excluir(Integer id) {
		obraRepository.deleteById(id);
	}
	
}
