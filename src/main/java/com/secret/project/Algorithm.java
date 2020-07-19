package com.secret.project;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Algorithm {

    public int calculate(Map<String, Integer> map) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 5)
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .map(entry -> entry.getValue())
                .get();
    }

    public Map<String, Integer> filter(Map<String, Integer> map) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 5)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
    }

}
