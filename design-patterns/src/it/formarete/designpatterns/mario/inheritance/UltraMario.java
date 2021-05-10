package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class UltraMario extends SuperMario {

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case JUMP:
			return "glide";

		case ACTION:
			return "shoot";

		default:
			return super.onKeyPressed(keyCode);
		}
	}
}
