package it.formarete.uozzappe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Client> clients;

	public Subject() {
		clients = new ArrayList<>();
	}

	public void register(Client client) {
		clients.add(client);
		client.setServer(this);
	}

	public void push(String message) {
		for (Client client : clients) {
			client.receive(message);
		}
	}
}
