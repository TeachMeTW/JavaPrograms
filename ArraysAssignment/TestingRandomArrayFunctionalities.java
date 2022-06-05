package ArraysAssignment;

import java.util.Scanner;

public class TestingRandomArrayFunctionalities {
    // User input scanner
    public static Scanner userIn = new Scanner(System.in);

    // Tests out the subset function
    public static void testSubset() {
        // Gets user input on array size 1
        System.out.println("Enter array size 1: ");
        int aSize1 = userIn.nextInt();
        // gets user input on array size 2
        System.out.println("Enter array size 2: ");
        int aSize2 = userIn.nextInt();

        // create arrays
        int numArray1[] = new int[aSize1];
        int numArray2[] = new int[aSize2];

        System.out.println("\n\n");

        // loop through input to fill arrays
        for (int i = 0; i < numArray1.length; i++)
        {
            System.out.println("Please enter number " + (i+1) + " of array 1: ");
            numArray1[i] = userIn.nextInt();
        }
        for (int i = 0; i < numArray2.length; i++)
        {
            System.out.println("Please enter number " + (i+1) + " of array 2: ");
            numArray2[i] = userIn.nextInt();
        }
        // feed arrays into subset function from random array functionalities
        RandomArrayFunctionalities.checkSubset(numArray1, numArray2);
    }

    public static void testRepeater() {
        while(true) {
            // try catch statement to see if word-index is valid
            // checks if index being started at exists
            try {
                userIn.nextLine();
                System.out.println("Enter word: ");
                String word = userIn.nextLine();
    
                System.out.println("Enter index of word to start at: ");
                int index = userIn.nextInt();
    
                char exists = word.charAt(index);
                RandomArrayFunctionalities.repeatNumToBegin(word, index);
                break;
            }
            // if not valid try again
            catch (Exception e) {
                System.out.println("Out of bounds");
                userIn.nextLine();
            }
        }

    }


    public static void main(String args[]) {
        testSubset();
        testRepeater();
        userIn.close();
    }
}
