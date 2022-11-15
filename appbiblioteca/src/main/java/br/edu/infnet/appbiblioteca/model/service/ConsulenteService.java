package br.edu.infnet.appbiblioteca.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appbiblioteca.clients.IConsulenteClient;
import br.edu.infnet.appbiblioteca.clients.IEnderecoClient;
import br.edu.infnet.appbiblioteca.model.domain.Consulente;
import br.edu.infnet.appbiblioteca.model.domain.Endereco;
import br.edu.infnet.appbiblioteca.model.domain.Usuario;
@Service
public class ConsulenteService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	@Autowired
	private IConsulenteClient consulenteClient;
	
	public void incluir(Consulente consulente) {
		consulenteClient.incluir(consulente);
	}
	
	public void excluir(Integer id) {
		consulenteClient.excluir(id);
	}
	
	public Collection<Consulente> obterLista(){
		return (Collection<Consulente>) consulenteClient.obterLista();
	}
	
	public Collection<Consulente> obterLista(Usuario usuario){
		return (Collection<Consulente>) consulenteClient.obterLista(usuario);
	}
	
	public Consulente obter(Integer id) {
		return consulenteClient.obter(id);
	}
	
	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}
