package week4.question1;

import java.util.Arrays;

public class Leena {
   /* ➡️ String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:

    */

    public static boolean same(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings to character arrays for easier manipulation
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted character arrays
        return Arrays.equals(chars1, chars2);
    }
}
