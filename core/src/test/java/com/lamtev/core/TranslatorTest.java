package com.lamtev.core;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TranslatorTest {

    @Test
    public void testTranslate1() {
        Translator translator = new Translator(integerPart1, fractionPart1, 16, 7);
        assertEquals(integerPart1, translator.integerPart());
        assertEquals(fractionPart1, translator.fractionPart());
        translator.translate();
        assertEquals(expectedIntegerPart1, translator.integerPart());
        assertEquals(expectedFractionPart1, translator.fractionPart());
    }

    @Test
    public void testTranslate2() {
        Translator translator = new Translator(integerPart2, fractionPart2, 3, 13);
        assertEquals(integerPart2, translator.integerPart());
        assertEquals(fractionPart2, translator.fractionPart());
        translator.translate();
        assertEquals(expectedIntegerPart2, translator.integerPart());
        assertEquals(expectedFractionPart2, translator.fractionPart());
    }

    @Test
    public void testTranslate3() {
        Translator translator = new Translator(integerPart3, fractionPart3, 4, 11);
        assertEquals(integerPart3, translator.integerPart());
        assertEquals(fractionPart3, translator.fractionPart());
        translator.translate();
        assertEquals(expectedIntegerPart3, translator.integerPart());
        assertEquals(expectedFractionPart3, translator.fractionPart());
    }

    //Data for 1-st test
    private static final ArrayList<Integer> integerPart1 = new ArrayList<Integer>() {{
        add(15);
        add(10);
        add(5);
        add(4);
    }};
    private static final ArrayList<Integer> fractionPart1 = new ArrayList<Integer>() {{
        add(2);
        add(7);
        add(13);
    }};
    private static final ArrayList<Integer> expectedIntegerPart1 = new ArrayList<Integer>() {{
        add(3);
        add(5);
        add(4);
        add(5);
        add(5);
        add(6);
    }};
    private static final ArrayList<Integer> expectedFractionPart1 = new ArrayList<Integer>() {{
        add(1);
        add(0);
        add(4);
        add(2);
        add(2);
        add(5);
        add(3);
        add(2);
    }};

    //Data for 2-nd test
    private static final ArrayList<Integer> integerPart2 = new ArrayList<Integer>() {{
        add(1);
        add(0);
        add(2);
        add(1);
        add(2);
    }};
    private static final ArrayList<Integer> fractionPart2 = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(1);
        add(2);
        add(2);
    }};
    private static final ArrayList<Integer> expectedIntegerPart2 = new ArrayList<Integer>() {{
        add(8);
        add(0);
    }};
    private static final ArrayList<Integer> expectedFractionPart2 = new ArrayList<Integer>() {{
        add(0);
        add(11);
        add(10);
        add(9);
        add(1);
        add(2);
        add(12);
        add(5);
    }};

    //Data for 3-rd test
    private static final ArrayList<Integer> integerPart3 = new ArrayList<Integer>() {{
        add(3);
        add(2);
        add(1);
        add(3);
        add(2);
        add(0);
        add(1);
        add(2);
    }};
    private static final ArrayList<Integer> fractionPart3 = new ArrayList<Integer>() {{
        add(0);
        add(1);
        add(2);
        add(3);
        add(0);
        add(2);
        add(2);
    }};
    private static final ArrayList<Integer> expectedIntegerPart3 = new ArrayList<Integer>() {{
        add(4);
        add(0);
        add(5);
        add(9);
        add(2);
    }};
    private static final ArrayList<Integer> expectedFractionPart3 = new ArrayList<Integer>() {{
        add(1);
        add(1);
        add(9);
        add(2);
        add(1);
        add(1);
        add(6);
        add(6);
    }};
}
