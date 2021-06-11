package it.formarete.todosapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.formarete.todosapp.domain.Todo;
import it.formarete.todosapp.domain.User;
import it.formarete.todosapp.persistence.TodoRepository;

@RestController
@RequestMapping("/todos")
@CrossOrigin
public class TodoController {
	@Autowired
	private TodoRepository todos;

	@GetMapping
	public List<Todo> all(@RequestParam(name = "author", required = false) Integer authorId) {
		if (authorId == null) {
			return todos.findAll();
		}

		User author = new User();
		author.setId(authorId);
		return todos.findByAuthor(author);
	}

	@GetMapping("/{id}")
	public Todo get(@PathVariable Integer id) {
		return todos.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found."));
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Todo add(@RequestBody Todo body) {
		return todos.save(body);
	}

	@PutMapping("/{id}")
	public Todo replace(@PathVariable Integer id, @RequestBody Todo body) {
		Todo todo = get(id);
		body.setId(todo.getId());
		return todos.save(body);
	}

	@PatchMapping("/{id}")
	public Todo merge(@PathVariable Integer id, @RequestBody Todo body) {
		Todo todo = get(id);
		if (body.getText() != null) {
			todo.setText(body.getText());
		}
		if (body.getDone() != null) {
			todo.setDone(body.getDone());
		}
		return todos.save(todo);
	}

	@DeleteMapping("/{id}")
	public Todo remove(@PathVariable Integer id) {
		Todo todo = get(id);
		todos.delete(todo);
		return todo;
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAll(@RequestParam String text) {
		todos.deleteTodos(text);
	}
}
