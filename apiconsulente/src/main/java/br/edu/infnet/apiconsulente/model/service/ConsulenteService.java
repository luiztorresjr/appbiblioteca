package br.edu.infnet.apiconsulente.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiconsulente.model.domain.Consulente;
import br.edu.infnet.apiconsulente.model.repository.ConsulenteRepository;

@Service
public class ConsulenteService {
	
	@Autowired
	private ConsulenteRepository consulenteRepository;
	
	public void incluir(Consulente consulente) {
		consulenteRepository.save(consulente);
	}
	
	public List<Consulente> obterLista(){
		return (List<Consulente>) consulenteRepository.findAll();
	}
	
	public List<Consulente> obterLista(Integer id){
		return (List<Consulente>) consulenteRepository.obterLista(id);
	}
	
	public void excluir(int id) {
		consulenteRepository.deleteById(id);
	}
	
	public Consulente obterConsulente(Integer id) {
		Consulente consulente = new Consulente();
		consulente =  (Consulente) consulenteRepository.findById(id).get();
		if(consulente != null) {
			return consulente;
		}
		return null;
	}
	
}
