package exercises;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Solution_Test {
// ========================================================
// DEFAULT METHODS
// ========================================================

    /**
     * Create a string that consists of the first letters of each
     * word in the input list.
     */
    @Test
    public void ex01_accumulateFirstLetters() {
        List<String> input = Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

        StringBuilder sb = new StringBuilder();
        input.forEach(s -> sb.append(s.charAt(0)));
        String result = sb.toString();

        assertEquals("abcdef", result);
    }

    /**
     * Remove the words that have odd lengths from the list.
     */
    @Test
    public void ex02_removeOddLengthWords() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));

        list.removeIf(s -> (s.length() & 1) == 1);

        assertEquals("[alfa, echo]", list.toString());
    }

    /**
     * Replace every word in the list with its upper case equivalent.
     */
    @Test
    public void ex03_upcaseAllWords() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));

        list.replaceAll(s -> s.toUpperCase());

        assertEquals("[ALFA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT]", list.toString());
    }

    /**
     * Convert every key-value pair of a map into a string and append them all
     * into a single string, in iteration order.
     */
    @Test
    public void ex04_stringOfMap() {
        Map<String, Integer> input = new TreeMap<>();
        input.put("c", 3);
        input.put("b", 2);
        input.put("a", 1);

        StringBuilder sb = new StringBuilder();
        input.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
        String result = sb.toString();

        assertEquals("a1b2c3", result);
    }

    /**
     * Given a list of words, create a map whose keys are the first letters of
     * each words, and whose values are the sum of the lengths of those words.
     */
    @Test
    public void ex05_mapOfStringLengths() {
        List<String> list = Arrays.asList(
                "aardvark", "bison", "capybara",
                "alligator", "bushbaby", "chimpanzee",
                "avocet", "bustard", "capuchin");
        Map<String, Integer> result = new TreeMap<>();

        list.forEach(s -> result.merge(s.substring(0, 1), s.length(), Integer::sum));
        // Instead of Integer::sum, something like (a, b) -> a + b may be used.

        assertEquals("{a=23, b=20, c=26}", result.toString());
    }

    /**
     * Create a new thread that prints the numbers from the list.
     */
    @Test
    public void ex06_threadPrint() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(() -> list.forEach(System.out::println)).start();
    }
}
