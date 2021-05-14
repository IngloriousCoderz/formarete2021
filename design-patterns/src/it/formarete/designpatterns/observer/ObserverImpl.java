package it.formarete.designpatterns.observer;

public class ObserverImpl implements Observer {
	private String message;

	@Override
	public void update(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
