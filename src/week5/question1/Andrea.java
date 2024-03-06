package week5.question1;

import java.util.Arrays;


public class Andrea {
    public static void main(String[] args) {
        System.out.println(printUnique("AAABBBCCCDEF"));
    }

    public static String printUnique(String str){
        String unique = "";

        for (int i = 0; i < str.length(); i++){// i: index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each) ){// we create a condition where whenever the letter is not equal to any other index will be assigned to the unique variable and will be printed.
                unique += each;
            }
        }
        return unique;
    }
}

/*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
