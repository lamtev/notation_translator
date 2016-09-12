package com.lamtev.core;

import java.util.ArrayList;

public class Translator {

    private ArrayList<Integer> integerPart;
    private ArrayList<Integer> fractionPart;
    private int fromNotation;
    private int toNotation;
    private Integer decIntegerPart;

    Translator(ArrayList<Integer> integerPart, ArrayList<Integer> fractionPart, int fromNotation, int toNotation) {
        this.integerPart = integerPart;
        this.fractionPart = fractionPart;
        this.fromNotation = fromNotation;
        this.toNotation = toNotation;
        decIntegerPart = 0;
    }

    public void translate() {
        translateIntegerPart();
        //TODO translateFractionPart();
    }

    public ArrayList<Integer> integerPart() {
        return integerPart;
    }

    public ArrayList<Integer> fractionPart() {
        return fractionPart;
    }

   private void translateIntegerPart() {
        calculateDecIntegerPart();
        translateIntegerPartToToNotation();
    }

    private void calculateDecIntegerPart() {
        for (Integer x : integerPart) {
            decIntegerPart *= fromNotation;
            decIntegerPart += x;
        }
    }

    private void translateIntegerPartToToNotation() {
        integerPart.clear();
        while (decIntegerPart != 0) {
            integerPart.add(0, decIntegerPart%toNotation);
            decIntegerPart /= toNotation;
        }
    }

}
