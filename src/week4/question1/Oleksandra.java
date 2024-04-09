package week4.question1;

import java.util.HashMap;
import java.util.Map;

public class Oleksandra {


        public static Map<Character, Integer> calculateCharacterFrequency(String input) {
            // Create a HashMap to store character frequencies
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Convert the input string to uppercase for case-insensitivity
            input = input.toUpperCase();

            // Iterate through each character in the string
            for (char ch : input.toCharArray()) {
                // Use getOrDefault to get the current count or default to 0
                // Increment the count for the current character and put it back into the map
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }

            // Return the map with character frequencies
            return frequencyMap;
        }

        public static void main(String[] args) {
            // Example input string
            String inputString = "AAABBCDD";

            // Calculate character frequencies using the method
            Map<Character, Integer> charFrequencyMap = calculateCharacterFrequency(inputString);

            // Display the character frequencies
            System.out.println("Character Frequency in '" + inputString + "':");
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                System.out.print(entry.getKey() + "" + entry.getValue());
            }
        }
    }


/*
String - Frequency of Characters

Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


