package com.lamtev.core;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TranslatorTest {

    private static ArrayList<Integer> integerPart = new ArrayList<Integer>() {{
        add(1);
        add(0);
        add(0);
    }};
    private static ArrayList<Integer> fractionPart = new ArrayList<Integer>() {{
        add(1);
        add(1);
        add(1);
    }};
    private static ArrayList<Integer> expectedIntegerPart = new ArrayList<Integer>() {{
        add(1);
        add(0);
        add(2);
        add(0);
        add(1);
    }};
    Translator translator = new Translator(integerPart, fractionPart, 10, 3);

    @Test
    public void testIntegerPart() {
        assertEquals(integerPart, translator.integerPart());
        translator.translate();
        assertEquals(expectedIntegerPart, translator.integerPart());
    }

    @Test
    public void testFractionPart() {
        assertEquals(fractionPart, translator.fractionPart());
    }

}
