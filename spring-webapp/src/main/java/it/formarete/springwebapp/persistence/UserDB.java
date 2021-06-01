package it.formarete.springwebapp.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import it.formarete.springwebapp.domain.User;

@Repository
public class UserDB {
	private static int id = 1;

	private Map<Integer, User> users;

	public UserDB() {
		users = new HashMap<>();
		add("pippobaudo", "P1pp0B4ud0!");
		add("giancarlomagalli", "G14nc4rl0M4g4ll1!");
	}

	public List<User> findAll() {
		return new ArrayList<>(users.values());
	}

	public User findById(Integer id) {
		return users.get(id);
	}

	public User add(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return save(user);
	}

	public User save(User user) {
		boolean isNew = user.getId() == null;
		if (isNew) {
			user.setId(id);
			id++;
		}
		users.put(user.getId(), user);
		return user;
	}

	public User merge(User changes) {
		User user = findById(changes.getId());
		if (changes.getUsername() != null) {
			user.setUsername(changes.getUsername());
		}
		if (changes.getPassword() != null) {
			user.setPassword(changes.getPassword());
		}
		return save(user);
	}

	public User delete(Integer id) {
		return users.remove(id);
	}

	public User delete(User user) {
		return delete(user.getId());
	}
}
