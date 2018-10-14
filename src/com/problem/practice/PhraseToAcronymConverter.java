package com.problem.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * 
 * Simple java 8 technique to convert to acronym
 * 
 * 
 * 
 * */
public class PhraseToAcronymConverter {

    private static final List<String> EXCLUDE_WORDS = Arrays.asList("AND", "OR", "BY", "OF","FOR","THE");

    public static String acronym(final String input) {
        return Arrays
                .stream(input.toUpperCase().split("\\s"))
                .filter(word -> !EXCLUDE_WORDS.contains(word))
                .map(w -> String.valueOf(w.charAt(0)))
                .collect(Collectors.joining(""));
    }
    
    
    
    public static void main(String[] args) {
    	
    System.out.println(	acronym("World Health Organization"));
    System.out.println(acronym("Organization for the Advancement of Structured Information Standards"));
    System.out.println(acronym("United Nation Organization"));
    
    
    }}