package DecisionsAssignment;

public class RandomFunctionalities {
    
    public static String putTogether(String firstWord, String secondWord) {
        // check if either is blank
        if (firstWord == "" || secondWord == "") {
            // check if one is blank, return non blank
            if (firstWord == "" && secondWord != "") {
                return secondWord;
            }
            // check for non blank and return
            else if (firstWord != "" && secondWord == "") {
                return firstWord;
            }
            // if both blank return
            else {
                return "";
            }
        }
        else {
            //System.out.println(secondWord.charAt(0));
            //System.out.println(firstWord.charAt(firstWord.length()-1));
            // check end of first word and check start of second word, if equal, start at the index after
            if(firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
                return firstWord + secondWord.substring(1);
            }
            // return combined
            else {
                return firstWord+secondWord;
            }
        }
    }

    public static String swapThree(String word) {
        StringBuilder swapper = new StringBuilder();
        // create substring of last 3 letters
        swapper.append(word.substring(word.length()-3));
        // reverse it
        swapper.reverse();
        // return everything but the last 3 + revered last 3
        return word.substring(0, word.length()-3) + swapper;
    }

    public static boolean overEleven(int first, int second, int third) {
        int firstSecond = first+second;
        int secondThird = second + third;
        int firstThird = first+third;

        // check if first 2 greater than third
        if (firstSecond > third) {
            // check if difference greater than or equal to 11
            if (firstSecond - third >= 11) {
                return true;
            }
            else {
                return false;
            }
        }
        // check if first and third greater than second
        else if (firstThird > second) {
            // check if difference greater than or equal to 11
            if (firstThird - second >= 11) {
                return true;
            }
            else {
                return false;
            }
        }
        // check if second and third greater than first
        else if (secondThird > first) {
            // check if difference greater than or equal to 11
            if (secondThird - first >= 11) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        // check if remainder is not 0 when div by 2
        return (number % 2 != 0);
    }

    public static boolean isEven(int number) {
        // check if remainder is 0 when div by 2
        return (number % 2 == 0);
    }

    public static int twentyOne(int firstNumber, int secondNumber) {
        // check if both are the same
        if (firstNumber != secondNumber) {
            // check if either is 21
            if (firstNumber == 21) {
                return firstNumber;
            }
            else if (secondNumber == 21) {
                return secondNumber;
            }
            else {
                // check if equidistant
                if (21 - firstNumber == 21 - secondNumber) {
                    System.out.println("Both equidistant to 21, returning either number");
                    return secondNumber;
                }
                // check which one is closer
                else if (21 - firstNumber > 21 - secondNumber) {
                    return secondNumber;
                }
                else {
                    return firstNumber;
                }
            }
        }
        else {
            return -1;
        }
    }

}
