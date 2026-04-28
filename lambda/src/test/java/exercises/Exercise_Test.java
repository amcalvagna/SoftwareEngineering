package exercises;

import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Exercise_Test {
// ========================================================
// DEFAULT METHODS
// =======================================================

    /**
     * Create a string that consists of the first letters of each
     * word in the input list.
     */
    @Test
    @Ignore
    public void ex01_accumulateFirstLetters() {
        List<String> input = Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot");

        String result = ""; // TODO

        assertEquals("abcdef", result);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use Iterable.forEach().
    // </editor-fold>


    /**
     * Remove the words that have odd lengths from the list.
     */
    @Test
    @Ignore
    public void ex02_removeOddLengthWords() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));

        // TODO code to modify list

        assertEquals("[alfa, echo]", list.toString());
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use Collection.removeIf().
    // </editor-fold>


    /**
     * Replace every word in the list with its upper case equivalent.
     */
    @Test
    @Ignore
    public void ex03_upcaseAllWords() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alfa", "bravo", "charlie", "delta", "echo", "foxtrot"));

        //TODO code to modify list

        assertEquals("[ALFA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT]", list.toString());
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use List.replaceAll().
    // </editor-fold>


    /**
     * Convert every key-value pair of a map into a string and append them all
     * into a single string, in iteration order.
     */
    @Test
    @Ignore
    public void ex04_stringOfMap() {
        Map<String, Integer> input = new TreeMap<>();
        input.put("c", 3);
        input.put("b", 2);
        input.put("a", 1);

        String result = ""; // TODO

        assertEquals("a1b2c3", result);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use Map.forEach().
    // </editor-fold>


    /**
     * Given a list of words, create a map whose keys are the first letters of
     * each words, and whose values are the sum of the lengths of those words.
     */
    @Test
    @Ignore
    public void ex05_mapOfStringLengths() {
        List<String> list = Arrays.asList(
                "aardvark", "bison", "capybara",
                "alligator", "bushbaby", "chimpanzee",
                "avocet", "bustard", "capuchin");
        Map<String, Integer> result = new TreeMap<>();

        //TODO code to populate result

        assertEquals("{a=23, b=20, c=26}", result.toString());
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use Map.merge() within Iterable.forEach().
    // </editor-fold>
    
    /**
     * Create a new thread that prints the numbers from the list.
     */
    @Test
    @Ignore
    public void ex06_threadPrint() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //TODO code to print
    }

    // Hint:
    // <editor-fold defaultstate="collapsed">
    // This is a straightforward Lambda expression to start a new Thread.
    // </editor-fold>
}

