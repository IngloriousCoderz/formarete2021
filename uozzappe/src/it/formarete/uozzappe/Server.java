package it.formarete.uozzappe;

import java.util.ArrayList;
import java.util.List;

public class Server extends Subject {
	private List<String> messages;

	public Server() {
		super();
		messages = new ArrayList<>();
	}

	public void receive(String message) {
		messages.add(message);
		push(message);
	}

	public List<String> getMessages() {
		return messages;
	}
}
