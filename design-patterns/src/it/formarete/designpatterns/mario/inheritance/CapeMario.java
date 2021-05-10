package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class CapeMario extends SuperMario {

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case JUMP:
			return "glide";

		default:
			return super.onKeyPressed(keyCode);
		}
	}
}
