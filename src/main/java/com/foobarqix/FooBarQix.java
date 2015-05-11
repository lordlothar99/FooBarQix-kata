package com.foobarqix;

import com.foobarqix.converters.ContainsConverter;
import com.foobarqix.converters.DivisorConverter;

public class FooBarQix {

	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 100;

	public static void main(String[] args) {
		new FooBarQix().displayNumbers(MIN_NUMBER, MAX_NUMBER);
	}

	private final DivisorConverter divisorConverter = new DivisorConverter();
	private final ContainsConverter containsConverter = new ContainsConverter();

	private void displayNumbers(int min, int max) {
		for (int i = min; i <= max; i++) {
			System.out.println(convertToText(i));
		}
	}

	public String convertToText(int number) {
		String text = divisorConverter.convertToText(number);
		text += containsConverter.convertToText(number);
		return defaultString(text, String.valueOf(number));
	}

	private static String defaultString(String text, String defaultString) {
		return "".equals(text) ? defaultString : text;
	}
}
