package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HourglassTest {
	@Test
	public void testEvenRows() {
		Hourglass hourglass = new Hourglass(7);
		
		String output = hourglass.build();
		
		assertEquals("*******\n *****\n  ***\n   *\n  ***\n *****\n*******\n", output);
	}
}
