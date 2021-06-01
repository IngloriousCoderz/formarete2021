package it.formarete.designpatterns.mvc.inheritance;

import it.formarete.designpatterns.mvc.Model;
import it.formarete.designpatterns.observer.Subject;

public class SubjectModel extends Subject implements Model {
	private String attribute;

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
		notifyObservers(attribute);
	}
}
