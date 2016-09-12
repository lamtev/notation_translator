package com.lamtev.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    private String number;
    private ArrayList<Integer> integerPart;
    private ArrayList<Integer> fractionPart;
    private static final Map<Character, Integer> tableOfCharacters;
    static {
        tableOfCharacters = new HashMap<>();
        tableOfCharacters.put('0', 0);
        tableOfCharacters.put('1', 1);
        tableOfCharacters.put('2', 2);
        tableOfCharacters.put('3', 3);
        tableOfCharacters.put('4', 4);
        tableOfCharacters.put('5', 5);
        tableOfCharacters.put('6', 6);
        tableOfCharacters.put('7', 7);
        tableOfCharacters.put('8', 8);
        tableOfCharacters.put('9', 9);
        tableOfCharacters.put('A', 10);
        tableOfCharacters.put('B', 11);
        tableOfCharacters.put('C', 12);
        tableOfCharacters.put('D', 13);
        tableOfCharacters.put('E', 14);
        tableOfCharacters.put('F', 15);
    }

    Parser(String number) {
        this.number = number;
        determineInteger();
        determineFraction();
    }

    public ArrayList<Integer> integerPart() {
        return integerPart;
    }

    public ArrayList<Integer> fractionPart() {
        return fractionPart;
    }

    private void determineInteger() {
        integerPart = new ArrayList<>();
        for (int i = 0; i < number.indexOf(','); ++i) {
            Character character = number.charAt(i);
            integerPart.add(parseCharacter(character));
        }
    }

    private void determineFraction() {
        fractionPart = new ArrayList<>();
        for (int i = number.indexOf(',') + 1; i < number.length(); ++i) {
            Character character = number.charAt(i);
            fractionPart.add(parseCharacter(character));
        }
    }

    private Integer parseCharacter(Character character) {
        return tableOfCharacters.get(character);
    }

}
