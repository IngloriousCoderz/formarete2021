package it.formarete.springwebapp.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Todo {
	private Integer id;
	private String text;
	private Boolean done;
}
