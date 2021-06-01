package it.formarete.springwebapp.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TodoTest {
	@Autowired
	private Todo todo;

	@Test
	public void testLombok() {
		todo.setDone(true);

		assertTrue(todo.getDone());
	}
}
