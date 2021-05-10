package it.formarete.designpatterns.mario.decorator;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class SuperDecorator implements Mario {
	private Mario mario;

	public SuperDecorator(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return "stomp";

		default:
			return mario.onKeyPressed(keyCode);
		}
	}

}
