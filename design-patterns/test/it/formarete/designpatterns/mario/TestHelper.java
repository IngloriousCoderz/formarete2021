package it.formarete.designpatterns.mario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelper {
	static void testBaseMario(Mario mario) {
		assertEquals("crouch", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("jump", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("run", mario.onKeyPressed(KeyCode.ACTION));
	}

	static void testSuperMario(Mario mario) {
		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("jump", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("run", mario.onKeyPressed(KeyCode.ACTION));
	}
	
	static void testFireMario(Mario mario) {
		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("jump", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("shoot", mario.onKeyPressed(KeyCode.ACTION));
	}
	
	static void testCapeMario(Mario mario) {
		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("glide", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("run", mario.onKeyPressed(KeyCode.ACTION));
	}
	
	static void testNewTypeOfMario(Mario mario) {
		assertEquals("stomp", mario.onKeyPressed(KeyCode.DOWN));
		assertEquals("glide", mario.onKeyPressed(KeyCode.JUMP));
		assertEquals("shoot", mario.onKeyPressed(KeyCode.ACTION));
	}
}
