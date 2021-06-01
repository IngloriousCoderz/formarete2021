package it.formarete.designpatterns.mvc.inheritance;

import java.util.ArrayList;
import java.util.List;

import it.formarete.designpatterns.mvc.ModelImpl;
import it.formarete.designpatterns.observer.Observer;

public class ObservableModel extends ModelImpl {
	private List<Observer> observers;

	public ObservableModel() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void setAttribute(String attribute) {
		super.setAttribute(attribute);
		notifyObservers(attribute);
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
