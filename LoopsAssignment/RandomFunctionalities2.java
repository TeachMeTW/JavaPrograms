package LoopsAssignment;

import java.util.Random;
import java.util.ArrayList;


public class RandomFunctionalities2 {
    
    public static String mixWords(String firstWord, String secondWord) {
        // check if either is empty
        if (firstWord != "" && secondWord != "") {
            // randomizer
            Random rand = new Random();
            // turn them into char array
            char w1[] = firstWord.toCharArray();
            char w2[] = secondWord.toCharArray();
            
            // cycle through word
            for(int i = 0; i<w1.length; i++) {
                // get a random index and replace/swap
                int r = rand.nextInt(w1.length);
                char tmp = w1[i];
                w1[i]=w1[r];
                w1[r]=tmp;
            }
            // new scrambled word
            String scrambledFirst = new String(w1);
            
            // do the same and cycle through word
            for(int j = 0; j<w2.length; j++) {
                // get random index and replace/swap
                int s = rand.nextInt(w2.length);
                char tmp = w2[j];
                w2[j]=w2[s];
                w2[s]=tmp;
            }
    
            String scrambledSecond = new String(w2);
            // combine swapped words
            return "Mixed words: " + scrambledFirst+scrambledSecond;
        }
        // if one is empty
        else {
            if (firstWord == "") {
                return firstWord;
            }
            else {
                return secondWord;
            }
        }

    }   

    public static String switcheroo(String word) {
        // create list of strings since can be multiple chunks of 3
        ArrayList<String> div = new ArrayList<String>();
        Random rand = new Random();
        // empty final string
        String res = "";
        int i = 0;
        // cycles through index
        while(i<word.length()) {
            // adds current letter at index
            res += word.charAt(i);
            // checks if 3 length
            if (res.length() == 3) {
                char w[] = res.toCharArray();
                // I can just call mixwords here.... its basically feeding this back to the first method
                for(int j = 0; j<w.length; j++) {
                    int r = rand.nextInt(w.length);
                    char tmp = w[j];
                    w[j]=w[r];
                    w[r]=tmp;
                }
                String switcher = String.valueOf(w);
                // add switched to array list
                div.add(switcher);
                // reset the vars
                res = "";
                switcher = "";
            }
            i++;
        }
        // if blank add to array
        if (res != "" ) {
            div.add(res);
        }
        String fin = "";
        // combine all from array list
        for (int k = 0; k < div.size(); k++) {
            fin = fin+div.get(k);
        }
        return fin;
    } 

    public static String longestSet(String word) {
        String res = "", temp = "";
        // go through all the indexes
        for (int i = 0; i < word.length(); i++) {
            // store it in a temp
            temp += word.charAt(i);
            // check if index is less than half the length and the stored character exists from last index - current temp index to last index
            if (i < word.length()/2 && temp.equals(word.substring(word.length()-temp.length(), word.length()))) {
                // if it is then that is the longest set repeating non overlap
                res = temp;
            }
        }
        return res;
    }
}
