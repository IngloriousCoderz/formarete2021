package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpacesAndAsterisksTest {
	private Triangle triangle;

	@BeforeAll
	public static void setUpAll() {

	}

	@AfterAll
	public static void tearDownAll() {

	}

	@BeforeEach
	public void setUp() {
		// given
		triangle = new Triangle(4);
	}

	@AfterEach
	public void tearDown() {

	}

	@Test
	public void testBuildSpacesOnFirstRow() {
		// when
		String output = triangle.buildSpaces(0);

		// then
		assertEquals("   ", output);
	}

	@Test
	public void testBuildSpacesOnSecondRow() {
		// when
		String output = triangle.buildSpaces(1);

		// then
		assertEquals("  ", output);
	}

	@Test
	public void testBuildSpacesOnThirdRow() {
		// when
		String output = triangle.buildSpaces(2);

		// then
		assertEquals(" ", output);
	}

	@Test
	public void testBuildSpacesOnLastRow() {
		// when
		String output = triangle.buildSpaces(3);

		// then
		assertEquals("", output);
	}
	
	@Test
	public void testBuildAsteriskssOnFirstRow() {
		// when
		String output = triangle.buildAsterisks(0);

		// then
		assertEquals("*", output);
	}

	@Test
	public void testBuildAsterisksOnSecondRow() {
		// when
		String output = triangle.buildAsterisks(1);

		// then
		assertEquals("***", output);
	}

	@Test
	public void testBuildAsterisksOnThirdRow() {
		// when
		String output = triangle.buildAsterisks(2);

		// then
		assertEquals("*****", output);
	}

	@Test
	public void testBuildAsterisksOnLastRow() {
		// when
		String output = triangle.buildAsterisks(3);

		// then
		assertEquals("*******", output);
	}
}
