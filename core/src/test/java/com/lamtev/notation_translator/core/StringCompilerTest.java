package com.lamtev.notation_translator.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCompilerTest {

    private static final String EXPECTED_NUMBER_1 = "FA54,27D";
    private static final String EXPECTED_NUMBER_2 = "80,0BA912C5";

    @Test
    public void testNumber1() {
        StringCompiler stringCompiler = new StringCompiler(TranslatorTest.INTEGER_PART_1, TranslatorTest.FRACTION_PART_1);
        assertEquals(EXPECTED_NUMBER_1, stringCompiler.number());
    }

    @Test
    public void testNumber2() {
        StringCompiler stringCompiler = new StringCompiler(TranslatorTest.EXPECTED_INTEGER_PART_2, TranslatorTest.EXPECTED_FRACTION_PART_2);
        assertEquals(EXPECTED_NUMBER_2, stringCompiler.number());
    }

}
