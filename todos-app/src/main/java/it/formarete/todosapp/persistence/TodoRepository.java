package it.formarete.todosapp.persistence;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.formarete.todosapp.domain.Todo;
import it.formarete.todosapp.domain.User;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

	@Override
	List<Todo> findAll();

//	Todo findById(int id);

	// from Todo t where t.author = :author
	List<Todo> findByAuthor(User author);

	@Transactional
	@Modifying
	@Query("delete from Todo t where t.text = :text")
	void deleteTodos(@Param("text") String text);
}
