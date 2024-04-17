package week4.question2;

import java.util.Arrays;

public class Batdorj {

    public static void main(String[] args) {

        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }
    public static boolean same(String str1, String str2) {
        char[] chars1 = str1.toCharArray ( );
        char[] chars2 = str2.toCharArray ( );

        Arrays.sort (chars1);
        Arrays.sort (chars2);

        return Arrays.equals (chars1, chars2);

    }
}
