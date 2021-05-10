package it.formarete.designpatterns.mario;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mario.god.GodMario;
import it.formarete.designpatterns.mario.god.Type;

public class GodObjectTest {
	@Test
	public void testBaseMario() {
		Mario mario = new GodMario(Type.BASE);

		TestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new GodMario(Type.SUPER);

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireMario() {
		Mario mario = new GodMario(Type.FIRE);

		TestHelper.testFireMario(mario);
	}

	@Test
	public void testCapeMario() {
		Mario mario = new GodMario(Type.CAPE);

		TestHelper.testCapeMario(mario);
	}

	@Test
	public void testMushroom() {
		Mario mario = new GodMario(Type.BASE);

		TestHelper.testBaseMario(mario);

		((GodMario) mario).setType(Type.SUPER);

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testNewTypeOfMario() {
		Mario mario = new GodMario(Type.ULTRA);

		TestHelper.testNewTypeOfMario(mario);
	}
}
