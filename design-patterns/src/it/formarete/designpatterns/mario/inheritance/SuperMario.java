package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class SuperMario extends BaseMario {

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return "stomp";

		default:
			return super.onKeyPressed(keyCode);
		}
	}
}
