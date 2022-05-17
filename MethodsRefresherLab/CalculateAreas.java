package MethodsRefresherLab;

import java.util.Scanner;

public class CalculateAreas {
    public static void main(String args[]) {
        userChoice();
    }
    public static void runCircle() {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter radius");
        Double userInput = userScanner.nextDouble();
        System.out.printf("Circle area:  %.2f", Areas.areaCircle(userInput));
        userScanner.close();
    }
    public static void runSquare() {
        Scanner userScanner = new Scanner(System.in);
        userScanner.close();
    }
    public static void runTriangle() {
        Scanner userScanner = new Scanner(System.in);
        userScanner.close();
    }
    public static void runRectangle() {
        Scanner userScanner = new Scanner(System.in);
        userScanner.close();
    }
    public static void runTrapezoid() {
        Scanner userScanner = new Scanner(System.in);
        userScanner.close();
    }
    public static void userChoice() {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter what area you want? Circle, Square, Triangle, Rectangle, Trapezoid, all");
        String userInput = userScanner.nextLine();
        switch(userInput.toLowerCase()) {
            case "circle":
                runCircle();
                userScanner.close();
                break;
            case "square":
                runSquare();
                userScanner.close();
                break;
            case "triangle":
                runTriangle();
                userScanner.close();
                break;
            case "rectangle":
                runRectangle();
                userScanner.close();
                break;
            case "trapezoid":
                runTrapezoid();
                userScanner.close();
                break;
            case "all":
                runCircle();
                runSquare();
                runTrapezoid();
                runTriangle();
                runRectangle();
                userScanner.close();
                break;
            default:
                System.out.println("Enter valid input");
                userChoice();
        }
    }
}