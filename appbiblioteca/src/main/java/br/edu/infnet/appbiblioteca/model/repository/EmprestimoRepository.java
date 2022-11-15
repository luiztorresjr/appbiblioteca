package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Emprestimo;
@Repository
public interface EmprestimoRepository extends CrudRepository<Emprestimo, Integer> {
	@Query("from Emprestimo p where p.usuario.id =:userid")
	List<Emprestimo> obterLista(Integer userid);
}
