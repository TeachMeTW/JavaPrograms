package DecisionsAssignment;

import java.util.Scanner;

public class testingRandomFunctionalities {
    // Create user input via scanner
    public static Scanner userScanner = new Scanner(System.in);


    // these functions are pretty self explanatory
    public static void testPutTogether() {
        System.out.println("\nWe are testing put together, please enter first word: ");
        String word1 = userScanner.nextLine();
        System.out.println("Please enter second word: ");
        String word2 = userScanner.nextLine();
        System.out.println("\n");
        System.out.println("Combined word: " + RandomFunctionalities.putTogether(word1, word2));
    } 

    public static void testSwapThree() {
        System.out.println("\nWe are testing Swap3, please enter a word: ");
        String userInput = userScanner.nextLine();
        System.out.println("\n");
        System.out.println("Swapped word: " + RandomFunctionalities.swapThree(userInput));
    } 

    public static void testOverEleven() {
        System.out.println("\nWe are testing over eleven, please enter first number: ");
        int num1 = userScanner.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = userScanner.nextInt();
        System.out.println("Please enter third number: ");
        int num3 = userScanner.nextInt();
        System.out.println("\n");
        System.out.println("Is it over eleven?: " + RandomFunctionalities.overEleven(num1, num2, num3));
    }
    
    public static void testIsOddIsEven() {
        System.out.println("\nWe are testing isOdd and isEven, please enter a number: ");
        int userInput = userScanner.nextInt();
        System.out.println("\n");
        System.out.println("Is it even?: " + RandomFunctionalities.isEven(userInput));
        System.out.println("Is it odd?: " + RandomFunctionalities.isOdd(userInput));
    }
    
    public static void testTwentyOne() {
        System.out.println("\nWe are testing 21, please enter first number: ");
        int num1 = userScanner.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = userScanner.nextInt();
        System.out.println("\n");
        System.out.println("Which is closer to 21?: " + RandomFunctionalities.twentyOne(num1, num2));
    } 
    public static void main(String args[]) {
        testPutTogether();
        testSwapThree();
        testOverEleven();
        testIsOddIsEven();
        testTwentyOne();
        userScanner.close();
    }
}
