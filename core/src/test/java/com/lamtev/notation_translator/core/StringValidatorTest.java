package com.lamtev.notation_translator.core;

import org.junit.Test;

public class StringValidatorTest {

    @Test
    public void testValidateString1() {
        StringValidator stringValidator = new StringValidator("123F,98A", 16);
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString2() {
        StringValidator stringValidator = new StringValidator("8000,31", 8);
        stringValidator.validateString();
    }

    @Test
    public void testValidateString3() {
        StringValidator stringValidator = new StringValidator("1234,131", 5);
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString4() {
        StringValidator stringValidator = new StringValidator("1234.131", 15);
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString5() {
        StringValidator stringValidator = new StringValidator("-+=#avcder", 15);
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString6() {
        StringValidator stringValidator = new StringValidator(" ", 15);
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString7() {
        StringValidator stringValidator = new StringValidator("ZZ,AA", 35);
        stringValidator.validateString();
    }

    @Test
    public void testValidateString8() {
        StringValidator stringValidator = new StringValidator("ZZ,AA", 36);
        stringValidator.validateString();
    }

}
