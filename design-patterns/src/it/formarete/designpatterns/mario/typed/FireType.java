package it.formarete.designpatterns.mario.typed;

import it.formarete.designpatterns.mario.KeyCode;

public class FireType extends SuperType {

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
