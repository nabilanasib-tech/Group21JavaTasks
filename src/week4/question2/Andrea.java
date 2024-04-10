package week4.question2;

import java.util.Arrays;

public class Andrea {
    public static void main(String[] args) {
        System.out.println(sameChars("abc", "acb")); //true
        System.out.println(sameChars("abc", "abb")); //true
    }

    public static boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
/*
  String - Same letters

Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */