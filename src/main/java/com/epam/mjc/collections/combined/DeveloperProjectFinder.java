package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> project = new ArrayList<>();

        for (Map.Entry<String, Set<String>> pair : projects.entrySet()) {

            for (String s : pair.getValue()) {
                if (Objects.equals(developer, s)) {
                    project.add(pair.getKey());
                }
            }
        }

        project.sort(Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.reverseOrder()));

        return project;
    }
}
