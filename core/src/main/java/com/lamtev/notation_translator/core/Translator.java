package com.lamtev.notation_translator.core;

import java.util.ArrayList;

//TODO fix algorithm
//TODO improve algorithm
//TODO make accuracy higher

public class Translator {

    private ArrayList<Integer> integerPart;
    private ArrayList<Integer> fractionPart;
    private int originalNotation;
    private int newNotation;
    private Integer decIntegerPart = 0;
    private Integer decFractionPart = 0;

    public Translator(ArrayList<Integer> integerPart, ArrayList<Integer> fractionPart, int originalNotation, int newNotation) {
        this.integerPart = integerPart;
        this.fractionPart = fractionPart;
        this.originalNotation = originalNotation;
        this.newNotation = newNotation;
        calculateDecIntegerPart();
        calculateDecFractionPart();
    }

    public ArrayList<Integer> integerPart() {
        return integerPart;
    }

    public ArrayList<Integer> fractionPart() {
        return fractionPart;
    }

    public void translate() {
        translateIntegerPart();
        translateFractionPart();
    }

   private void translateIntegerPart() {
       integerPart.clear();
       while (decIntegerPart != 0) {
           integerPart.add(0, decIntegerPart % newNotation);
           decIntegerPart /= newNotation;
       }
    }

    private void calculateDecIntegerPart() {
        for (Integer x : integerPart) {
            decIntegerPart *= originalNotation;
            decIntegerPart += x;
        }
    }

    private void translateFractionPart() {
        fractionPart.clear();
        int iteration = 0;
        while (iteration < 8) {
            decFractionPart *= newNotation;
            fractionPart.add(decFractionPart / (int) Math.pow(10, 8));
            decFractionPart %= (int) Math.pow(10, 8);
            ++iteration;
        }
    }

    private void calculateDecFractionPart() {
        for (Integer x : fractionPart) {
            decFractionPart *= originalNotation;
            decFractionPart += x;
        }
        Double fraction = decFractionPart / Math.pow(originalNotation, fractionPart.size());
        decFractionPart = ((Double) (fraction * Math.pow(10, 8))).intValue();
    }

}
