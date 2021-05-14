package it.formarete.designpatterns.mvc.god;

import java.util.ArrayList;
import java.util.List;

import it.formarete.designpatterns.mvc.Model;
import it.formarete.designpatterns.observer.Observer;

public class GodModel implements Model {
	private String attribute;

	private List<Observer> observers;

	public GodModel() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public String getAttribute() {
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
		notifyObservers(this.attribute);
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers(String message) {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
}
