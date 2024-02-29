package week4.question3;

import java.util.HashMap;
import java.util.Map;

public class Leena {
    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static String frequencyOfCharacters(String str) {
        String result = "";

        //For each character, it counts the number of occurrences in the string using a nested loop

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            //if the character is already present in the result string, it continues to the next iteration

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (result.contains(ch + "")) {
                continue;
            }
            result += ch + "" + count;
        }

        return result;
    }

    ////

        public static String frequencyOfChars(String str) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Count the frequency of each character in the string
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (frequencyMap.containsKey(currentChar)) {
                    int frequency = frequencyMap.get(currentChar);
                    frequencyMap.put(currentChar, frequency + 1);
                } else {
                    frequencyMap.put(currentChar, 1);
                }
            }

            // Construct the result string
            String result ="";
            for (char ch : str.toCharArray()) {
                int frequency = frequencyMap.get(ch);

                //to avoid duplicates in result
                if (result.contains(ch + "")) {
                    continue;
                }
                result+=""+ch+frequency;

            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            String output = frequencyOfChars(input);
            System.out.println(output);  // Output: A3B2C1D2
        }
    }

