package week3.question2_reverseNegativeNumber;

public class Oleksandra {

    public static int reverseNegativeNumber(int num){
        //Handle negative sign
        int sign =(num < 0) ? -1 : 1;

        //Remove the negative sign for processing
        num = Math.abs(num);

        //Reverse the digits
        int reversedNumber = 0;
        while(num > 0){
            int digit = num % 10;
            reversedNumber = reversedNumber
                    * 10 + digit;
            num /= 10;
        }
        // Add back the negative sign
        return sign * reversedNumber;
    }
    public static void main(String[] args){
        //Example
        int inputNumber = -35;
        int reversedResult =
                reverseNegativeNumber(inputNumber);
        System.out.println("Original = " + inputNumber);
        System.out.println("Reversed = " + reversedResult);
    }

}
 /*
    Write a return method that can reverse digits of a negative number and return it as int

    input: -35  output: -53
  */