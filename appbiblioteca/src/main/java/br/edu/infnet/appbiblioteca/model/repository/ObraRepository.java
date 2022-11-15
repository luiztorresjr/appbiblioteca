package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Obra;

@Repository
public interface ObraRepository extends CrudRepository<Obra, Integer> {

	@Query("from Obra p where p.usuario.id =:userid")
	List<Obra> obterLista(Integer userid);
}
