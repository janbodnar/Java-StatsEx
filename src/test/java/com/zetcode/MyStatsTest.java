package com.zetcode;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;


public class MyStatsTest
{

    private List<Integer> vals;

    public MyStatsTest() {

        System.out.println("Constructor");
        vals = new ArrayList<>();
        vals.add(1);
        vals.add(7);
        vals.add(0);
        vals.add(12);
    }

    @Test
    @DisplayName("Testing maximum value")
    public void testMaxValue() {

        assertEquals(12, MyStats.max(vals));
    }

    @Test
    @DisplayName("Testing minimum value")
    public void testMinValue() {

        assertEquals(0, MyStats.min(vals));
    }
}
