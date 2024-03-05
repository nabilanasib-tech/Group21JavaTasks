package week04.question2;

import java.util.Arrays;

public class Dilmer {

    public static void main(String[] args) {

        System.out.println(sameLetters("Cydeo", "Cydeo"));
        System.out.println(sameLetters("Wooden Spoon", "Wooden Fork"));

    }

    public static boolean sameLetters (String a, String b) {

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="", a2="";
        for(char each: ch1)
            a1 +=each;

        for(char each: ch2)
            a2 +=each;

        return a1.equals(a2) ;

    }


}

/*
  String - Same letters

Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */