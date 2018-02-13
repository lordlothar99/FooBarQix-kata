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
    @Parameters({"9, Foo", //
            "12, Foo"})
    public void should_return_Foo_when_divisible_by_3(int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"10, Bar", //
            "20, Bar"})
    public void should_return_Bar_when_divisible_by_5(int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"14, Qix", //
            "28, Qix"})
    public void should_return_Qix_when_divisible_by_7(int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"13, Foo", //
            "23, Foo"})
    public void should_return_Foo_when_contains_3(int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"52, Bar", //
            "58, Bar"})
    public void should_return_Bar_when_contains_5(int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"71, Qix", //
            "79, Qix"})
    public void should_return_Qix_when_contains_7(int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"21, FooQix", //
            "140, BarQix", //
            "60, FooBar"})
    public void should_return_text_ordered_ascending_when_divisible_by_several_special_numbers(
            int number, String text) {
        assertThat(fooBarQix.convertToText(number)).isEqualTo(text);
    }

    @Test
    @Parameters({"53, BarFoo", //
            "157, BarQix"})
    public void should_return_text_ordered_by_occurence_when_contains_several_special_numbers(
            int number, String text) {
        assertEquals(text, fooBarQix.convertToText(number));
    }

    @Test
    @Parameters({"15, FooBarBar", //
            "33, FooFooFoo", //
            "35, BarQixFooBar", //
            "51, FooBar"})
    public void should_return_text_with_precendence_on_divisor_when_divisible_and_contains_special_numbers(
            int number, String text) {
        assertEquals(text, fooBarQix.convertToText(number));
    }
}
