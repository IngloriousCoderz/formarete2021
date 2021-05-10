package it.formarete.designpatterns.mario.inheritance;

import it.formarete.designpatterns.mario.KeyCode;

public class FireMario extends SuperMario {
	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case ACTION:
			return "shoot";

		default:
			return super.onKeyPressed(keyCode);
		}
	}
}
