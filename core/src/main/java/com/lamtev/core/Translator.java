package com.lamtev.core;

import java.util.ArrayList;

public class Translator {

    private ArrayList<Integer> integerPart;
    private ArrayList<Integer> fractionPart;
    private int originNotation;
    private int newNotation;
    private Integer decIntegerPart;
    private Integer decFractionPart;

    Translator(ArrayList<Integer> integerPart, ArrayList<Integer> fractionPart, int originNotation, int newNotation) {
        this.integerPart = integerPart;
        this.fractionPart = fractionPart;
        this.originNotation = originNotation;
        this.newNotation = newNotation;
        decIntegerPart = 0;
        decFractionPart = 0;
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
        translateIntegerPartToNewNotation();
    }

    private void calculateDecIntegerPart() {
        for (Integer x : integerPart) {
            decIntegerPart *= originNotation;
            decIntegerPart += x;
        }
    }

    private void translateIntegerPartToNewNotation() {
        integerPart.clear();
        while (decIntegerPart != 0) {
            integerPart.add(0, decIntegerPart%newNotation);
            decIntegerPart /= newNotation;
        }
    }

    private void translateFractionPart() {
        calculateDecFractionPart();
        translateFractionPartToNewNotation();
    }

    private void calculateDecFractionPart() {

    }

    private void translateFractionPartToNewNotation() {

    }
}
