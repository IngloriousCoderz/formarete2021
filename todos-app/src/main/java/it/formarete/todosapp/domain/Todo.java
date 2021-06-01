package it.formarete.todosapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String text;
	private Boolean done;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonIgnore
	@ManyToOne
	private User author;
}
