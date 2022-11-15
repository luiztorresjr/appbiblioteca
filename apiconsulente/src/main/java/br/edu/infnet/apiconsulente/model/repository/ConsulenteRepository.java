package br.edu.infnet.apiconsulente.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.apiconsulente.model.domain.Consulente;

public interface ConsulenteRepository extends CrudRepository<Consulente, Integer>{
	@Query("from Consulente c where c.usuario.id = :userid")
	List<Consulente> obterLista(Integer  userid);
}
