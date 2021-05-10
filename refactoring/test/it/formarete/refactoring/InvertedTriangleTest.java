package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InvertedTriangleTest {
	@Test
	public void testEvenRows() {
		// given
		InvertedTriangle triangle = new InvertedTriangle(4);

		// when
		String output = triangle.build();

		// then
		assertEquals("*******\n *****\n  ***\n   *\n", output);
	}

	@Test
	public void testBuildRow() {
		InvertedTriangle triangle = new InvertedTriangle(4);

		assertEquals("*******", triangle.buildRow(0));
		assertEquals(" *****", triangle.buildRow(1));
		assertEquals("  ***", triangle.buildRow(2));
		assertEquals("   *", triangle.buildRow(3));
	}
	
	@Test
	public void testBuildSpaces() {
		InvertedTriangle triangle = new InvertedTriangle(4);

		assertEquals("", triangle.buildSpaces(0));
		assertEquals(" ", triangle.buildSpaces(1));
		assertEquals("  ", triangle.buildSpaces(2));
		assertEquals("   ", triangle.buildSpaces(3));
	}
	
	@Test
	public void testBuildAsterisks() {
		InvertedTriangle triangle = new InvertedTriangle(4);

		assertEquals("*******", triangle.buildAsterisks(0));
		assertEquals("*****", triangle.buildAsterisks(1));
		assertEquals("***", triangle.buildAsterisks(2));
		assertEquals("*", triangle.buildAsterisks(3));
	}
}
