package week4.question2;

import java.util.Arrays;

public class Oleksandra {

    public static boolean areSameLetters(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if both strings have the same set of characters
        return sortString(str1).equals(sortString(str2));
    }

    private static String sortString(String str) {
        // Convert the string to a char array and sort it
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        // Convert the sorted char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example 1
        String str1 = "ABC";
        String str2 = "CAB";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' build out of the same letters? " + areSameLetters(str1, str2));

        // Example 2
        String str3 = "ABC";
        String str4 = "ABB";
        System.out.println("Are '" + str3 + "' and '" + str4 + "' build out of the same letters? " + areSameLetters(str3, str4));
    }
}

/*
  String - Same letters

Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */