package com.foobarqix;

public enum SpecialNumber {

	THREE(3, "Foo"), //
	FIVE(5, "Bar"), //
	SEVEN(7, "Qix");

	private final int number;
	private final char character;
	private final String text;

	private SpecialNumber(int number, String text) {
		this.number = number;
		this.text = text;
		this.character = String.valueOf(number).charAt(0);
	}

	public String getText() {
		return text;
	}

	public int getNumber() {
		return number;
	}

	public static SpecialNumber getByCharacter(char number) {
		for (SpecialNumber specialNumber : values()) {
			if (specialNumber.character == number) {
				return specialNumber;
			}
		}
		return null;
	}
}