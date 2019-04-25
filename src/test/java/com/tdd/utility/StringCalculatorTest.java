package com.tdd.utility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is test class for String calculator with various scenarious.
 * @author Rupesh
 *
 */
public class StringCalculatorTest {
	
	/**
	 *This will test add utility with empty number string. 
	 */
	@Test
	public void testAdd_emptyInput() {
		StringCalculator stringCalculator=new StringCalculator();
		assertEquals(stringCalculator.add(""),0);
	}
}
