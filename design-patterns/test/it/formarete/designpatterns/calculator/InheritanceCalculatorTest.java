package it.formarete.designpatterns.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.calculator.inheritance.LoggingAndValidatingCalculator;

public class InheritanceCalculatorTest {
	@Test
	public void testValidInput() {
		Calculator calc = new LoggingAndValidatingCalculator();
		assertEquals(5, calc.sum(2, 3));
	}

	@Test
	public void testInvalidInput() {
		Calculator calc = new LoggingAndValidatingCalculator();
		assertThrows(IllegalArgumentException.class, () -> calc.sum(null, 3));
	}
}
