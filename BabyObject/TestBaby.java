package BabyObject;
import java.util.Scanner;
import java.util.*;

public class TestBaby {
    // static scanner and list usable by all the functions here
    // user input getter
    public static Scanner userScanner = new Scanner(System.in);
    // list of babys to keep track of them
    public static List<Baby> babyList = new ArrayList<Baby>();

    // This just tests the first constructor of just baby name
    // Mutator
    public static void testBabyJustName() {
        System.out.println("\nWe are first testing just name baby constructor. Please enter a baby name: ");
        String userInput = userScanner.nextLine();
        System.out.println("\n");
        // Add the baby to the database
        Baby testBaby1 = new Baby(userInput);
        babyList.add(testBaby1);
        System.out.println(testBaby1);
    }
    // This just tests the second constructor of baby name and age
    // Mutator
    public static void testBabyNameAge() {
        System.out.println("\nWe testing name and age baby constructor. Please enter a baby name: ");
        String userInput = userScanner.nextLine();
        System.out.println("Enter baby age: ");
        int userInput2 = userScanner.nextInt();
        System.out.println("\n");
        // Add the baby to the database
        Baby testBaby2 = new Baby(userInput, userInput2);
        babyList.add(testBaby2);
        System.out.println(testBaby2);
    }
    // this tests the 3rd constructor which has everything -- name, age, race, etc
    // Mutator
    public static void testWholeBaby() {
        userScanner.nextLine();
        System.out.println("\nWe testing the everything constructor. Please enter a baby name: ");
        String userInput = userScanner.nextLine();
        
        System.out.println("Enter baby age: ");
        int userInput2 = userScanner.nextInt();
        userScanner.nextLine();
        
        System.out.println("Enter baby race: ");
        String userInput3 = userScanner.nextLine();

        System.out.println("Enter hair color: ");
        String userInput4 = userScanner.nextLine();

        System.out.println("Enter eye color: ");
        String userInput5 = userScanner.nextLine();

        System.out.println('\n');
        // Add the baby to the database
        Baby testBaby3 = new Baby(userInput, userInput2, userInput3, userInput4, userInput5);
        babyList.add(testBaby3);
        System.out.println(testBaby3);
    }
    
