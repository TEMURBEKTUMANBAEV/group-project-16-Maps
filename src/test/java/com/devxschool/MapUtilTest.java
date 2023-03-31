package com.devxschool;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MapUtilTest {

    MapUtil mapUtil = new MapUtil();

    @Test
    public void removeNullValuesTest1() {
        Map<Integer, Double> numberMap = new HashMap<>();
        numberMap.put(0, 0.0);
        numberMap.put(1, null);
        numberMap.put(2, 2.0);
        numberMap.put(3, null);
        numberMap.put(4, 4.0);
        numberMap.put(5, 2.0);
        numberMap.put(6, 4.0);
        numberMap.put(null, 4.0);

        Map actual = mapUtil.removeNullValues(numberMap);

        numberMap.remove(1);
        numberMap.remove(3);
        assertEquals(numberMap, actual, "Removing all null values from map");
    }

    @Test
    public void removeNullValuesTest2() {
        Map<String, Object> numberMap = new HashMap<>();
        numberMap.put("a", 0);
        numberMap.put(null, 0);

        Map actual = mapUtil.removeNullValues(numberMap);

        assertEquals(numberMap, actual, "Removing no null values from map");
    }

    @Test
    public void removeNullValuesTest3() {
        Map<String, Object> numberMap = new HashMap<>();
        numberMap.put("a", null);
        numberMap.put("b", null);
        numberMap.put("c", null);

        Map actual = mapUtil.removeNullValues(numberMap);

        assertEquals(Collections.emptyMap(), actual, "Removing all null values from map");
    }
}
