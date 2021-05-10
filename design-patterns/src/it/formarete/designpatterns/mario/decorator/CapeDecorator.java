package it.formarete.designpatterns.mario.decorator;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class CapeDecorator implements Mario {
	private Mario mario;

	public CapeDecorator(Mario mario) {
		this.mario = mario;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case JUMP:
			return "glide";

		default:
			return mario.onKeyPressed(keyCode);
		}
	}

}
