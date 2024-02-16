package week3.question2_reverseNegativeNumber;

public class Nabila {

    public static void main(String[] args) {
        System.out.println(reverseInt(-35)); // -53
    }

    public static int reverseInt (int n) { // -35
        int rev = 0; //

        while (n < 0){ // while n is negative
            int lastDigit = n % 10; // reads the last digit
            rev = rev * 10 + lastDigit; // increase by 10th place each iteration
            n /= 10;
        }
        return rev;
    }

}
    /*
    Write a return method that can reverse digits of a negative number and return it as int

    input: -35  output: -53
  */
