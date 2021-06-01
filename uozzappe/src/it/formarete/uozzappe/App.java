package it.formarete.uozzappe;

import java.util.ArrayList;
import java.util.List;

public class App implements Client {
	private String sender;
	private List<String> messages;
	private Subject server;

	public App(String sender) {
		this.sender = sender;
		messages = new ArrayList<>();
	}

	public void setServer(Subject server) {
		this.server = server;
	}

	public void send(String message) {
		((Server) server).receive("[" + sender + "]: " + message);
	}

	public void receive(String message) {
		messages.add(message);
	}

	public List<String> getMessages() {
		return messages;
	}
}
