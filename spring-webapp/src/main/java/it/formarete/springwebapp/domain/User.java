package it.formarete.springwebapp.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {
	private Integer id;
	private String username;
	private String password;
}
