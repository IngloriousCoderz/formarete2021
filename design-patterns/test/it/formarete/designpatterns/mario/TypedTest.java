package it.formarete.designpatterns.mario;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mario.typed.BaseType;
import it.formarete.designpatterns.mario.typed.CapeType;
import it.formarete.designpatterns.mario.typed.FireType;
import it.formarete.designpatterns.mario.typed.SuperType;
import it.formarete.designpatterns.mario.typed.TypedMario;
import it.formarete.designpatterns.mario.typed.UltraType;

public class TypedTest {
	@Test
	public void testBaseMario() {
		Mario mario = new TypedMario(new BaseType());

		TestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new TypedMario(new SuperType());

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireMario() {
		Mario mario = new TypedMario(new FireType());

		TestHelper.testFireMario(mario);
	}

	@Test
	public void testCapeMario() {
		Mario mario = new TypedMario(new CapeType());

		TestHelper.testCapeMario(mario);
	}

	@Test
	public void testMushroom() {
		Mario mario = new TypedMario(new BaseType());

		TestHelper.testBaseMario(mario);

		((TypedMario) mario).setType(new SuperType());

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testNewTypeOfMario() {
		Mario mario = new TypedMario(new UltraType());

		TestHelper.testNewTypeOfMario(mario);
	}
}
