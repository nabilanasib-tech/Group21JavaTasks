package week3.question2_reverseNegativeNumber;

public class Batdorj {

    public static void main(String[] args) {

        int num = -35;
        int reversedNum = reverseNegativeNumber(num);
        System.out.println("The reversed number is: " + reversedNum);
    }

    public static int reverseNegativeNumber(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Number must be negative");
        }
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;

    }

}
