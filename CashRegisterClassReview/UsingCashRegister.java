package CashRegisterClassReview;
import java.util.Scanner;
import java.util.*;

public class UsingCashRegister {

    // create global input taker
    public static Scanner userScanner = new Scanner(System.in);
    // create register list for storage/keep track
    public static List<CashRegister> registerList = new ArrayList<CashRegister>();

    public static void testRegisterConstructorBase() {
        System.out.println("\nWe are first testing base constructor");
        // Creates new register
        CashRegister register1 = new CashRegister();
        // adds it to the list
        registerList.add(register1);
        // prints current register stats
        System.out.println(register1);
    }
    public static void testRegisterWithStartingValue() {
        System.out.println("\nWe are testing register with preloaded money. Enter preloaded money:");
        // stores user input of starting value
        double money = userScanner.nextDouble();
        // creates new register passing the money into constructor
        CashRegister register2 = new CashRegister(money);
        // add register to the list
        registerList.add(register2);
        // print register stats
        System.out.println(register2);
    }
    public static void testRegisterFuncs() {
        System.out.println("\nWe are testing register functions");
        // create blank register
        CashRegister register3 = new CashRegister();

        // prompts user to enter cost of item
        System.out.println("\nTesting add item. Enter cost of item: ");
        double money = userScanner.nextDouble();
        // uses the add item function for test
        register3.addItem(money);
        System.out.println(register3);
        System.out.println("\nTesting add another item. Enter cost of item 2: ");
        double money2 = userScanner.nextDouble();
        // uses add item
        register3.addItem(money2);
        System.out.println(register3);

        // prompts user to enter cost of item
        System.out.println("\nTesting remove item. Enter cost of item removed: ");
        double money3 = userScanner.nextDouble();
        // uses remove item to test
        register3.removeItem(money3);
        System.out.println(register3);

        // runs get count to see how many items
        System.out.println("\nTesting get count " + register3.getCount());
        // runs get gash register total to see how much this register has in money
        System.out.println("\nTesting get cash register total " + register3.getCashRegisterTotal());
        // runs get cash register all to see how much all registers have
        System.out.println("\nTesting get all registers " + register3.getAllCashRegisterTotals());

        // tests out clearing this register
        register3.clearSingle();

        System.out.println("\nTesting clear single register " + register3);
        System.out.println("\nPrevious register: " + registerList.get(1));

        // adds this register to list
        registerList.add(register3);

        // lets say register 2 gets an item of 69.42
        System.out.println("\nTesting adding item to register 2");
        registerList.get(1).addItem(69.42);
        System.out.println("\nTesting get count of register 2: " + registerList.get(1).getCount());
        System.out.println("\nTesting get total of register 2: $" + registerList.get(1).getCashRegisterTotal());
        // prints all registers
        System.out.println("\nAll registers: ");
        for (int i = 0; i < registerList.size(); i++) {
            System.out.println(registerList.get(i));
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        testRegisterConstructorBase();
        testRegisterWithStartingValue();
        testRegisterFuncs();
        // closes and clears to prevent memory leaks
        userScanner.close();
        registerList.clear();
    }
}
