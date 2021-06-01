package it.formarete.servletjsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void testSum() {
		// given
		Calculator calc = new Calculator();

		// when
		int sum = calc.sum(2, 3);

		// then
		assertEquals(5, sum);
	}
}
