package com.devxschool;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MergeMapsTest {

    MergeMaps mergeMaps = new MergeMaps();

    @Test
    public void mergeTest1() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "Purple");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        Map<Integer, String> mergedWithSecond = mergeMaps.merge(map1, map2);

        Map<Integer, String> expected = new HashMap<>();
        expected.put(1, "Red");
        expected.put(2, "Green");
        expected.put(3, "Black");
        expected.put(4, "Purple");
        expected.put(5, "Blue");
        expected.put(6, "Orange");

        assertEquals(expected, mergedWithSecond, "All values from first needs to be exist");
    }

    @Test
    public void mergeTest2() {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "White");
        map1.put(5, "Blue");
        map1.put(6, "Orange");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Red");
        map2.put(2, "Green");
        map2.put(3, "Black");
        map2.put(4, "Purple");

        Map<Integer, String> mergedWithSecond = mergeMaps.merge(map1, map2);

        Map<Integer, String> expected = new HashMap<>();
        expected.put(1, "Red");
        expected.put(2, "Green");
        expected.put(3, "Black");
        expected.put(4, "Purple");
        expected.put(5, "Blue");
        expected.put(6, "Orange");

        assertNotEquals(expected, mergedWithSecond, "All values from second needs to be exist");
    }
}
