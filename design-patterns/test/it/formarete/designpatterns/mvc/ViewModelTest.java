package it.formarete.designpatterns.mvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ViewModelTest {
	@Test
	public void shouldPassDataFromModelToView() {
		// given
		Model model = new ModelImpl();
		View view = new View();
		ViewModel vm = new ViewModel();
		vm.setModel(model);
		vm.setView(view);

		// when
		vm.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}
}
