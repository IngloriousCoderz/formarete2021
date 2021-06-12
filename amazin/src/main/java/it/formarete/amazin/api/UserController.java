package it.formarete.amazin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.formarete.amazin.domain.User;
import it.formarete.amazin.persistence.UserRepository;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
	@Autowired
	private UserRepository users;

	@GetMapping
	public Iterable<User> findAll() {
		return users.findAll();
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable Integer id) {
		return users.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found."));
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@RequestBody User body) {
		return users.save(body);
	}

	@PutMapping("/{id}")
	public User update(@PathVariable Integer id, @RequestBody User body) {
		User user = findById(id);
		body.setId(user.getId());
		return users.save(body);
	}

	@DeleteMapping("/{id}")
	public User delete(@PathVariable Integer id) {
		User user = findById(id);
		users.delete(user);
		return user;
	}
}
