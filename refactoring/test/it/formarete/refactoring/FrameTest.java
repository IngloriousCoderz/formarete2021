package it.formarete.refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrameTest {

	/* Behavior-Driven Development */
	
	@Test
	void testRighePari() {
		// fail("Not yet implemented");
		// assertEquals(true, true, "True is not false!");
		
		// given
		Frame frame = new Frame(10, 10, "ciao");
		
		// when
		String output = frame.build();
		
		// then
		assertEquals(
			  "* * * * * * * * * * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "*       ciao      * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "* * * * * * * * * * \n",
			output);
	}
	
	@Test
	void testRigheDispari() {
		Frame frame = new Frame(10, 7, "ciao");
		
		String output = frame.build();
		
		assertEquals(
			  "* * * * * * * * * * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "*       ciao      * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "* * * * * * * * * * \n",
			output);
	}
	
	@Test
	public void testLabelDispari() {
		Frame frame = new Frame(10, 10, "ciauz");
		
		String output = frame.build();
		
		assertEquals(
				  "* * * * * * * * * * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "*      ciauz      * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "*                 * \n"
				+ "* * * * * * * * * * \n",
				output);
	}
	
	@Test
	public void testBuildEmptyRow() {
		Frame frame = new Frame(10, 10, "ciao");
		
		String output = frame.buildEmptyRow();
		
		assertEquals(
			"*                 * \n",
			output);
	}
	
	@Test
	public void testBuildEmptyRows() {
		Frame frame = new Frame(10, 10, "ciao");
		
		String output = frame.buildEmptyRows(4);
		
		assertEquals(
			  "*                 * \n"
			+ "*                 * \n"
			+ "*                 * \n"
			+ "*                 * \n",
			output);
	}
	
	@Test
	public void testRowWithLabelPari() {
		Frame frame = new Frame(10, 10, "ciao");
		
		String output = frame.buildRowWithLabel();
		
		assertEquals(
			"*       ciao      * \n",
			output);
	}
	
	@Test
	public void testRowWithLabelDispari() {
		Frame frame = new Frame(10, 10, "ciauz");
		
		String output = frame.buildRowWithLabel();
		
		assertEquals(
			"*      ciauz      * \n",
			output);
	}
}
