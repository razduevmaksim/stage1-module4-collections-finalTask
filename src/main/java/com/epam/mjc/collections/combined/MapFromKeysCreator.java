package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> lengthMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Set<String> wordsOfSameLength = new HashSet<>();

            int wordLength = entry.getKey().length();

            for (Map.Entry<String, Integer> innerEntry : sourceMap.entrySet()) {
                if (innerEntry.getKey().length() == wordLength) {
                    wordsOfSameLength.add(innerEntry.getKey());
                }
            }

            lengthMap.put(wordLength, wordsOfSameLength);
        }

        return lengthMap;
    }

}
