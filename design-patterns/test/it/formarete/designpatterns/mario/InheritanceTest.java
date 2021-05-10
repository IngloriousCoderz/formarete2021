package it.formarete.designpatterns.mario;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mario.inheritance.BaseMario;
import it.formarete.designpatterns.mario.inheritance.CapeMario;
import it.formarete.designpatterns.mario.inheritance.FireMario;
import it.formarete.designpatterns.mario.inheritance.SuperMario;
import it.formarete.designpatterns.mario.inheritance.UltraMario;

public class InheritanceTest {
	@Test
	public void testBaseMario() {
		Mario mario = new BaseMario();

		TestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new SuperMario();

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireMario() {
		Mario mario = new FireMario();

		TestHelper.testFireMario(mario);
	}

	@Test
	public void testCapeMario() {
		Mario mario = new CapeMario();

		TestHelper.testCapeMario(mario);
	}

	@Test
	public void testMushroom() {
		Mario mario = new BaseMario();

		TestHelper.testBaseMario(mario);

		mario = new SuperMario();

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testNewTypeOfMario() {
		Mario mario = new UltraMario();

		TestHelper.testNewTypeOfMario(mario);
	}
}
