package com.lamtev.core;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ParserTest {

    private static final Parser parser = new Parser("12A90,FF01D");

    @Test
    public void testIntegerPart() {
        ArrayList<Integer> integerPart = parser.integerPart();
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
        ArrayList<Integer> fractionPart = parser.fractionPart();
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
