package it.formarete.designpatterns.mario.typed;

import it.formarete.designpatterns.mario.KeyCode;

public class BaseType implements Type {
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
