package it.formarete.designpatterns.mvc;

import it.formarete.designpatterns.observer.Observer;

public class View implements Observer {
	private final static String TEMPLATE = "<h1>Hello ${variable}!</h1>";

	private String variable;

	public View() {
		variable = "nobody";
	}

	@Override
	public void update(String variable) {
		this.variable = variable;
	}

	public String render() {
		return TEMPLATE.replace("${variable}", variable);
	}
}
