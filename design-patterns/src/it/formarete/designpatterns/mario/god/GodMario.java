package it.formarete.designpatterns.mario.god;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class GodMario implements Mario {
	private Type type;

	public GodMario(Type type) {
		this.type = type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		switch (keyCode) {
		case DOWN:
			return type == Type.BASE ? "crouch" : "stomp";

		case JUMP:
			switch (type) {
			case CAPE:
			case ULTRA:
				return "glide";

			default:
				return "jump";
			}

		case ACTION:
			switch (type) {
			case FIRE:
			case ULTRA:
				return "shoot";

			default:
				return "run";
			}

		default:
			return "";
		}
	}
}
