package it.formarete.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers;

	public Subject() {
		observers = new ArrayList<Observer>();
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
