package it.formarete.designpatterns.mario.typed;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class TypedMario implements Mario {
	private Type type;

	public TypedMario(Type type) {
		this.type = type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		return type.onKeyPressed(keyCode);
	}
}
