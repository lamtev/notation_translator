package com.lamtev.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringParser {

    private String number;
    private ArrayList<Integer> integerPart;
    private ArrayList<Integer> fractionPart;
    private static final Map<Character, Integer> TABLE_OF_DIGITS = new HashMap<Character, Integer>() {{
        put('0', 0);
        put('1', 1);
        put('2', 2);
        put('3', 3);
        put('4', 4);
        put('5', 5);
        put('6', 6);
        put('7', 7);
        put('8', 8);
        put('9', 9);
        put('A', 10);
        put('B', 11);
        put('C', 12);
        put('D', 13);
        put('E', 14);
        put('F', 15);
    }};

    StringParser(String number) {
        this.number = number;
        parseIntegerPart();
        parseFractionPart();
    }

    public ArrayList<Integer> integerPart() {
        return integerPart;
    }

    public ArrayList<Integer> fractionPart() {
        return fractionPart;
    }

    private void parseIntegerPart() {
        integerPart = new ArrayList<>();
        for (int i = 0; i < number.indexOf(','); ++i) {
            Character character = number.charAt(i);
            integerPart.add(parseDigit(character));
        }
    }

    private void parseFractionPart() {
        fractionPart = new ArrayList<>();
        for (int i = number.indexOf(',') + 1; i < number.length(); ++i) {
            Character character = number.charAt(i);
            fractionPart.add(parseDigit(character));
        }
    }

    private Integer parseDigit(Character digit) {
        return TABLE_OF_DIGITS.get(digit);
    }

}
