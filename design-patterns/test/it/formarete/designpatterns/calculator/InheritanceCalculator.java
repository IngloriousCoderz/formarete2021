package it.formarete.designpatterns.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class InheritanceCalculator {
	@Test
	public void testValidInput() {
		Calculator calc = new ValidatingCalculator();
		assertEquals(5, calc.sum(2, 3));
	}

	@Test
	public void testInvalidInput() {
		Calculator calc = new ValidatingCalculator();
		assertThrows(IllegalArgumentException.class, () -> calc.sum(null, 3));
	}
}
