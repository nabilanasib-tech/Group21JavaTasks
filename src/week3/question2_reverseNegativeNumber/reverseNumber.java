package week3.question2_reverseNegativeNumber;

import java.util.Scanner;

public class reverseNumber {

    /*
    Write a return method that can reverse digits of a negative number and return it as int

    input: -35  output: -53
  */
    public static int reverseDigits(int number) {
        boolean isNegative = number < 0;

        if (isNegative) {
            number = Math.abs(number);
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }
    public static int reverseDigits2(int number) {
        boolean isNegative = number < 0;

        if (isNegative) {
            number = Math.abs(number);
        }

        String numberString = Integer.toString(number);
        String reversedString = "";
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversedString += numberString.charAt(i);
        }

        int reversedNumber = Integer.parseInt(reversedString);

        return isNegative ? -reversedNumber : reversedNumber;
    }
}
