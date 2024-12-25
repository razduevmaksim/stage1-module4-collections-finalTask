package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();

        for (Map.Entry<String, Set<String>> projectEntry : projects.entrySet()) {

            for (String projectDeveloper : projectEntry.getValue()) {
                if (Objects.equals(developer, projectDeveloper)) {
                    developerProjects.add(projectEntry.getKey());
                }
            }
        }

        developerProjects.sort(Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.reverseOrder()));

        return developerProjects;
    }

}
