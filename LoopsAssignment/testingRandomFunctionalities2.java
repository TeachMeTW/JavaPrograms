package LoopsAssignment;

import java.util.Scanner;

public class testingRandomFunctionalities2 {
    // Create user input via scanner
    public static Scanner userScanner = new Scanner(System.in);


    // these functions are pretty self explanatory
    public static void testMixWords() {
        System.out.println("\nWe are testing put together, please enter first word: ");
        String word1 = userScanner.nextLine();
        System.out.println("Please enter second word: ");
        String word2 = userScanner.nextLine();
        System.out.println("\n");
        System.out.println(RandomFunctionalities2.mixWords(word1, word2));
    }
    
    public static void testSwitcheroo() {
        System.out.println("\nWe are testing switcheroo, please enter word: ");
        String word = userScanner.nextLine();
        System.out.println("\n");
        System.out.println(RandomFunctionalities2.switcheroo(word));
    } 

    public static void testLongestSet() {
        System.out.println("\nWe are testing longestSet, please enter word: ");
        String word = userScanner.nextLine();
        System.out.println("\n");
        System.out.println(RandomFunctionalities2.longestSet(word));
    } 

    public static void main(String args[]) {
        testMixWords();
        testSwitcheroo();
        testLongestSet();
        userScanner.close();
    }
}
