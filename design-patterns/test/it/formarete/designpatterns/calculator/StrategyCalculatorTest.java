package it.formarete.designpatterns.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.calculator.strategy.CalculatorWithStrategies;

public class StrategyCalculatorTest {
	@Test
	public void testValidInput() {
		Calculator calc = new CalculatorWithStrategies();
		assertEquals(5, calc.sum(2, 3));
	}

	@Test
	public void testInvalidInput() {
		Calculator calc = new CalculatorWithStrategies();
		assertThrows(IllegalArgumentException.class, () -> calc.sum(null, 3));
	}
}
