package com.lamtev.notation_translator.core;

class StringValidator {

    private String number;

    StringValidator(String number) {
        this.number = number;
    }

    void validateString() {
        if (hasUnallowedCharacter()) {
            throw new RuntimeException();
        }
    }

    private boolean hasUnallowedCharacter() {
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (!isCharacterFromAToF(ch) && !isCharacterNumeric(ch) && ch != ',') {
                return true;
            }
        }
        return false;
    }

    private boolean isCharacterFromAToF(char character) {
        return character >= 'A' && character <= 'F';
    }

    private boolean isCharacterNumeric(char character) {
        return character >= '0' && character <= '9';
    }

}
