package it.formarete.designpatterns.mvc.decorator;

import it.formarete.designpatterns.mvc.Model;
import it.formarete.designpatterns.observer.Subject;

public class ObservableDecorator extends Subject implements Model {
	private Model model;

	public ObservableDecorator(Model model) {
		this.model = model;
	}

	@Override
	public String getAttribute() {
		return model.getAttribute();
	}

	@Override
	public void setAttribute(String attribute) {
		model.setAttribute(attribute);
		notifyObservers(attribute);
	}
}
