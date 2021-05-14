package it.formarete.designpatterns.mvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ViewTest {
	@Test
	public void shouldInit() {
		// given
		View view = new View();

		// when

		// then
		assertEquals("<h1>Hello nobody!</h1>", view.render());
	}

	@Test
	public void shouldUpdate() {
		// given
		View view = new View();

		// when
		view.update("world");

		// then
		assertEquals("<h1>Hello world!</h1>", view.render());
	}
}
