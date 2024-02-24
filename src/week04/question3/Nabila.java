package week04.question3;

import java.util.*;

public class Nabila {

    public static void main(String[] args)
    {
        // Create a string variable with default value
        String str = "today is saturday";
        //call removeDuplicates() method for removing duplicate characters
        removeDuplicates(str);
    }

    public static void removeDuplicates(String str)
    {
        //Create an empty string
        String newstr = new String();

        //calculate length of the original string
        int length = str.length();

        // Traverse the string and check for the repeated characters
        for (int i = 0; i < length; i++)
        {
            // store the character available at ith index in the string
            char charAtPosition = str.charAt(i);

            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resting string
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }
        //Print string after removing duplicate characters
        System.out.println(newstr);
    }

}

/*
 String - Remove Duplicates

Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */