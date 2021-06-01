package it.formarete.todosapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;

//	@OneToMany(fetch = FetchType.EAGER)
//	@JoinColumn(name = "author_id", referencedColumnName = "id")
//	@OneToMany
//	private List<Todo> todos;
}
