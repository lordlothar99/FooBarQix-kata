package com.foobarqix;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FooBarQixTest {

	private FooBarQix fooBarQix;

	@Before
	public void setup() {
		fooBarQix = new FooBarQix();
	}

	@Test
	public void should_return_string_conversion_when_not_divisible_nor_contains_special_number() {
		assertEquals("8", fooBarQix.convertToText(8));
		assertEquals("16", fooBarQix.convertToText(16));
	}

	@Test
	public void should_return_matching_text_when_divisible_by_one_special_number_only() {
		assertEquals("Foo", fooBarQix.convertToText(9));
		assertEquals("Bar", fooBarQix.convertToText(10));
		assertEquals("Qix", fooBarQix.convertToText(14));
	}

	@Test
	public void should_return_matching_text_when_contains_one_special_number_only() {
		assertEquals("Foo", fooBarQix.convertToText(13));
		assertEquals("Bar", fooBarQix.convertToText(52));
		assertEquals("Qix", fooBarQix.convertToText(71));
	}

	@Test
	public void should_return_text_ordered_by_divisor_occurences_when_divisible_by_several_special_numbers() {
		assertEquals("FooQix", fooBarQix.convertToText(21));
	}

	@Test
	public void should_return_text_ordered_by_special_numbers_occurences_when_contains_several_special_numbers() {
		assertEquals("BarFoo", fooBarQix.convertToText(53));
	}

	@Test
	public void should_return_text_ordered_when_divisible_by_special_numbers_and_contains_special_numbers() {
		assertEquals("FooFooFoo", fooBarQix.convertToText(33));
		assertEquals("BarQixFooBar", fooBarQix.convertToText(35));
	}
}
