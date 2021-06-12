package it.formarete.studentmanager.api;

import java.util.Optional;

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

import it.formarete.studentmanager.domain.User;
import it.formarete.studentmanager.persistence.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@RequestBody User body) {
		return userRepository.save(body);
	}

	@GetMapping
	public Iterable<User> read() {
		return userRepository.findAll();
	}

	@PutMapping("/{id}")
	public User update(@PathVariable Long id, @RequestBody User body) {
		body.setId(id);
		return userRepository.save(body);
	}

	@PatchMapping("/{id}")
	public User patch(@PathVariable Long id, @RequestBody User body) {
		Optional<User> optionalUser = userRepository.findById(id);
		User user = optionalUser.get();
		if (body.getUsername() != null) {
			user.setUsername(body.getUsername());
		}
		if (body.getPassword() != null) {
			user.setPassword(body.getPassword());
		}
		return userRepository.save(user);
	}

	@DeleteMapping("/{id}")
	public User delete(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		userRepository.delete(user.get());
		return user.get();
	}
}
