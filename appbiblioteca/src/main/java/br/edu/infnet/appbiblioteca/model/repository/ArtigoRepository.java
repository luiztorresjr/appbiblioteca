package br.edu.infnet.appbiblioteca.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Artigo;
@Repository
public interface ArtigoRepository extends CrudRepository<Artigo, Integer>{
	
}
