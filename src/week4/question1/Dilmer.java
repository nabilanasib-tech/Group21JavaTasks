package week4.question1;

import java.util.HashMap;
import java.util.Map;

public class Dilmer {

    public static void main(String[] args) {

        frequencyOfCharacters("Wooden Spoon");
    }

    public static void frequencyOfCharacters (String str){

        Map<Character, Integer> counter = new HashMap<>(); // key - each char and the value - is the frequency

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if(!counter.containsKey(eachChar)){
                counter.put(eachChar, 0);
            }
            counter.put(eachChar, counter.get(eachChar) + 1);
            
        }

        System.out.println(counter);

    }
}
/*
String - Frequency of Characters

Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

