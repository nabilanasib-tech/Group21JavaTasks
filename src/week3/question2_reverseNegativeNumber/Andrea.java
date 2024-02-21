package week3.question2_reverseNegativeNumber;
/*
    Write a return method that can reverse digits of a negative number and return it as int
    example: input: -35  output: -53
*/

public class Andrea {
    public static void main(String[] args) {
        System.out.println(reverseDigits(-35));
        System.out.println(reverseDigits(-41));
    }

    public static int reverseDigits(int num) {
        num = num * -1; //makes positive

        int reverse = 0;
        int lastDigit;

        while (num >= 1) {
            lastDigit = num % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // gets rid of last digit
        }

        return reverse * -1; //makes negative again
    }
}

