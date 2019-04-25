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
		}else {
			sum=Integer.parseInt(splitNumberString[0]) + Integer.parseInt(splitNumberString[1]);
		}
		return sum;
	}

}
