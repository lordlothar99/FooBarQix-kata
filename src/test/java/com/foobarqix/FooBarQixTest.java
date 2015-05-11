package com.foobarqix;

import static org.junit.Assert.assertEquals;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FooBarQixTest {

	private FooBarQix fooBarQix;

	@Before
	public void setup() {
		fooBarQix = new FooBarQix();
	}

	@Test
	@Parameters({ "8, 8", //
			"16, 16" })
	public void should_return_string_conversion_when_not_divisible_nor_contains_special_number(int number, String text) {
		assertEquals(text, fooBarQix.convertToText(number));
	}

	@Test
	@Parameters({ "9, Foo", //
			"10, Bar", //
			"14, Qix" })
	public void should_return_matching_text_when_divisible_by_one_special_number_only(int number, String text) {
		assertEquals(text, fooBarQix.convertToText(number));
	}

	@Test
	@Parameters({ "13, Foo", //
			"52, Bar", //
			"71, Qix" })
	public void should_return_matching_text_when_contains_one_special_number_only(int number, String text) {
		assertEquals(text, fooBarQix.convertToText(number));
	}

	@Test
	@Parameters({ "21, FooQix" })
	public void should_return_text_ordered_by_divisor_occurences_when_divisible_by_several_special_numbers(int number,
			String text) {
		assertEquals(text, fooBarQix.convertToText(number));
	}

	@Test
	@Parameters({ "15, FooBarBar", //
			"33, FooFooFoo", //
			"35, BarQixFooBar", //
			"51, FooBar" })
	public void should_return_text_ordered_when_divisible_by_special_numbers_and_contains_special_numbers(int number,
			String text) {
		assertEquals(text, fooBarQix.convertToText(number));
	}

	@Test
	@Parameters({ "53, BarFoo" })
	public void should_return_text_ordered_by_special_numbers_occurences_when_contains_several_special_numbers(
			int number, String text) {
		assertEquals(text, fooBarQix.convertToText(number));
	}
}
