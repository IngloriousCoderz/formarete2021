package it.formarete.designpatterns.mvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mvc.decorator.ObservableDecorator;
import it.formarete.designpatterns.mvc.god.GodModel;
import it.formarete.designpatterns.mvc.inheritance.SubjectModel;
import it.formarete.designpatterns.mvc.strategy.ModelWithSubject;
import it.formarete.designpatterns.observer.Subject;

public class ControllerTest {
	@Test
	public void testGodObject() {
		// given
		Model model = new GodModel();
		View view = new View();
		Controller controller = new Controller();
		controller.setModel(model);
		((GodModel) model).registerObserver(view);

		// when
		controller.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}

	@Test
	public void testInheritance() {
		// given
		Model model = new SubjectModel();
		View view = new View();
		Controller controller = new Controller();
		controller.setModel(model);
		((Subject) model).registerObserver(view);

		// when
		controller.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}

	@Test
	public void testStrategy() {
		// given
		Model model = new ModelWithSubject();
		View view = new View();
		Controller controller = new Controller();
		controller.setModel(model);
		((ModelWithSubject) model).registerObserver(view);

		// when
		controller.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}

	@Test
	public void testDecorator() {
		// given
		Model model = new ModelImpl();
		model = new ObservableDecorator(model);
		View view = new View();
		Controller controller = new Controller();
		controller.setModel(model);
		((Subject) model).registerObserver(view);

		// when
		controller.handleInput("world");

		// then
		assertEquals("world", model.getAttribute());
		assertEquals("<h1>Hello world!</h1>", view.render());
	}
}
