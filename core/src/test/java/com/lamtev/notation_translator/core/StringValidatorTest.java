package com.lamtev.notation_translator.core;

import org.junit.Test;

public class StringValidatorTest {

    @Test
    public void testValidateString1() {
        StringValidator stringValidator = new StringValidator("123F,98A");
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString2() {
        StringValidator stringValidator = new StringValidator("ABG,31");
        stringValidator.validateString();
    }

    @Test
    public void testValidateString3() {
        StringValidator stringValidator = new StringValidator("1234,131");
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString4() {
        StringValidator stringValidator = new StringValidator("1234.131");
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString5() {
        StringValidator stringValidator = new StringValidator("-+=#avcder");
        stringValidator.validateString();
    }

    @Test(expected = RuntimeException.class)
    public void testValidateString6() {
        StringValidator stringValidator = new StringValidator(" ");
        stringValidator.validateString();
    }

}
