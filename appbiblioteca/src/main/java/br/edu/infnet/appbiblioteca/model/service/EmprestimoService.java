package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
import br.edu.infnet.appbiblioteca.model.repository.EmprestimoRepository;
@Service
public class EmprestimoService {
	
	@Autowired
	private EmprestimoRepository emprestimoRepository;
	
	public void incluir(Emprestimo emprestimo) {
		emprestimoRepository.save(emprestimo);
	}
	
	public void excluir(Integer id) {
		emprestimoRepository.deleteById(id);
	}
	
	public Collection<Emprestimo> obterLista(){
		return (Collection<Emprestimo>) emprestimoRepository.findAll();
	}
	
	public Collection<Emprestimo> obterLista(Usuario usuario){
		return (Collection<Emprestimo>) emprestimoRepository.obterLista(usuario.getId());
	}
}
