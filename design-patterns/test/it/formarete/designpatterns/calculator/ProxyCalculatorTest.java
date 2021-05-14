package it.formarete.designpatterns.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import it.formarete.designpatterns.calculator.proxy.LoggerProxy;
import it.formarete.designpatterns.calculator.proxy.ValidatorProxy;

public class ProxyCalculatorTest {
	@Test
	public void testValidInput() {
		Calculator calc = new CalculatorImpl();
		calc = new ValidatorProxy(calc);
		calc = new LoggerProxy(calc);
		assertEquals(5, calc.sum(2, 3));
	}

	@Test
	public void testInvalidInput() {
		Calculator calc = new CalculatorImpl();
		calc = new ValidatorProxy(calc);
		calc = new LoggerProxy(calc);
		final Calculator finalCalc = calc;
		assertThrows(IllegalArgumentException.class, () -> finalCalc.sum(null, 3));
	}
}
