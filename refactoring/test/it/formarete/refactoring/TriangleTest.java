package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
	@Test
	public void testBuild() {
		// given
		Triangle triangle = new Triangle(4);
		
		// when
		String output = triangle.build();
		
		// then
		assertEquals(
			"   *\n"
		  + "  ***\n"
		  + " *****\n"
		  + "*******\n", output);
	}
}
