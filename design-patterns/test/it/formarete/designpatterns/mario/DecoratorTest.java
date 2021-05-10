package it.formarete.designpatterns.mario;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.mario.decorator.BaseMario;
import it.formarete.designpatterns.mario.decorator.CapeDecorator;
import it.formarete.designpatterns.mario.decorator.FireDecorator;
import it.formarete.designpatterns.mario.decorator.SuperDecorator;
import it.formarete.designpatterns.mario.decorator.UltraDecorator;

public class DecoratorTest {
	@Test
	public void testBaseMario() {
		Mario mario = new BaseMario();

		TestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new FireDecorator(mario);

		TestHelper.testFireMario(mario);
	}

	@Test
	public void testCapeMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new CapeDecorator(mario);

		TestHelper.testCapeMario(mario);
	}

	@Test
	public void testMushroom() {
		Mario mario = new BaseMario();

		TestHelper.testBaseMario(mario);

		mario = new SuperDecorator(mario);

		TestHelper.testSuperMario(mario);
	}

	@Test
	public void testNewTypeOfMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
//		mario = new FireDecorator(mario);
//		mario = new CapeDecorator(mario);
		mario = new UltraDecorator(mario);

		TestHelper.testNewTypeOfMario(mario);
	}
}
