package it.formarete.designpatterns.mario.decorator;

import it.formarete.designpatterns.mario.KeyCode;
import it.formarete.designpatterns.mario.Mario;

public class UltraDecorator implements Mario {
	private Mario mario;
	
	public UltraDecorator(Mario mario) {
		this.mario = mario;
		this.mario = new FireDecorator(this.mario);
		this.mario = new CapeDecorator(this.mario);
	}

	@Override
	public String onKeyPressed(KeyCode keyCode) {
		return mario.onKeyPressed(keyCode);
	}
}
