package ArraysAssignment;

public class RandomArrayFunctionalities {

    /* Find if an array is a subset of another
     * Do this by checking if numbers in 1 is present in 2
     * @param are 2 number arrays
     * 
     * @return can be boolean but its a print of a subset or not subset
     */

    public static void checkSubset(int numArray1[], int numArray2[]) {
        int count = 0;
        // Cycle through first array
        for (int x : numArray1) {
            // cycle through second array
            for (int y : numArray2) {
                // check if values equal each other
                if (x == y) {
                    // if so up count
                    count++;
                }
            }
        }
        // if count is equal to num 2 length (equal)
        if (count == numArray2.length) {
            int dupCount1 = 0;
            int dupCount2 = 0;
            // check for duplicates in array 1
            for (int i = 0; i < numArray1.length; i++) {
                for(int j = i + 1; j < numArray1.length; j++) {
                    if (numArray1[i] == (numArray1[j])) {
                        dupCount1++;
                    }
                }
            }
            // check for dups in array 2
            for (int i = 0; i < numArray2.length; i++) {
                for(int j = i + 1; j < numArray2.length; j++) {
                    if (numArray2[i] == (numArray2[j])) {
                        dupCount2++;
                    }
                }
            }
            // if dups are the same
            if (dupCount1 == dupCount2) {
                System.out.println("Array 2 is a subset of array 1\n");
            }
            // if mismatch
            else {
                System.out.println("Array 2 is NOT a subset of array 1\n");
            }
            
        }
        else {
            System.out.println("Array 2 is NOT a subset of array 1\n");
        }
    }
    
    /* Repeat word to index decreasing order
     * @param: string word and int starting index
     * @return: can be a string but in this case it just prints
     * 
     */
    public static void repeatNumToBegin(String word, int start) {
        System.out.print("\nRepeating " + word + " from index " + (start) + " to beginning: ");
        // cycle through word till index then print word and negative the index
        for (int i = start; i != 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j));
            }
        }  
    }
}
