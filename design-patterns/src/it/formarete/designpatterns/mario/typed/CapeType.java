package it.formarete.designpatterns.mario.typed;

import it.formarete.designpatterns.mario.KeyCode;

public class CapeType extends SuperType {

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
