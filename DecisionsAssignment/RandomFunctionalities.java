package DecisionsAssignment;

public class RandomFunctionalities {
    
    public static String putTogether(String firstWord, String secondWord) {
        
    }

    public static String swapThree(String word) {

    }

    public static boolean overEleven(int first, int second, int third) {

    }

    public static boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static int twentyOne(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber) {
            if (21 - firstNumber > 21 - secondNumber) {
                return secondNumber;
            }
            else {
                return firstNumber;
            }
        }
        else {
            return -1;
        }
    }

}
