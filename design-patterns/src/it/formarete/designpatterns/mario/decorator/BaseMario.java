package it.formarete.designpatterns.mario.decorator;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class BaseMario implements Mario {

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return "crouch";

		case JUMP:
			return "jump";

		case ACTION:
			return "run";

		default:
			return "";
		}
	}

}
