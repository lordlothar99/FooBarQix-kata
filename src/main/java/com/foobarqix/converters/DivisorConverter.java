package com.foobarqix.converters;

import com.foobarqix.SpecialNumber;

public class DivisorConverter implements NumberConverter {

	@Override
	public String convertToText(int number) {
		String text = "";
		for (SpecialNumber specialNumber : SpecialNumber.values()) {
			if (isDivisibleBy(number, specialNumber)) {
				text += specialNumber.getText();
			}
		}
		return text;
	}

	private static boolean isDivisibleBy(int number, SpecialNumber specialNumber) {
		return number % specialNumber.getNumber() == 0;
	}
}
