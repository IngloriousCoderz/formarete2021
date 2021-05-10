package it.formarete.designpatterns.mario.typed;

import it.formarete.designpatterns.mario.KeyCode;

public class UltraType extends SuperType {

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
