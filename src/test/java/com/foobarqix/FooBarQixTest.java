package com.foobarqix;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FooBarQixTest {

    private FooBarQix fooBarQix;

    @Before
    public void setup() {
        fooBarQix = new FooBarQix();
    }

    @Test
    @Parameters({"8, 8", //
            "16, 16"})
    public void should_return_number_as_text_when_not_divisible_nor_contains_special_number(
            int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    public void should_return_Foo_when_divisible_by_3() {
        assertThat(fooBarQix.convertToText(9)).isEqualTo("Foo");
    }

    @Test
    public void should_return_Bar_when_divisible_by_5() {
        assertThat(fooBarQix.convertToText(10)).isEqualTo("Bar");
    }

    @Test
    public void should_return_Qix_when_divisible_by_7() {
        assertThat(fooBarQix.convertToText(14)).isEqualTo("Qix");
    }

    @Test
    public void should_return_Foo_when_contains_3() {
        assertThat(fooBarQix.convertToText(13)).isEqualTo("Foo");
    }

    @Test
    public void should_return_Bar_when_contains_5() {
        assertThat(fooBarQix.convertToText(52)).isEqualTo("Bar");
    }

    @Test
    public void should_return_Qix_when_contains_7() {
        assertThat(fooBarQix.convertToText(71)).isEqualTo("Qix");
    }

    @Test
    @Parameters({"21, FooQix"})
    public void should_return_text_ordered_by_divisor_occurences_when_divisible_by_several_special_numbers(
            int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"15, FooBarBar", //
            "33, FooFooFoo", //
            "35, BarQixFooBar", //
            "51, FooBar"})
    public void should_return_text_ordered_when_divisible_by_special_numbers_and_contains_special_numbers(
            int number, String text) {
        assertEquals(text, fooBarQix.convertToText(number));
    }

    @Test
    @Parameters({"53, BarFoo"})
    public void should_return_text_ordered_by_special_numbers_occurences_when_contains_several_special_numbers(
            int number, String text) {
        assertEquals(text, fooBarQix.convertToText(number));
    }
}
