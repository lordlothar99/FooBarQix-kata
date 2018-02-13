package com.foobarqix.converters;

import static com.foobarqix.SpecialNumber.getByCharacter;
import static java.lang.String.valueOf;

import com.foobarqix.SpecialNumber;

public class ContainsConverter implements NumberConverter {

    @Override
    public String convertToText(int number) {
        String text = "";
        for (char character : toChars(number)) {
            text += convertToText(character);
        }
        return text;
    }

    private String convertToText(char character) {
        SpecialNumber specialNumber = getByCharacter(character);
        return specialNumber != null ? specialNumber.getText() : "";
    }

    private char[] toChars(int number) {
        return valueOf(number).toCharArray();
    }
}
