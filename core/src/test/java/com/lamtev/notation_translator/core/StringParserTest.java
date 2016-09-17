package com.lamtev.notation_translator.core;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class StringParserTest {

    private static final StringParser STRING_PARSER = new StringParser("12A90,FF01D", 16);

    @Test
    public void testIntegerPart() {
        ArrayList<Integer> integerPart = STRING_PARSER.integerPart();
        ArrayList<Integer> expectedIntegerPart = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(10);
            add(9);
            add(0);
        }};
        assertEquals(expectedIntegerPart, integerPart);
    }

    @Test
    public void testFractionPart() {
        ArrayList<Integer> fractionPart = STRING_PARSER.fractionPart();
        ArrayList<Integer> expectedFractionPart = new ArrayList<Integer>() {{
            add(15);
            add(15);
            add(0);
            add(1);
            add(13);
        }};
        assertEquals(expectedFractionPart, fractionPart);
    }

}
