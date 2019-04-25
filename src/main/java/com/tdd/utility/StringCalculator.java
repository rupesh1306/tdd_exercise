package com.tdd.utility;

/**
 * This class is responsible for adding two numbers.
 * 
 * @author Rupesh
 *
 */
public class StringCalculator {

	/**
	 * This method is responsible for adding two comma separated numbers in the
	 * given string.
	 * 
	 * @param number-
	 *            String input.
	 * @return sum of integer
	 */
	public int add(final String numberString) {
		int sum = -1;
		if (numberString == null || numberString.isEmpty()) {
			sum = 0;
		} else {
			sum = Integer.parseInt(numberString);
		}
		return sum;
	}

}
