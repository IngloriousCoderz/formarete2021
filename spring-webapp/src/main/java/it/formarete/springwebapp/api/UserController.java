package it.formarete.springwebapp.api;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.formarete.springwebapp.domain.User;
import it.formarete.springwebapp.persistence.UserDB;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserDB users;

	@GetMapping
	public List<User> all() {
		return users.findAll();
	}

	@GetMapping("/{id}")
	public User get(@PathVariable Integer id) {
		User user = users.findById(id);

		if (user == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.");
		}

		return user;
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
		body.setId(user.getId());
		return users.merge(body);
	}

	@DeleteMapping("/{id}")
	public User remove(@PathVariable Integer id) {
		User user = get(id);
		return users.delete(user);
	}
}
