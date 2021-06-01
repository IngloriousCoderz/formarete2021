package it.formarete.designpatterns.mvc.strategy;

import it.formarete.designpatterns.mvc.Model;
import it.formarete.designpatterns.observer.Observer;
import it.formarete.designpatterns.observer.Subject;

public class ModelWithSubject implements Model {
	private String attribute;

	private Subject subject;

	public ModelWithSubject() {
		this.subject = new Subject();
	}

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
		subject.notifyObservers(attribute);
	}

	public void registerObserver(Observer observer) {
		subject.registerObserver(observer);
	}
}
