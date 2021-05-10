package it.formarete.designpatterns.mario.typed;

import it.formarete.designpatterns.mario.KeyCode;

public class SuperType extends BaseType {

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
