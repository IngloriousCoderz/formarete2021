package it.formarete.designpatterns.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.calculator.god.GodCalculator;

public class GodCalculatorTest {
	@Test
	public void testValidInput() {
		Calculator calc = new GodCalculator();
		assertEquals(5, calc.sum(2, 3));
	}

	@Test
	public void testInvalidInput() {
		Calculator calc = new GodCalculator();
		assertThrows(IllegalArgumentException.class, () -> calc.sum(null, 3));
	}
}
