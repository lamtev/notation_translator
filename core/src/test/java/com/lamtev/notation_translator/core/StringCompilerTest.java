package com.lamtev.notation_translator.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCompilerTest {

    private static final String EXPECTED_NUMBER_1 = "FA54,27D";

    @Test
    public void testNumber() {
        StringCompiler stringCompiler = new StringCompiler(TranslatorTest.INTEGER_PART_1, TranslatorTest.FRACTION_PART_1);
        assertEquals(EXPECTED_NUMBER_1, stringCompiler.number());
    }

}
