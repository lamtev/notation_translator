package com.lamtev.notation_translator.core;

import static com.lamtev.notation_translator.core.StringParser.TABLE_OF_DIGITS;

class StringValidator {

    private String number;
    private int originalNotation;

    StringValidator(String number, int originalNotation) {
        this.number = number;
        this.originalNotation = originalNotation;
    }

    void validateString() {
        if (hasUnallowedCharacter() ||
                number.indexOf(',') == -1 ||
                doesNotationNotSupportCharacters()
                ) {
            throw new RuntimeException();
        }
    }

    private boolean hasUnallowedCharacter() {
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (!isCharacterFromAToZ(ch) && !isCharacterNumeric(ch) && ch != ',') {
                return true;
            }
        }
        return false;
    }

    private boolean isCharacterFromAToZ(char character) {
        return character >= 'A' && character <= 'Z';
    }

    private boolean isCharacterNumeric(char character) {
        return character >= '0' && character <= '9';
    }

    private boolean doesNotationNotSupportCharacters() {
        String integer = number.substring(0, number.indexOf(','));
        for (int i = 0; i < integer.length(); ++i) {
            if (TABLE_OF_DIGITS.get(integer.charAt(i)) >= originalNotation) {
                return true;
            }
        }

        String fraction = number.substring(number.indexOf(',') + 1);
        for (int i = 0; i < fraction.length(); ++i) {
            if (TABLE_OF_DIGITS.get(fraction.charAt(i)) >= originalNotation) {
                return true;
            }
        }
        return false;
    }

}
