package com.devxschool;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MapsComparisonTest {

    MapsComparison mapsComparison = new MapsComparison();

    @Test
    public void isEqualTest1() {

        Map<String, String> values = new HashMap<>();
        values.put("1", "HeyHey");
        values.put("0", null);
        values.put("23", "NoNo");
        values.put("2", null);
        values.put("4", "AhAhAhA");

        Map<String, String> values2 = new HashMap<>();
        values2.put("1", "HeyHey");
        values2.put("0", "null");
        values2.put("23", "NoNo");
        values2.put("2", "empty");
        values2.put("4", "AhAhAhA");

        assertTrue(mapsComparison.equalsIgnoringNullValues(values, values2), "First map has NULL values to be ignored");
    }

    @Test
    public void isEqualTest2() {
        Map<String, String> values = new HashMap<>();
        values.put("1", "HeyHey");
        values.put("0", "null");
        values.put("23", "NoNo");
        values.put("2", "empty");
        values.put("4", "AhAhAhA");

        Map<String, String> values2 = new HashMap<>();
        values2.put("1", "HeyHey");
        values2.put("0", null);
        values2.put("23", "NoNo");
        values2.put("2", null);
        values2.put("4", "AhAhAhA");

        assertFalse(mapsComparison.equalsIgnoringNullValues(values, values2), "First map has no NULL values to be ignored");
    }

}