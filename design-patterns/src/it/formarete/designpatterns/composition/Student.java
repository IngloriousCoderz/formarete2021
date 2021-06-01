package it.formarete.designpatterns.composition;

public class Student {
	private Strategy strategy;
	
	public void doHomework() {
		strategy.doHomework();
	}
}
