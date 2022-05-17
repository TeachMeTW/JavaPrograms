package MethodsRefresherLab;

import java.util.Scanner;

public class CalculateAreas {
    // create a scanner object in order to get user input
    public static Scanner userScanner = new Scanner(System.in);

    // Circle Scenario
    public static void runCircle() {
        // prompts user to input radius
        System.out.println("\n\nEnter radius of circle: ");
        // stores input - variable init
        Double userInput = userScanner.nextDouble();
        // runs the area calculation from areas class passing in user input
        System.out.printf("\nCircle area:  %.2f", Areas.areaCircle(userInput));
    }

    // Square scenario
    public static void runSquare() {
        // prompts user to input side of square
        System.out.println("\n\nEnter side of square: ");
        // stores input - variable init
        Double userInput = userScanner.nextDouble();
        // runs the area calculation from areas class pasing in user input
        System.out.printf("\nSquare area:  %.2f", Areas.areaSquare(userInput));
    }

    // Triangle Scenario
    public static void runTriangle() {
        // prompts user to input base
        System.out.println("\n\nEnter base of triangle: ");
        // stores input - variable init
        Double userBase = userScanner.nextDouble();
        // prompts user to input height
        System.out.println("Enter height of the triange: ");
        // stores input - variable init
        Double userHeight = userScanner.nextDouble();
        // runs the area calculation from areas class pasing in user input
        System.out.printf("\nTriange area:  %.2f", Areas.areaTriangle(userBase, userHeight));
    }

    // Rectangle Scenario
    public static void runRectangle() {
        // prompts user to input base
        System.out.println("\n\nEnter base of rectangle: ");
        // stores input - variable init
        Double userBase = userScanner.nextDouble();
        // prompts user to input height
        System.out.println("Enter height of rectangle: ");
        // stores input - variable init
        Double userHeight = userScanner.nextDouble();
        // runs the area calculation from areas class pasing in user input
        System.out.printf("\nRectangle area:  %.2f", Areas.areaRectangle(userBase, userHeight));
    }

    // Trapezoid Scenario
    public static void runTrapezoid() {
        // prompts user to input top length
        System.out.println("\n\nEnter top length of trapezoid: ");
        // stores input - variable init
        Double userTop = userScanner.nextDouble();
        // prompts user to input bottom length
        System.out.println("Enter bottom length of trapezoid: ");
        // stores input - variable init
        Double userBottom = userScanner.nextDouble();
        // prompts user to input height
        System.out.println("Enter height of trapezoid: ");
        // stores input - variable init
        Double userHeight = userScanner.nextDouble();
        // runs the area calculation from areas class pasing in user input
        System.out.printf("\nTrapezoid area:  %.2f   ", Areas.areaTrapezoid(userTop, userBottom, userHeight));
    }

    // User prompt
    public static void userChoice() {
        System.out.println("\nEnter what area you want? Circle, Square, Triangle, Rectangle, Trapezoid, all\n");
        String userInput = userScanner.nextLine();
        // Switch statement to determine user option, toLower in order to adapt any cases
        switch(userInput.toLowerCase()) {
            case "circle":
                runCircle();
                break;
            case "square":
                runSquare();
                break;
            case "triangle":
                runTriangle();
                break;
            case "rectangle":
                runRectangle();
                break;
            case "trapezoid":
                runTrapezoid();
                break;
            case "all":
                runCircle();
                runSquare();
                runTrapezoid();
                runTriangle();
                runRectangle();
                break;
            // Default case if user input was invalid, recursively run again until valid
            default:
                System.out.println("Enter valid input");
                userChoice();
        }
    }
    // main method
    public static void main(String args[]) {
        // run user prompt
        userChoice();
        // close scanner so no memory leak
        userScanner.close();
    }
}