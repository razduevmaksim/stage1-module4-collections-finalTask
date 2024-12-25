package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> lengthMap = new HashMap<>();

        for (Map.Entry<String, Integer> pair : sourceMap.entrySet()) {
            Set<String> numbers = new HashSet<>();

            var l = pair.getKey().length();

            for (Map.Entry<String, Integer> pair2 : sourceMap.entrySet()) {
                if (pair2.getKey().length() == l) {
                    numbers.add(pair2.getKey());
                }
            }

            lengthMap.put(l, numbers);
        }

        return lengthMap;
    }
}
