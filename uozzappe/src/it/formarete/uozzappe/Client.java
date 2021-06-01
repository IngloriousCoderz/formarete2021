package it.formarete.uozzappe;

public interface Client {
	public void setServer(Subject server);

	public void receive(String message);
}
