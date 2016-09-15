package com.lamtev.notation_translator.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCompilerTest {

    private static final String EXPECTED_NUMBER = "354556,10422532";

    @Test
    public void testNumber() {
        StringCompiler stringCompiler = new StringCompiler(
                TranslatorTest.EXPECTED_INTEGER_PART_1,
                TranslatorTest.EXPECTED_FRACTION_PART_1
        );
        assertEquals(EXPECTED_NUMBER, stringCompiler.number());
    }

}
