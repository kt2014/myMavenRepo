package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import project.StringOperation;

public class testString {


	@Test
	public void testConcat() {
		StringOperation so = new StringOperation();
		String actual = so.concat("mickey", "mouse");
		String expected = "mickeymouse";
		assertEquals(expected, actual);
	}
	
	public void testLength() {
		StringOperation so = new StringOperation();
		int actual = so.length("mickey", "mouse");
		int expected=5;
		assertEquals(expected,actual);
	}

	public void testContains() {
		StringOperation so = new StringOperation();
		String actual = so.contains("mickey", "mouse");
		boolean expected = false;
	}
}
