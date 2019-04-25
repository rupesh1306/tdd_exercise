package com.tdd.utility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This is test class for String calculator with various scenarious.
 * 
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
		stringCalculator = new StringCalculator();
	}

	/**
	 * This will test add utility with empty number string.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_emptyInput() throws IllegalArgumentException {
		assertEquals(0, stringCalculator.add(""));
	}

	/**
	 * This will test add utility with single number string.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_singleInput() throws IllegalArgumentException {
		assertEquals(1, stringCalculator.add("1"));
	}

	/**
	 * This will test add utility with two number string.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_twoNumberCommaSaperatedInput() throws IllegalArgumentException {
		assertEquals(4, stringCalculator.add("1,3"));
	}

	/**
	 * This will test add utility with N number string.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_nNumbersCommaSaperatedInput() throws IllegalArgumentException {
		assertEquals(9, stringCalculator.add("1,3,5"));
	}

	/**
	 * This will test add utility with two number string.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_nNumbersCommaAndLineCharacterSaperatedInput() throws IllegalArgumentException {
		assertEquals(9, stringCalculator.add("1\n3,5"));
	}

	/**
	 * This will test add utility with //[delimiter]\n[numbers…].
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_nNumbersWithDefaultInput() throws IllegalArgumentException {
		assertEquals(9, stringCalculator.add("//;\n1;3;5"));
	}

	/**
	 * This will test add utility with negative numbers.
	 * 
	 * @throws Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAdd_negativeNumbersInput() throws IllegalArgumentException {
		assertEquals(9, stringCalculator.add("//;\n1;-3;5"));
	}
	
	/**
	 * This will test add utility with test input more than thousand and would ignore it.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAdd_nNumbersWithWithGreaterThanThousandInput() throws IllegalArgumentException {
		assertEquals(8, stringCalculator.add("//;\n1001;3;5"));
	}
	
}
