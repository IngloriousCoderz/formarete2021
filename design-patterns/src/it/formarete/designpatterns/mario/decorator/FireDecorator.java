package it.formarete.designpatterns.mario.decorator;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class FireDecorator implements Mario {
	private Mario mario;

	public FireDecorator(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case ACTION:
			return "shoot";

		default:
			return mario.onKeyPressed(keyCode);
		}
	}

}
