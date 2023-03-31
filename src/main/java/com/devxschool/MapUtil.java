package com.devxschool;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {

    public static void main(String[] args) {
        /**
         * Remove null values from a map
         */
        Map<Integer, Double> numberMap = new HashMap<>();
        numberMap.put(0, 0.0);
        numberMap.put(1, null);
        numberMap.put(2, 2.0);
        numberMap.put(3, null);
        numberMap.put(4, 4.0);
        numberMap.put(5, 2.0);
        numberMap.put(6, 4.0);
        numberMap.put(null, 4.0);

        MapUtil mapUtil = new MapUtil();

        System.out.println(mapUtil.removeNullValues(numberMap));
    }

    public Map<Object, Object> removeNullValues(Map map) {
        //TODO implement this method
        Map<Object, Object> nonNullMap = new HashMap<>();

        for (Object key : map.keySet()) {
            Object value = map.get(key);
            if (value != null) {
                nonNullMap.put(key, value);
            }
        }
        return nonNullMap;
    }
}
