package com.lamtev.core;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class TranslatorTest {

    @Test
    public void testTranslate1() {
        Translator translator = new Translator(INTEGER_PART_1, FRACTION_PART_1, 16, 7);
        assertEquals(INTEGER_PART_1, translator.integerPart());
        assertEquals(FRACTION_PART_1, translator.fractionPart());
        translator.translate();
        assertEquals(EXPECTED_INTEGER_PART_1, translator.integerPart());
        assertEquals(EXPECTED_FRACTION_PART_1, translator.fractionPart());
    }

    @Test
    public void testTranslate2() {
        Translator translator = new Translator(INTEGER_PART_2, FRACTION_PART_2, 3, 13);
        assertEquals(INTEGER_PART_2, translator.integerPart());
        assertEquals(FRACTION_PART_2, translator.fractionPart());
        translator.translate();
        assertEquals(EXPECTED_INTEGER_PART_2, translator.integerPart());
        assertEquals(EXPECTED_FRACTION_PART_2, translator.fractionPart());
    }

    @Test
    public void testTranslate3() {
        Translator translator = new Translator(INTEGER_PART_3, FRACTION_PART_3, 4, 11);
        assertEquals(INTEGER_PART_3, translator.integerPart());
        assertEquals(FRACTION_PART_3, translator.fractionPart());
        translator.translate();
        assertEquals(EXPECTED_INTEGER_PART_3, translator.integerPart());
        assertEquals(EXPECTED_FRACTION_PART_3, translator.fractionPart());
    }

    //Data for 1-st test
    static final ArrayList<Integer> INTEGER_PART_1 = new ArrayList<Integer>() {{
        add(15);
        add(10);
        add(5);
        add(4);
    }};
    static final ArrayList<Integer> FRACTION_PART_1 = new ArrayList<Integer>() {{
        add(2);
        add(7);
        add(13);
    }};
    private static final ArrayList<Integer> EXPECTED_INTEGER_PART_1 = new ArrayList<Integer>() {{
        add(3);
        add(5);
        add(4);
        add(5);
        add(5);
        add(6);
    }};
    private static final ArrayList<Integer> EXPECTED_FRACTION_PART_1 = new ArrayList<Integer>() {{
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
    private static final ArrayList<Integer> INTEGER_PART_2 = new ArrayList<Integer>() {{
        add(1);
        add(0);
        add(2);
        add(1);
        add(2);
    }};
    private static final ArrayList<Integer> FRACTION_PART_2 = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(1);
        add(2);
        add(2);
    }};
    static final ArrayList<Integer> EXPECTED_INTEGER_PART_2 = new ArrayList<Integer>() {{
        add(8);
        add(0);
    }};
    static final ArrayList<Integer> EXPECTED_FRACTION_PART_2 = new ArrayList<Integer>() {{
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
    private static final ArrayList<Integer> INTEGER_PART_3 = new ArrayList<Integer>() {{
        add(3);
        add(2);
        add(1);
        add(3);
        add(2);
        add(0);
        add(1);
        add(2);
    }};
    private static final ArrayList<Integer> FRACTION_PART_3 = new ArrayList<Integer>() {{
        add(0);
        add(1);
        add(2);
        add(3);
        add(0);
        add(2);
        add(2);
    }};
    private static final ArrayList<Integer> EXPECTED_INTEGER_PART_3 = new ArrayList<Integer>() {{
        add(4);
        add(0);
        add(5);
        add(9);
        add(2);
    }};
    private static final ArrayList<Integer> EXPECTED_FRACTION_PART_3 = new ArrayList<Integer>() {{
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
