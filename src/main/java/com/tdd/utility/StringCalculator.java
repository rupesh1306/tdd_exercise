package com.tdd.utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

		String delemeter = findDelimeter(numberString);
		String numberStringInput = removeFirstLine(numberString);
		String[] splitNumberString = numberStringInput.split(delemeter);
		int sum = -1;
		if (numberStringInput.isEmpty()) {
			sum = 0;
		} else if (splitNumberString.length == 1) {
			sum = Integer.parseInt(numberStringInput);
		} else {
			sum = getSum(splitNumberString);
		}
		return sum;
	}

	/**
	 * Removed first line from the parameter for processing.
	 * 
	 * @param numberString
	 * @return
	 */
	private String removeFirstLine(final String numberString) {
		String returnWithoutFirstLine = numberString;
		if (numberString.startsWith("//")) {
			returnWithoutFirstLine = numberString.substring(4);
		}
		return returnWithoutFirstLine;
	}

	/**
	 * Find delemeter if it is provided in the string.
	 * 
	 * @param numberString
	 * @return
	 */
	private String findDelimeter(final String numberString) {
		String delimeter = ",|\n";
		if (numberString.startsWith("//")) {
			// Extracting delimeter
			delimeter = numberString.substring(2, 3);
		}
		return delimeter;
	}

	/**
	 * This method is responsible for adding supplied numbers in string array.
	 * 
	 * @param numbersString
	 *            - array of number string
	 * @return sum
	 */
	private int getSum(String[] numbersString) {
		List<String> numberList = Arrays.asList(numbersString);
		this.validateNegativeNumbers(numberList);
		int sum = 0;
		sum = numberList.stream().mapToInt(num -> (Integer.parseInt(num) <= 1000 ? Integer.parseInt(num) : 0)).sum();
		return sum;
	}

	/**
	 * Throw exception for negative numbers.
	 * 
	 * @param negativeNumbers
	 */
	private void throwException(List<String> negativeNumbers) {
		throw new IllegalArgumentException("Negative numbers not allowed, check input: " + negativeNumbers);
	}

	private void validateNegativeNumbers(List<String> numberList) {
		List<String> negativeNumberList = numberList.stream().filter(number -> (Integer.parseInt(number) < 0))
				.collect(Collectors.toList());
		if (negativeNumberList != null && !negativeNumberList.isEmpty()) {
			throwException(negativeNumberList);
		}
	}
}
