package it.formarete.todosapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import it.formarete.todosapp.domain.User;
import it.formarete.todosapp.persistence.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository users;

	@GetMapping
	public List<User> all() {
		return users.findAll();
	}

	@GetMapping("/{id}")
	public User get(@PathVariable Integer id) {
		return users.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found."));
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User add(@RequestBody User body) {
		return users.save(body);
	}

	@PutMapping("/{id}")
	public User replace(@PathVariable Integer id, @RequestBody User body) {
		User user = get(id);
		body.setId(user.getId());
		return users.save(body);
	}

	@PatchMapping("/{id}")
	public User merge(@PathVariable Integer id, @RequestBody User body) {
		User user = get(id);
		if (body.getUsername() != null) {
			user.setUsername(body.getUsername());
		}
		if (body.getPassword() != null) {
			user.setPassword(body.getPassword());
		}
		return users.save(user);
	}

	@DeleteMapping("/{id}")
	public User remove(@PathVariable Integer id) {
		User user = get(id);
		users.delete(user);
		return user;
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAll(@RequestParam String username) {
//		users.deleteUsers(username);
		users.deleteByUsername(username);
	}
}