    // uses the 3rd constructor to run a baby caretaking simulation
    // Mutator
    public static void comprehensiveTest() {
        
        System.out.println("\nWe testing the Da Baby Caretaking Simulator. Please enter a baby name: ");
        String userInput = userScanner.nextLine();
        
        System.out.println("Enter baby age: ");
        int userInput2 = userScanner.nextInt();
        userScanner.nextLine();
        
        System.out.println("Enter baby race: ");
        String userInput3 = userScanner.nextLine();
        

        System.out.println("Enter hair color: ");
        String userInput4 = userScanner.nextLine();

        System.out.println("Enter eye color: ");
        String userInput5 = userScanner.nextLine();

        System.out.println('\n');
        // Add the baby to the database
        Baby testBaby4 = new Baby(userInput, userInput2, userInput3, userInput4, userInput5);

        // Limit aka healthiness scale
        int limit = 0;

        // Simulation part of the program
        while(true) {
            System.out.println("\n");
            // Poop and pee chance and vomit chance and hunger chance

            // occurs 10% of the time
            boolean poopChance = Math.random() < 0.1;
            boolean peeChance = Math.random() < 0.1;
            boolean vomitCount = Math.random() < 0.1;
            // occurs 20% of the time
            boolean hungerChance = Math.random() < 0.2;

            // if da baby poops
            if (poopChance) {
                // increase limit
                limit++;
                System.out.println("Uh oh the baby just pooped");
                testBaby4.isPooping();
                System.out.println("Clean the baby? Yes/No ");
                String userin = userScanner.nextLine();
                System.out.println("\n");
                // if the baby is clean, lower the limit
                if (userin.toLowerCase().equals("yes")) {
                    System.out.println("Baby is cleaned ");
                    // runs clean baby function
                    testBaby4.cleanBaby();
                    limit--;
                }
            }

            // if da baby pees
            if (peeChance) {
                // increase limit
                limit++;
                System.out.println("Uh oh the baby just peed everywhere ");
                testBaby4.isPeeing();
                System.out.println("Clean the baby? Yes/No ");
                String userin = userScanner.nextLine();
                System.out.println("\n");
                // if da baby is cleaned, lower limit
                if (userin.toLowerCase().equals("yes")) {
                    System.out.println("Baby is cleaned ");
                    testBaby4.cleanBaby();
                    limit--;
                }
            }

            // if da baby vomits
            if (vomitCount) {
                testBaby4.isVomiting();
                // limit is raised twice because its severe
                limit = limit + 2;
                System.out.println("Uh oh the baby just emptied their guts everywhere ");
                System.out.println("Clean the baby? Yes/No ");
                String userin = userScanner.nextLine();
                System.out.println("\n");
                // first he would need to clean since it makes a mess
                if (userin.toLowerCase().equals("yes") ) {
                    System.out.println("Baby is cleaned ");
                    testBaby4.cleanBaby();
                    // limit lowered
                    limit--;
                }
                System.out.println("Feed the baby? Yes/No ");
                String userin2 = userScanner.nextLine();
                System.out.println("\n");
                // also need to refeed as he just emptied the stomach
                if (userin2.toLowerCase().equals("yes")) {
                    System.out.println("Baby is fed ");
                    testBaby4.feedBaby();
                    // limit lowered
                    limit--;
                }
            }

            // if da baby hungry
            if (hungerChance) {
                // limit is increased
                limit++;
                System.out.println("Da baby is hungry. Feed the baby? Yes/No ");
                String userin2 = userScanner.nextLine();
                System.out.println("\n");
                // clean the baby
                if (userin2.toLowerCase().equals("yes")) {
                    System.out.println("Baby is fed ");
                    testBaby4.feedBaby();
                    limit--;
                }
            }

            // can change the limit, but if the baby isn't cleaned or fed 5 times he dies
            if ((limit > 5)) {
                System.out.println("You neglected the baby and it died");
                testBaby4.died();
                babyList.add(testBaby4);
                babyStats();
                // exit loop
                break;
            }
            
            // If nothing happens and the baby is doing fine
            else {
                System.out.println("\nGood news, " + testBaby4.name + " is chilling");
                System.out.println("Continue? Yes/no");
                System.out.println("\n");
                String userin2 = userScanner.nextLine();
                if (userin2.toLowerCase().equals("yes")) {
                    continue;
                }
                // to end simulation
                else {
                    babyList.add(testBaby4);
                    babyStats();
                    break;
                }
            }
            

        }

    }

    // Just prints the info of the baby
    // Accessor
    public static void babyStats() {
        System.out.println("All the Babys in the test: ");
        System.out.println(" ");
        // cycle through the baby list
        for (int i = 0; i < babyList.size(); i++) {
            System.out.println(babyList.get(i));
            System.out.println(" ");
        }
    }

    // Tests all the functions
    // Accessor
    public static void funcTest() {
        System.out.println ("This tests all the functions; prints name, age, eye color, hair, is clean, is hungry, race, and status");
        System.out.println(babyList.get(3).name);
        System.out.println(babyList.get(3).age);
        System.out.println(babyList.get(3).eyeColor);
        System.out.println(babyList.get(3).hairColor);
        System.out.println(babyList.get(3).isClean);
        System.out.println(babyList.get(3).isHungry);
        System.out.println(babyList.get(3).race);
        System.out.println(babyList.get(3).status);
    }

    // main method
    public static void main(String args[]) {
        // runs the functions
        testBabyJustName();
        testBabyNameAge();
        testWholeBaby();
        comprehensiveTest();
        funcTest();
        // closes scanner for leak management
        userScanner.close();
        // clears list
        babyList.clear();
    }
}
