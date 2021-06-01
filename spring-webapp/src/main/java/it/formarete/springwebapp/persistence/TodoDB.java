package it.formarete.springwebapp.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import it.formarete.springwebapp.domain.Todo;

@Repository
public class TodoDB {
	private static int id = 1;

	private Map<Integer, Todo> todos;

	public TodoDB() {
		todos = new HashMap<>();
		add("Learn Java", true);
		add("Seek for a job", false);
		add("Forget everything", null);
	}

	public List<Todo> findAll() {
		return new ArrayList<>(todos.values());
	}

	public Todo findById(Integer id) {
		return todos.get(id);
	}

	public Todo add(String text, Boolean done) {
		Todo todo = new Todo();
		todo.setText(text);
		todo.setDone(done);
		return save(todo);
	}

	public Todo save(Todo todo) {
		boolean isNew = todo.getId() == null;
		if (isNew) {
			todo.setId(id);
			id++;
		}
		todos.put(todo.getId(), todo);
		return todo;
	}

	public Todo merge(Todo changes) {
		Todo todo = findById(changes.getId());
		if (changes.getText() != null) {
			todo.setText(changes.getText());
		}
		if (changes.getDone() != null) {
			todo.setDone(changes.getDone());
		}
		return save(todo);
	}

	public Todo delete(Integer id) {
		return todos.remove(id);
	}

	public Todo delete(Todo todo) {
		return delete(todo.getId());
	}
}
