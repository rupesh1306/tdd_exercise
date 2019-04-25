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
		String[] splitNumberString = numberString.split(",");
		int sum = -1;
		if (numberString.isEmpty()) {
			sum = 0;
		} else if (splitNumberString.length == 1) {
			sum = Integer.parseInt(numberString);
		} else {
			sum = getSum(splitNumberString);
		}
		return sum;
	}
	
	/**
	 * This method is responsible for adding supplied numbers in string array.
	 * @param numbersString - array of number string
	 * @return sum
	 */
	private int getSum(String[] numbersString) {
		int sum = 0;
		for (String numberString : numbersString) {
			sum += Integer.parseInt(numberString);
		}
		return sum;
	}
}
