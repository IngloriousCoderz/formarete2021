package it.formarete.designpatterns.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void testSum() {
		// given
		Calculator calc = new CalculatorImpl();

		// when
		int sum = calc.sum(2, 3);

		// then
		assertEquals(5, sum);
	}
}
