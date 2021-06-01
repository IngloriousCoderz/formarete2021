package it.formarete.todosapp.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.formarete.todosapp.domain.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

	@Override
	List<Todo> findAll();

//	Todo findById(int id);
}
