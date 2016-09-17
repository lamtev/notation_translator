package com.lamtev.notation_translator.core;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Translator {

    private ArrayList<Integer> integerPart;
    private ArrayList<Integer> fractionPart;
    private int originalNotation;
    private int newNotation;
    private int accuracy;
    private BigInteger decIntegerPart;
    private BigDecimal floatDecFractionPart;

    public Translator(ArrayList<Integer> integerPart,
                      ArrayList<Integer> fractionPart,
                      int originalNotation,
                      int newNotation,
                      int accuracy) {
        this.integerPart = integerPart;
        this.fractionPart = fractionPart;
        this.originalNotation = originalNotation;
        this.newNotation = newNotation;
        this.accuracy = accuracy;
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
        determineDecIntegerPart();
        integerPart.clear();
        if (decIntegerPart.equals(BigInteger.valueOf(0))) {
            integerPart.add(0);
            return;
        }
        while (!decIntegerPart.equals(BigInteger.valueOf(0))) {
           integerPart.add(0, decIntegerPart.mod(BigInteger.valueOf(newNotation)).intValue());
           decIntegerPart = decIntegerPart.divide(BigInteger.valueOf(newNotation));
       }
    }

    private void determineDecIntegerPart() {
        decIntegerPart = new BigInteger("0");
        for (Integer x : integerPart) {
            decIntegerPart = decIntegerPart.multiply(BigInteger.valueOf(originalNotation));
            decIntegerPart = decIntegerPart.add(BigInteger.valueOf(x));
        }
    }

    private void translateFractionPart() {
        determineDecFractionPart();
        fractionPart.clear();
        for (int i = 0; i < accuracy; ++i) {
            Integer div = floatDecFractionPart.multiply(BigDecimal.valueOf(newNotation)).intValue();
            fractionPart.add(div);
            floatDecFractionPart = floatDecFractionPart.multiply(
                    BigDecimal.valueOf(newNotation)).subtract(BigDecimal.valueOf(div)
                    );
        }
    }

    private void determineDecFractionPart() {
        floatDecFractionPart = new BigDecimal("0.0");
        for (Integer x : fractionPart) {
            floatDecFractionPart = floatDecFractionPart.multiply(BigDecimal.valueOf(originalNotation));
            floatDecFractionPart = floatDecFractionPart.add(BigDecimal.valueOf(x));
        }
        BigDecimal divider = power(originalNotation, fractionPart.size());
        floatDecFractionPart = floatDecFractionPart.divide(divider, accuracy*36, RoundingMode.HALF_UP);
    }

    private BigDecimal power(Integer number, Integer degree) {
        BigDecimal result = new BigDecimal("1");
        for (int i = 0; i < degree; ++ i) {
            result = result.multiply(BigDecimal.valueOf(number));
        }
        return result;
    }

}