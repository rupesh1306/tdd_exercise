package com.tdd.utility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This is test class for String calculator with various scenarious.
 * @author Rupesh
 *
 */
public class StringCalculatorTest {
	
	private StringCalculator stringCalculator;
	
	/**
	 * This method is to initialize test class.
	 */
	@Before
	public void init() {
		stringCalculator=new StringCalculator();
	}
	
	/**
	 *This will test add utility with empty number string. 
	 */
	@Test
	public void testAdd_emptyInput() {
		assertEquals(0,stringCalculator.add(""));
	}
	
	/**
	 *This will test add utility with single number string. 
	 */
	@Test
	public void testAdd_singleInput() {
		assertEquals(1,stringCalculator.add("1"));
	}
	
	/**
	 *This will test add utility with two number string. 
	 */
	@Test
	public void testAdd_twoNumberCommaSaperatedInput() {
		assertEquals(4,stringCalculator.add("1,3"));
	}
}
