package com.lamtev.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.lamtev.core.TranslatorTest.*;

public class StringCompilerTest {

    private static final String EXPECTED_NUMBER_1 = "FA54,27D";
    private static final String EXPECTED_NUMBER_2 = "80,0BA912C5";

    @Test
    public void testNumber1() {
        StringCompiler stringCompiler = new StringCompiler(INTEGER_PART_1, FRACTION_PART_1);
        assertEquals(EXPECTED_NUMBER_1, stringCompiler.number());
    }

    @Test
    public void testNumber2() {
        StringCompiler stringCompiler = new StringCompiler(EXPECTED_INTEGER_PART_2, EXPECTED_FRACTION_PART_2);
        assertEquals(EXPECTED_NUMBER_2, stringCompiler.number());
    }

}
